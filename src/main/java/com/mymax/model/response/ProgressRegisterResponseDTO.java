package com.mymax.model.response;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class ProgressRegisterResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String progressId;
	private String prospectingCustomerId;
	private LocalDate prospectingDate;
	private LocalTime prospectingTime;
	private String prospectingStatusId;	
	private String prospectingStatusDescription;
	private String note;	
	
}
