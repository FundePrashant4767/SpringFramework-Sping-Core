package com.jspiders.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.bean.EmployeeBean;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeconfig.xml");
		EmployeeBean employee1 = (EmployeeBean) context.getBean("employee1");
		System.out.println(employee1);
		EmployeeBean employee2 = (EmployeeBean) context.getBean("employee2");
		System.out.println(employee2);
		((ClassPathXmlApplicationContext) context).close();
	}
}
