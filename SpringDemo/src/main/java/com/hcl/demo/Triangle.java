package com.hcl.demo;

public class Triangle {
	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void draw(){
		System.out.println(getType() + "Drawn");
	}
}
