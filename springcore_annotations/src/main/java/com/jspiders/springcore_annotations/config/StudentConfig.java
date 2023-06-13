package com.jspiders.springcore_annotations.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcore_annotations.bean.StudentBean;

public class StudentConfig {
	@Bean("student1")
	public StudentBean getStudent() {

		return new StudentBean();

	}
}
