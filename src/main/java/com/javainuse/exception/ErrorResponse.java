package com.javainuse.exception;

import java.time.ZonedDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	private String message;
	private Throwable throwable;
	private HttpStatus httpStatus;
	private ZonedDateTime timeStamp;
	private int errorCode;

	public ErrorResponse() {
		// TODO Auto-generated constructor stub
	}

	public ErrorResponse(Throwable ex, HttpServletRequest req) {
		this.message = ex.getMessage();
		this.throwable = ex;
		this.httpStatus = HttpStatus.BAD_REQUEST;
//		this.timeStamp = timeStamp;
//		this.errorCode = errorCode;
	}

	public ErrorResponse(String string) {
		this.message = string;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public ZonedDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(ZonedDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}