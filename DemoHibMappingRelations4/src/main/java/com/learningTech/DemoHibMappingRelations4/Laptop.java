package com.learningTech.DemoHibMappingRelations4;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	public List<Student> getLs() {
		return ls;
	}
	public void setLs(List<Student> ls) {
		this.ls = ls;
	}
	@Id
	private int lid;
	private String lname;
	@ManyToMany
	private List<Student> ls = new ArrayList<Student>();
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
