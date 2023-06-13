package com.jspiders.springcore_annotations.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AadharBean {
	@Value("1")
int id;
	@Value("831063748583")
String aadhar_no;
	@Value("15-june-2016")
String date_of_issue;
}
