package com.application.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.SecurityWebFiltersOrder;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authorization.AuthorizationContext;
import org.springframework.security.web.server.context.NoOpServerSecurityContextRepository;

import com.application.security.jwt.config.JwtFilterAuthentication;
import com.application.security.jwt.config.TokenProvider;
import com.application.security.repository.UserDataRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Configuration
@EnableWebFluxSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

	@Bean
	SecurityWebFilterChain springWebFilterChain(ServerHttpSecurity http, TokenProvider tokenProvider,
			ReactiveAuthenticationManager reactiveAuthenticationManager) {
		final String PATH_POSTS = "/posts/**";

		return http.csrf(ServerHttpSecurity.CsrfSpec::disable).httpBasic(ServerHttpSecurity.HttpBasicSpec::disable)
				.authenticationManager(reactiveAuthenticationManager)
				.securityContextRepository(NoOpServerSecurityContextRepository.getInstance())
				.authorizeExchange(it -> it.pathMatchers("/api/**").permitAll().pathMatchers("/auth/**").authenticated()
						.pathMatchers(HttpMethod.GET, PATH_POSTS).permitAll()
						.pathMatchers(HttpMethod.DELETE, PATH_POSTS).hasRole("ADMIN").pathMatchers(PATH_POSTS)
						.authenticated().pathMatchers("/me").authenticated().pathMatchers("/users/{user}/**")
						.access(this::currentUserMatchesPath).anyExchange().permitAll())
				.addFilterAt(new JwtFilterAuthentication(tokenProvider), SecurityWebFiltersOrder.HTTP_BASIC).build();

	}

	private Mono<AuthorizationDecision> currentUserMatchesPath(Mono<Authentication> authentication,
			AuthorizationContext context) {

		return authentication.map(a -> context.getVariables().get("user").equals(a.getName()))
				.map(AuthorizationDecision::new);

	}

	@Bean
	public ReactiveUserDetailsService userDetailsService(UserDataRepository users) {

		return username -> users.findByUsersName(username).map(u -> User.withUsername(u.getUsersName())
				.password(new BCryptPasswordEncoder().encode(u.getUserPassword()))
//						.authorities(u.getRoles().toArray(new String[0])).accountExpired(!u.isActive())
//						.credentialsExpired(!u.isActive()).disabled(!u.isActive()).accountLocked(!u.isActive())
				.build());
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public ReactiveAuthenticationManager reactiveAuthenticationManager(ReactiveUserDetailsService userDetailsService,
			PasswordEncoder passwordEncoder) {
		var authenticationManager = new UserDetailsRepositoryReactiveAuthenticationManager(userDetailsService);
		authenticationManager.setPasswordEncoder(passwordEncoder);
		return authenticationManager;
	}
}
