package com.shrek.hibernate.app2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MissionMembers")	
public class MissionMembers extends BaseEntity {
		
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="UserId")
	User user;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MissionId")	
	Mission mission;
	
	@Column
	private String TeamRole;	
}