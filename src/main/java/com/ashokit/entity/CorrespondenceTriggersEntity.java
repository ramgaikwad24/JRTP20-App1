package com.ashokit.entity;



import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="CO_TRIGGERS")
@Entity
public class CorrespondenceTriggersEntity 
{
	@Id
	@Column(name="TRG_ID")
	private int trgId;
	
	@Column(name="CASE_NUM")
	private int caseNum;
	
	@Column(name="TRG_STATUS")
	private char trgStatus;
	
	@Column(name="NOTICE")
	private Blob notice;
}
