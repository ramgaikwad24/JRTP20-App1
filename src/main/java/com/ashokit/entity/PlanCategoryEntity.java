package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="PLAN_CATEGORY_MASTER")
@Entity
public class PlanCategoryEntity
{
	@Id
	@Column(name="CATEGORY_ID")
	private int categoryId;
	
	@Column(name="CATEGORY_NAME")
	private String categoryName;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;
		
	

}
