package com.mymax.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="master_branches")
@Data
public class MasterBranch implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String name;	
	
}
