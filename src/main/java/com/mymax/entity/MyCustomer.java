package com.mymax.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Table(name="my_customers")
@Data
public class MyCustomer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@OneToOne
	@JoinColumn(name="branch_id", nullable=true)
	private MasterBranch branch;
	
	private String fullName;
	
	@OneToOne
	@JoinColumn(name="id_card_type_id", nullable=true)
	private MasterIdentityType idCardTypeId;
	
	@Column(name="id_card_number")
	private String idCardNumber;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate idCardExpiredDate;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate idCardIssueDate;
	
	private String birthPlace;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate birthDate;	
	
	private String motherName;
	
	@OneToOne
	@JoinColumn(name="education_id", nullable=true)
	private MasterEducation education;
	
	@OneToOne
	@JoinColumn(name="religion_id", nullable=true)
	private MasterReligion religion;
	
	@OneToOne
	@JoinColumn(name="gender_id", nullable=true)
	private MasterGender gender;
	
	@OneToOne
	@JoinColumn(name="marital_status_id", nullable=true)
	private MasterMaritalStatus maritalStatus;
	
	@OneToOne
	@JoinColumn(name="country_id", nullable=true)
	private MasterCountry country;
	
	@OneToOne
	@JoinColumn(name="debtor_group_id", nullable=true)
	private MasterDebtorGroup debtorGroup;
	
	private String mobilePhone;
	
	@OneToOne
	@JoinColumn(name="source_of_fund_id", nullable=true)
	private MasterSourceOfFund sourceOfFund;
	
	@OneToOne
	@JoinColumn(name="occupation_id", nullable=true)
	private MasterOccupation occupation;
	
	private String email;
	
	@OneToOne
	@JoinColumn(name="tax_option_id", nullable=true)
	private MasterTaxOption taxOption;
	
	private String taxNumber;	
	private LocalDate activeDate;
	private LocalTime activeTime;
	
	@OneToOne
	@JoinColumn(name="customer_type_id", nullable=true)
	private MasterCustomerType customerType;
	
	@OneToOne
	@JoinColumn(name="sales_user_id", nullable=true)
	private MasterEmployee salesUser;	
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="myCustomer",cascade = CascadeType.ALL)
	@JsonManagedReference
    public MyCustomerAddress address = new MyCustomerAddress();
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy="myCustomer",cascade = CascadeType.ALL)
	@JsonManagedReference
    public List<MyCustomerProduct> products = new ArrayList<MyCustomerProduct>();
	
}
