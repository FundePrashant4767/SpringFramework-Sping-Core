package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.bean.StudentBean;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.xml");
		StudentBean student1 = context.getBean(StudentBean.class);
		System.out.println(student1);
//		StudentBean student2 = (StudentBean) context.getBean(StudentBean.class);
//		System.out.println(student2);
		((ClassPathXmlApplicationContext) context).close();

	}
}
