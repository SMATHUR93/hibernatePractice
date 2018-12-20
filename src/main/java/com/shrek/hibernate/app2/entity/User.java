package com.shrek.hibernate.app2.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="User")
public class User extends BaseEntity implements Serializable {     	

	@Column(name = "USER_NAME", nullable = true)
	private String UserName;

	@Column(name = "FIRST_NAME", nullable = true)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = true)
	private String LastName;

	@Column(name = "DATE_OF_BIRTH", nullable = true)
	private String DateOfBirth;

	@Column(name = "GENDER", nullable = true)
	private String Gender;

	@Column(name = "PASSWORD", nullable = true)
	private String Password;

	@Column(name = "PHONE_NUMBER", nullable = true)
	private String PhoneNumber;

	@Column(name = "EMAIL", nullable = true)
	private String Email;	

	@ManyToMany 
	@JoinTable(name="SkillSet")
	Set<Skill> Skill;	

	@ManyToMany
	@JoinTable(name="EquipmentSet")
	Set<Equipment> Equipment;	
	
	@ManyToMany 
	@JoinTable(name="AddressSet")
	Set<Address> addresses;
	
	@ManyToMany 
	@JoinTable(name="CivilJobHistory")
	Set<Job> employmentHistory;
	
}