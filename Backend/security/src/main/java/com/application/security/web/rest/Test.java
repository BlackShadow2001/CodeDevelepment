package com.application.security.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.security.repository.UserDataRepository;

import lombok.AllArgsConstructor;

@RequestMapping("/auth")
@RestController
@AllArgsConstructor
public class Test {

	private final UserDataRepository userDataRepository;

	@GetMapping("/get")
	public String s() {

		return "Test the security";
	}

}
