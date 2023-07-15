package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="APP_PLANS")
public class AppPlanEntity {
	
	@Id
	@Column(name="PLAN_ID")
	private int planId;
	
	@Column(name="PLAN_NAME")
    private String planName;
	
	@Column(name="PLAN_START_DATE")
    private Date planStartDate;
	
	@Column(name="PLAN_END_DATE")
    private Date planEndDate;
	
	@Column(name="CATEGORY_ID")
    private int categoryId;
	
	@Column(name="ACTIVE_SW")
    private char activeSw;
	
	@Column(name="CREATED_DATE")
    private Date createdDate;
	
	@Column(name="UPDATED_DATE")
    private Date updatedDate;
	
	@Column(name="CREATED_BY")
    private String createdBy;
	
	@Column(name="UPDATED_BY")
    private String updatedBy;

	


}
