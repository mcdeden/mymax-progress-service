package com.mymax.exception.rest;

public class NIKDuplicationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NIKDuplicationException(String message) {
        super(message);
    }

    public NIKDuplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}