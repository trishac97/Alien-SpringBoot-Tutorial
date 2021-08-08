package com.alien.demo;

import org.springframework.stereotype.Component;

@Component //Search by type
//@Component("lap1") -->Search object by name
public class Laptop {

	private int lid;
	private String brand;
		
	public Laptop() {
		super();
	}

	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void compile() {
		System.out.println("Compiling...");
	}
	
	
}
