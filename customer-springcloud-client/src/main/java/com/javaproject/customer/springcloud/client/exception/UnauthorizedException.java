package com.javaproject.customer.springcloud.client.exception;

public class UnauthorizedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public UnauthorizedException() {
		super();
	}
	
	public UnauthorizedException(String errorMessage) {
		super(errorMessage);
	}
	
	public UnauthorizedException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}
}