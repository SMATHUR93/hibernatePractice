package com.shrek.hibernate.app2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Location")
public class Location extends BaseEntity {

	@Column
	private String country;

	@Column
	private String state;

	@Column
	private String city;
	
	@Column
	private String street;

	@Column
	private String houseno;

	@Column
	private String pincode;

}
