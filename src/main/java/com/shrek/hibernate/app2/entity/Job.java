package com.shrek.hibernate.app2.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Job")
public class Job extends BaseEntity {
	
	@Column
	private String CivilJobOrganisation;

	@Column
	private String CivilJobPosition;

	@Column
	private String CivilJobSalary;

	@Column
	private String Role;
	
	@ManyToMany 
	@JoinTable(name="OfficeSet")
	Set<Location> jobLocation;

}
