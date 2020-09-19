package com.mymax.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Table(name="my_customer_addresses")
@Data
public class MyCustomerAddress implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@OneToOne
    @JoinColumn(name = "my_customer_id")
    @JsonBackReference
    private MyCustomer myCustomer;
	
	@Column(name="id_card_address")
	private String idcAddress;
	
	@Column(name="id_card_address_village")
	private String idcAddressVillage;
	
	@Column(name="id_card_address_subdistrict")
	private String idcAddressSubdistrict;
	
	@OneToOne
	@JoinColumn(name="id_card_address_city_id", nullable=true)
	private MasterCity idcAddressCity;
	
	@OneToOne
	@JoinColumn(name="id_card_address_province_id", nullable=true)
	private MasterProvince idcAddressProvince;
	
	@Column(name="id_card_address_postal_code")
	private String idcAddressPostalCode;	
	
}
