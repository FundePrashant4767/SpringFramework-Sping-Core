package com.jspiders.springcore_annotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore_annotations.bean.PersonBean;

public class PersonMain {

	public static void main(String[] args) {
		try {
		ApplicationContext context = new AnnotationConfigApplicationContext("PersonConfig.class");
		PersonBean person1 = (PersonBean) context.getBean("Person1");
		System.out.println(person1);
		((AnnotationConfigApplicationContext) context).close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
