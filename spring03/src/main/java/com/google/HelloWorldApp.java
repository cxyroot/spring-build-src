package com.google;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloWorldApp {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		obj.getMessage();
	}
}
