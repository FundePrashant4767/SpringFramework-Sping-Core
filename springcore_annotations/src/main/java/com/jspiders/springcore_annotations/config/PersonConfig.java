package com.jspiders.springcore_annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jspiders.springcore_annotations.bean.PersonBean;

@ComponentScan(basePackages = "com.jspiders.springcore_annotations")
public class PersonConfig {
	@Bean("Person1")
	public PersonBean getPerson() {
		return new PersonBean();

	}
}
