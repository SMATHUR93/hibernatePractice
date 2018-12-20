package com.shrek.hibernate.app2.entity;
	
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address extends BaseEntity {

	@ManyToMany
	@JoinTable(name = "AddressLocationSet")
	Set<Location> location;

	@Column
	private String StartDate;

	@Column
	private String EndDate;

}
