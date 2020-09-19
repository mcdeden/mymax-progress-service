package com.mymax.exception.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MissingServletRequestPartException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MissingServletRequestPartException(String message) {
        super(message);
    }

    public MissingServletRequestPartException(String message, Throwable cause) {
        super(message, cause);
    }
}
