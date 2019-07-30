package com.jack.spring;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGetBean {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = cxt.getBean("person", Person.class);
		Food food = cxt.getBean("food", Food.class);
		System.out.println(ToStringBuilder.reflectionToString(food, ToStringStyle.JSON_STYLE));
		System.out.println(ToStringBuilder.reflectionToString(person, ToStringStyle.JSON_STYLE));
	}
}
