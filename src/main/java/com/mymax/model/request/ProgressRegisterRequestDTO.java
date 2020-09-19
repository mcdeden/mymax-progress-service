package com.mymax.model.request;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ProgressRegisterRequestDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	
	@NotBlank(message="is required.")
	@Pattern(regexp = "^[0-9]*$",message = "should be number.")
	@Size(min=16, max=16, message="must be 16 characters long.")
	private String prospectingCustomerId;
	
	@NotBlank(message="is required.")
	@Size(min=2, max=2, message="must be 2 character long.")
	private String prospectingStatusId;	
	
	@NotBlank(message="is required.")
	@Size(min=3, max=200, message="must be 3-200 characters long.")
	private String note;	
	
}
