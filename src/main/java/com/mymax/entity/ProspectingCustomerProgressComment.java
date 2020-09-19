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
@Table(name="prospecting_customer_progress_comments")
@Data
public class ProspectingCustomerProgressComment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@OneToOne
    @JoinColumn(name = "prospecting_customer_progress_id")
    private ProspectingCustomerProgress progress;
	
	@OneToOne
    @JoinColumn(name = "comment_user_id")
    private MasterEmployee user;
	
	private LocalDate commentDate;
	private LocalTime commentTime;

	private String comment;	
	
}
