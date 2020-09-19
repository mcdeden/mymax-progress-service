package com.mymax.exception.rest;

public class MalformUrlException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MalformUrlException(String message) {
        super(message);
    }

    public MalformUrlException(String message, Throwable cause) {
        super(message, cause);
    }
}
