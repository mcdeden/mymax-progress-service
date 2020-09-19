package com.mymax.exception.rest;

public class CustomJsonProcessingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CustomJsonProcessingException(String message) {
        super(message);
    }

    public CustomJsonProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
