package com.alien.demo;

import org.springframework.stereotype.Component;

//Learn difference between component bean

@Component
public class Alien {
	private int aid;
	private String aname;
	private String atech;
	
	
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
	}
	
}
