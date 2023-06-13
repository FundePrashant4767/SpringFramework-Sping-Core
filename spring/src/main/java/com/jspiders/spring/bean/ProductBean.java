package com.jspiders.spring.bean;

import java.util.List;

import lombok.Data;

@Data
public class ProductBean {
int id;
String name;
int price;
List<UserBean> users;
}
