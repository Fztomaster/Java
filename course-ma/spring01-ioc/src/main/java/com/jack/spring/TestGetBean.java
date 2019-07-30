package com.jack.spring;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGetBean {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person1 = cxt.getBean("person", Person.class);
		Person person2 = cxt.getBean("personName1", Person.class);
		Person person3 = cxt.getBean("personName2", Person.class);
		Person person4 = cxt.getBean("personAlias", Person.class);
		System.out.println(ToStringBuilder.reflectionToString(person1, ToStringStyle.JSON_STYLE));
		System.out.println(ToStringBuilder.reflectionToString(person2, ToStringStyle.JSON_STYLE));
		System.out.println(ToStringBuilder.reflectionToString(person3, ToStringStyle.JSON_STYLE));
		System.out.println(ToStringBuilder.reflectionToString(person4, ToStringStyle.JSON_STYLE));
	}
}
