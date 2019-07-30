package com.jack.spring;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGetBean {

	public static void main(String[] args) {
		// test1();
		test2();
	}
	
	public static void test1() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) ctx.getBean("person");
		Food food = ctx.getBean("food", Food.class);
		food.setName("香蕉");
		person.setName("jack");
		person.setAge(18);
		person.setFood(food);
//		System.out.println(person.getName());
//		System.out.println(person.getAge());
		System.out.println(ToStringBuilder.reflectionToString(person));
	}
	
	public static void test2() { 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 引入多个xml文件
		// ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", "appcliationContext-service.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(ToStringBuilder.reflectionToString(person, ToStringStyle.JSON_STYLE));
	}
}
