package com.mymax.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="prospecting_customer_progresses")
@Data
public class ProspectingCustomerProgress implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@OneToOne
    @JoinColumn(name = "prospecting_customer_id")
    private ProspectingCustomer customer;
	
	private LocalDate prospectingDate;
	private LocalTime prospectingTime;
	
	@OneToOne
	@JoinColumn(name="prospecting_status_id", nullable=true)
	private MasterProspectingStatus prospectingStatus;

	private String note;	
	
}
