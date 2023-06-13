package com.jspiders.springcore_annotations.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class StudentBean {
	@Value("1")
int id;
	@Value("Parshu")
	
String name;
	@Value("parshu@gmail.com")
String email;
}
