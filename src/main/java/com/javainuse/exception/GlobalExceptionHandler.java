package com.javainuse.exception;

import java.io.IOException;
import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.service.spi.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//@EnableWebMvc
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = {Throwable.class })
    @ResponseBody
    ResponseEntity<Object> handleControllerException(HttpServletRequest req, Throwable ex) {
//		,  NoHandlerFoundException noex, HttpHeaders headers, HttpStatus status, WebRequest request
        ErrorResponse errorResponse = new ErrorResponse(ex, req);
        return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
    }
	
//	@ExceptionHandler(DataNotFoundException.class)
//	public ResponseEntity<Object> handleNotFound(DataNotFoundException ex) {
//	    return new ResponseEntity<>(null, HttpStatus.NOT_FOUND); // Or HttpStatus.NO_CONTENT
//	}

	
}
