package com.application.security.jwt.config;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Component
@RequiredArgsConstructor
public class JwtFilterAuthentication implements WebFilter {

	private final String AUTHORIZATION = "Authorization";

	private final String BEARER = "Bearer ";

	private final TokenProvider tokenProvider;

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
		System.out.println(exchange);
		String jwt = resolveToken(exchange.getRequest());
		if (StringUtils.hasText(jwt) && this.tokenProvider.validateToken(jwt)) {
			return Mono.fromCallable(() -> this.tokenProvider.getAuthentication(jwt))
					.subscribeOn(Schedulers.boundedElastic()).flatMap(authentication -> chain.filter(exchange)
							.contextWrite(ReactiveSecurityContextHolder.withAuthentication(authentication)));
		}
		return chain.filter(exchange);
	}

	private String resolveToken(ServerHttpRequest serverHttpRequest) {

		String bearerToken = serverHttpRequest.getHeaders().getFirst(AUTHORIZATION);
		if (StringUtils.hasText(bearerToken) && bearerToken.startsWith(BEARER))
			return bearerToken.substring(7);
		return null;
	}
}
