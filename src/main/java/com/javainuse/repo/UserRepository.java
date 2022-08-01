package com.javainuse.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.JwtRequest;

public interface UserRepository extends JpaRepository<JwtRequest, Long>{

	JwtRequest findByUsername(String username);

}
