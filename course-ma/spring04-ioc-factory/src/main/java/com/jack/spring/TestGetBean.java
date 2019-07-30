package com.jack.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGetBean {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
//		try {
//			Car car = CarFactory.getCar("audi");
//			System.out.println(car.getName());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		Car car = cxt.getBean("car", Car.class);
		System.out.println(car.getName());
	}
}
