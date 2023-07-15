package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Table(name="CITIZEN_GRADUATION_DTLS")
@Entity
public class CitizenGradutionDtlsEntity 
{	
	
	@Id
	@Column(name="GRADUATION_ID")
	private int graduationId;
	
	@Column(name="CASE_NUM")
	private int caseNum;
	
	@Column(name="HIGHEST_DEGREE")
	private String highestDegree;
	
	@Column(name="GRADUATION_YEAR_ID")
	private int graduationYearId;
	
	@Column(name="UNIVERSITY")
	private String university;
	
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

}
