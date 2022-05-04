package com.google;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class SpringTestSeven {
    public static void main(String[] args) {
        /**
		AnnotationConfigApplicationContext annotationConfigApplicationContext
                =new AnnotationConfigApplicationContext("com.google.config");
		DataSource dataSource = annotationConfigApplicationContext.getBean("dataSource",DataSource.class);
		System.out.println(dataSource);
		 */
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext("com.google.config");
		JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate",JdbcTemplate.class);
		System.out.println(jdbcTemplate);
	}
}
