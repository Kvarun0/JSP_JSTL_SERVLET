package com.servlet;


public class Object_For_jstl {
	
	private String name;
	private int rollNo;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Object_For_jstl(int rollNo,String name) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Object_For_jstl [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	
}
