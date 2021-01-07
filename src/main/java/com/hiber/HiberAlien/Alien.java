package com.hiber.HiberAlien;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.cfg.Configuration;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
	
	@Id
	public int aid;
	public MyName name;
	public String color;
//	@OneToOne
//	private Lapy laptop;
//	
	@ManyToMany
	private List<Lapy> laptop=new ArrayList<Lapy>();
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public MyName getName() {
		return name;
	}
	public void setName(MyName name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	
	
	
	public List<Lapy> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Lapy> laptop) {
		this.laptop = laptop;
	}
	//we do not want to print hashcode but the string itself
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", color=" + color + "]";
	}
	
    	
	
}
