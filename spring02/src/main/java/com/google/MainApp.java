package com.google;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		String[] configLocations = {"Beans.xml"};
		ApplicationContext context =
				new ClassPathXmlApplicationContext(configLocations,Boolean.TRUE,null);
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
	}
}
