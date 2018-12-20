package com.shrek.hibernate.app2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Equipment")
public class Equipment extends BaseEntity {
	
	@Column
    private String EquipmentName;
	
	@Column
    private String EquipmentDescription;

	@Column
    private String EquipmentRating;	
}