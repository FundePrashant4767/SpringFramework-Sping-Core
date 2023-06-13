package com.jspiders.springcore_annotations.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PersonBean {
	@Value("1")
	int id;
	@Value("Parshu")
	String name;
	@Value("parshu@gmail.com")
	String email;
	@Autowired
	AadharBean aadhar;

}
