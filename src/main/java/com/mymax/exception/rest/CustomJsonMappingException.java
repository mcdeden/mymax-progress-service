package com.mymax.exception.rest;

public class CustomJsonMappingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CustomJsonMappingException(String message) {
        super(message);
    }

    public CustomJsonMappingException(String message, Throwable cause) {
        super(message, cause);
    }
}
