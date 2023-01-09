package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		//Airtel airtel=(Airtel)context.getBean("airtel");
		//airtel.calling();
		Sim sim=context.getBean("sim",Sim.class);
		sim.calling();
		//property tag initialize through setter and constrctor-arg tag initiazlize through constructer in spring bean tag
		//autowire is used for injecting object dependency implicitly(byType,byName,byConstructor)
		Students student=context.getBean("student",Students.class);
		System.out.println("student marks:"+student.getMarks());
		System.out.println("student adress:"+student.getAdress().getStreet());
		System.out.println(student);

	}

}
