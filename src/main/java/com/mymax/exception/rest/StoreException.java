package com.mymax.exception.rest;

public class StoreException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public StoreException(String message) {
        super(message);
    }

    public StoreException(String message, Throwable cause) {
        super(message, cause);
    }
}