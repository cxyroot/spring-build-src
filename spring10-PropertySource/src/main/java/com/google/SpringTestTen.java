package com.google;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;


public class SpringTestTen {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext("com.google.config");
		DataSource dataSource = annotationConfigApplicationContext.getBean("dataSource", DataSource.class);
		System.out.println(dataSource);

		/*String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.err.println(beanDefinitionName);
		}*/

	}
}
