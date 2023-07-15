package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "CITIZEN_APPS")
@Entity
public class CitizenAppEntity {
	@Id
	@Column(name = "CASE_NUM")
	private int caseNum;

	@Column(name = "FULLNAME")
	private String fullName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "MOBILE_NUM")
	private int mobileNumber;

	@Column(name = "GENDER")
	private char gender;

	@Column(name = "DOB")
	private Date dateOfBirth;

	@Column(name = "SSN")
	private int ssn;

	@Column(name = "ACTIVE_SW")
	private char activeSw;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;
}
