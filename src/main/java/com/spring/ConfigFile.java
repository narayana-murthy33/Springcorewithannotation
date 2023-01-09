package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring")
public class ConfigFile {
	@Bean
	public College getCollegeobj() {
		return new College();
	}
	@Bean
	public Classroom getClassroomobj() {
		return new Classroom();
	}

}
