package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collegedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigFile.class);
		College college=context.getBean("college",College.class );
		//System.out.println("collegefees:"+college.getFees());
		//System.out.println("collegestudents:"+college.getClassroom().getStudents());
		//System.out.println("collegecanteen:"+college.getCanteen());
		//System.out.println("collegemanagement"+college.getManagement());
		System.out.println(college.getClassroom().getClassname());

	}

}
