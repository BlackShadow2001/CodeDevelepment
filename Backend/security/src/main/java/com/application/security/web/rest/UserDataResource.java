package com.application.security.web.rest;

import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.security.domain.Role;
import com.application.security.domain.UserData;
import com.application.security.jwt.config.TokenProvider;
import com.application.security.repository.UserDataRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@RequestMapping("/api")
@RestController
@AllArgsConstructor
public class UserDataResource {

	private final UserDataRepository userDataRepository;

	private final TokenProvider tokenProvider;

	private final ReactiveAuthenticationManager authenticationManager;

	@PostMapping("/save")
	public Mono<UserData> s() {

		return userDataRepository.save(UserData.builder().usersName("New").userPassword("new@21").email("new@gmail.com")
				.role(Role.USER).build());
	}

	@GetMapping("/token/{username}/{password}")
	public Mono<String> getToken(@PathVariable String username, @PathVariable String password) {
		return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password))
				.map(Authentication::getName).map(this.tokenProvider::GenerateToken);
	}
}
