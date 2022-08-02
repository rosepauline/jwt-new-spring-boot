package com.javainuse.exception;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
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
