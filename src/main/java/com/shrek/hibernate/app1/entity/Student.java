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
@Table(name = "STUDENT")
public class Student extends User implements Serializable  {
	
	@Column(name="STUDENT_HOBBY")
	private String studentHobby;	

	@OneToOne
	@JoinColumn(name = "CLASS", referencedColumnName = "ID")
	private Class studentClass;
		
	@ManyToMany
	@JoinTable(name="STUDENT_SUBJECTS")
	private Set<Subject> subjects;	
}
