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
@Table(name="prospecting_customers")
@Data
public class ProspectingCustomer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private LocalDate inputDate;
	private LocalTime inputTime;
	private String idCardNumber;
	private String fullName;
	private String address;		
	private String birthPlace;
	private LocalDate birthDate;	
	
	@OneToOne
	@JoinColumn(name="religion_id", nullable=true)
	private MasterReligion religion;
	
	@OneToOne
	@JoinColumn(name="gender_id", nullable=true)
	private MasterGender gender;
	
	@OneToOne
	@JoinColumn(name="marital_status_id", nullable=true)
	private MasterMaritalStatus maritalStatus;
	
	private String mobilePhone;
	
	@OneToOne
	@JoinColumn(name="occupation_id", nullable=true)
	private MasterOccupation occupation;
	
	private String email;
	
	@OneToOne
	@JoinColumn(name="customer_type_id", nullable=true)
	private MasterCustomerType customerType;
	
	private String latitude;
	private String longitude;
	
	@OneToOne
	@JoinColumn(name="sales_user_id", nullable=true)
	private MasterEmployee salesUser;
	
	@OneToOne
	@JoinColumn(name="current_status_id", nullable=true)
	private MasterProspectingStatus currentStatus;	
	
}
