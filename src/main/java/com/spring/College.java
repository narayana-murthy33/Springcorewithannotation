package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class College {
	@Value("55000")
	private int fees;
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getCanteen() {
		return canteen;
	}
	public void setCanteen(String canteen) {
		this.canteen = canteen;
	}
	public String getManagement() {
		return management;
	}
	public void setManagement(String management) {
		this.management = management;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	@Autowired
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	@Override
	public String toString() {
		return "College [fees=" + fees + ", canteen=" + canteen + ", management=" + management + ", classroom="
				+ classroom + "]";
	}
	public College(int fees, String canteen, String management, Classroom classroom) {
		super();
		this.fees = fees;
		this.canteen = canteen;
		this.management = management;
		this.classroom = classroom;
	}
	@Value("nanicanteen")
	private String canteen;
	@Value("${students.management}")
	private String management;
	private Classroom classroom;
	
public College() {
	
}
}
