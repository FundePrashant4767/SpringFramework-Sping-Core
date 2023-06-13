package com.jspiders.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.bean.ProductBean;
import com.jspiders.spring.bean.UserBean;

public class UserMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("userconfig.xml");
		UserBean user = (UserBean) context.getBean("product1");
		System.out.println(user);
		((ClassPathXmlApplicationContext) context).close();
	}
}
