package com.google;

import com.google.config.JdbcConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class SpringTestEight {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext("com.google.config");
		/*DataSource dataSource = annotationConfigApplicationContext.getBean("dataSource", DataSource.class);
		System.out.println(dataSource);*/

		JdbcConfig jdbcConfig = annotationConfigApplicationContext.getBean("com.google.config.JdbcConfig", JdbcConfig.class);
		System.out.println(jdbcConfig);

		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.err.println(beanDefinitionName);
		}

	}
}
