package com.google;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		//String[] configLocations = {"Beans.xml"};
		//ApplicationContext context = new ClassPathXmlApplicationContext(configLocations,Boolean.TRUE,null);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		String applicationName = applicationContext.getApplicationName();
		System.out.println(applicationName);
		HelloWorld obj = (HelloWorld) applicationContext.getBean("helloWorld");
		obj.getMessage();
	}
}
