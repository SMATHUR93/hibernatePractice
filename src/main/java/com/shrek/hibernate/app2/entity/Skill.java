package com.shrek.hibernate.app2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Skill")
public class Skill extends BaseEntity {
	
	@Column
    private String SkillName;
	
	@Column
    private String SkillDescription;

	@Column
    private String SkillRating;	
}