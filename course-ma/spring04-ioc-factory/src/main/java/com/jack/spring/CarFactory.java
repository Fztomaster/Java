package com.jack.spring;

public class CarFactory {
	
	public CarFactory() {
		super();
		System.out.println("carFactory...");
	}
	
	public static Car getCar(String carType) throws Exception {
		if ("audi".equals(carType)) {
			return new Audi();
		} else if ("bmw".equals(carType)) {
			return new BMW();
		} else {
			throw new Exception("没有这种类型的车");
		}
	}
	
}
