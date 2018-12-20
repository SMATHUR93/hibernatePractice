package com.shrek.hibernate.app2.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Mission")
public class Mission extends BaseEntity {		
	
	@Column
    private String MissionCodeName;
	
	@Column
    private String MissionObjective;
	
	@Column
    private String MissionStartDate;
	
	@Column
    private String MissionEndDate;
	
	@ManyToMany 
	@JoinTable(name="MissionLocationSet")
	Set<Location> location;
}