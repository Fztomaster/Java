package com.jack.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private String name;
	
	private int age;
	
	private Food food;
	
	private List<String> list;
	
	private Set<String> set;
	
	private Map<String, String> map;
	
	private Properties properties;
	
	private String[] array;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age, Food food) {
		super();
		this.name = name;
		this.age = age;
		this.food = food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}
	
}
