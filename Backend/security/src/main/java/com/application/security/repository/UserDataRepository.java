package com.application.security.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.stereotype.Repository;

import com.application.security.domain.UserData;

import reactor.core.publisher.Mono;

@Repository
@EnableR2dbcRepositories
public interface UserDataRepository extends R2dbcRepository<UserData, Long> {

	Mono<UserData> findByUsersName(String username);

}
