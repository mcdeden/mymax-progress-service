package com.mymax.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="master_employees")
@Data
public class MasterEmployee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String salesName;
	
	@OneToOne
	@JoinColumn(name = "branch_id", nullable = true)
	private MasterBranch branch;

}
