package com.jspiders.springcore_annotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore_annotations.bean.StudentBean;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("StudentConfig.class");

		StudentBean student = (StudentBean) context.getBean(StudentBean.class);

		System.out.println(student);

		((AnnotationConfigApplicationContext) context).close();
	}
}
