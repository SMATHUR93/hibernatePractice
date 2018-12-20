package com.shrek.hibernate.app1.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "TEACHER")
public class Teacher extends User implements Serializable {	
	
	@Column(name="TEACHER_HOBBY")
	private String teacherHobby;
	
	@OneToOne
	@JoinColumn(name="SUBJECT",referencedColumnName="ID")
	private Subject subject;
	
	@ManyToMany
	@JoinTable(name="TEACHERS_CLASSES")
	private Set<Class> teachersClasses;
	
}