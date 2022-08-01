package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.javainuse.config.JwtTokenUtil;
import com.javainuse.exception.ErrorResponse;
import com.javainuse.model.JwtRequest;
import com.javainuse.repo.UserRepository;
import com.javainuse.service.JwtUserDetailsService;

@RestController
@CrossOrigin()
public class HelloWorldController {

	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private UserRepository userRepository;

	@GetMapping({ "/user/{username}/{token}" })
	public ResponseEntity user(@PathVariable("username") String username, @PathVariable("token") String token) {
		JwtRequest user = userRepository.findByUsername(username);
		if(user != null) {
			user.setPassword(null);
			if (user.getToken().equals(token)) {
				return new ResponseEntity(user, HttpStatus.OK);
			} else {
				ErrorResponse errRes = new ErrorResponse("InvalidToken");
				return new ResponseEntity(errRes, HttpStatus.BAD_REQUEST);
			}
		}else {
			ObjectNode jsonObject = objectMapper.createObjectNode();
			jsonObject.put("statusCode", 404);
			jsonObject.put("message", "User Not Found");
			return new ResponseEntity(jsonObject, HttpStatus.NOT_FOUND);
		}
		
	}

}
