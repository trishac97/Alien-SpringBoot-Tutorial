package com.alien.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Learn difference between component bean

@Component
public class Alien {
	
	private int aid;
	private String aname;
	private String atech;
	@Autowired //Server object by type
	//@Qualifier("lap1") -->Search object by name
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Alien() {
		super();
		System.out.println("Alien object created..");
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAtech() {
		return atech;
	}
	public void setAtech(String atech) {
		this.atech = atech;
	}
	
	public void show() {
		System.out.println("Printing from show function");
		laptop.compile();
	}
	
}
