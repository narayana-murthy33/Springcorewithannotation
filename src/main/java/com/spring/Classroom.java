package com.spring;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Classroom {
	//@Value("78")
   private int Students;
	@Value("ece")
   private String classname;
@Override
public String toString() {
	return "Classroom [Students=" + Students + ", classname=" + classname + "]";
}
public int getStudents() {
	return Students;
}
@Required
public void setStudents(int students) {
	Students = students;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}
public Classroom() {
	
}

}
