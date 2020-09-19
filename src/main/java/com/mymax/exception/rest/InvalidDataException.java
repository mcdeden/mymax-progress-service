package com.mymax.exception.rest;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

public class InvalidDataException extends ConstraintViolationException  {

	public InvalidDataException(Set<? extends ConstraintViolation<?>> constraintViolations) {
		super(constraintViolations);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	


	
}
