package com.jack.spring;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGetBean {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = cxt.getBean("person", Person.class);
		System.out.println(ToStringBuilder.reflectionToString(person, ToStringStyle.JSON_STYLE));
		Person person2 = cxt.getBean("person-p", Person.class);
		System.out.println(ToStringBuilder.reflectionToString(person2, ToStringStyle.JSON_STYLE));
		Person person3 = cxt.getBean("person-c", Person.class);
		System.out.println(ToStringBuilder.reflectionToString(person3, ToStringStyle.JSON_STYLE));
	}
}
