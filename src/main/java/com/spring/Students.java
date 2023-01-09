package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Students {
	
	public Students(int id, String name, String marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + ", adress=" + adress + "]";
	}

	private int id;
	private String name;
	private String marks;
	private Adress adress;
	public Adress getAdress() {
		return adress;
	}
    @Autowired
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Students(int id, String name, String marks, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.adress = adress;
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
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public Students() {
		
	}

}
