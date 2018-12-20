package com.shrek.hibernate.app1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "SUBJECT")
public class Subject extends BaseEntity implements Serializable{
	
	@Column(name = "SUBJECT_NAME", nullable = true)
	private String subject;
	
}
