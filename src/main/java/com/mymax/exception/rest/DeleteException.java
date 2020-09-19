package com.mymax.exception.rest;

public class DeleteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DeleteException(String message) {
        super(message);
    }

    public DeleteException(String message, Throwable cause) {
        super(message, cause);
    }
}