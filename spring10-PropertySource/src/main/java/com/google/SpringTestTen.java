package com.google;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class SpringTestTen {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext("com.google.config");

		DataSource dataSource = annotationConfigApplicationContext.getBean("dataSource", DataSource.class);

		try {
			Connection connection = dataSource.getConnection();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		/*String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.err.println(beanDefinitionName);
		}*/

	}
}
