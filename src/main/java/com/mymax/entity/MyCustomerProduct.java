package com.mymax.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Table(name="my_customer_products")
@Data
public class MyCustomerProduct implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@ManyToOne
    @JoinColumn(name = "my_customer_id")
    @JsonBackReference
    private MyCustomer myCustomer;
	
	@OneToOne
	@JoinColumn(name="product_id", nullable=true)
	private MasterProduct product;
	
	private LocalDate startDate;
	private LocalDate endDate;
	
	@OneToOne
	@JoinColumn(name="status_id", nullable=true)
	private MasterProductStatus productStatus;

}
