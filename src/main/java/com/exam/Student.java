package com.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@Column
	int id;
	
	@Column
	String name;
	
	@Column
	String division;
	
	@Column
	int maths;
	
	@Column
	int physics;
	
	@Column
	int chemestry;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String division, int maths, int physics, int chemestry) {
		super();
		this.id = id;
		this.name = name;
		this.division = division;
		this.maths = maths;
		this.physics = physics;
		this.chemestry = chemestry;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemestry() {
		return chemestry;
	}
	public void setChemestry(int chemestry) {
		this.chemestry = chemestry;
	}
	
}
