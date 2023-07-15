package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="CITIZEN_PLANS")
@Entity
public class CitizenPlansEntity {
	
	@Id
	@Column(name="CITIZEN_ID")
	private int citizenId;
	
	@Column(name="CASE_NUM")
	private int caseNum;
	
	@Column(name="PLAN_ID")
	private int planId;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

}
