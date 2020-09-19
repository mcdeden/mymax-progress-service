package com.mymax.exception.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DataTypeParseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataTypeParseException(String message) {
        super(message);
    }

    public DataTypeParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
