package com.hiber.HiberAlien;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Lapy {
	
	@Id
	private int lid;
	private String lname;
	
	@ManyToMany
	private List<Alien> ally=new ArrayList<Alien>();

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

	public List<Alien> getAlly() {
		return ally;
	}

	public void setAlly(List<Alien> ally) {
		this.ally = ally;
	}

		
	

}
