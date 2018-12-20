package com.shrek.hibernate.app1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CLASS")
public class Class extends BaseEntity implements Serializable{
	
	@Column(name = "CLASS_NAME", nullable = true)
	private String className;

	@Column(name = "ROOM_NUMBER", nullable = true)
	private String roomNumber;
	
}