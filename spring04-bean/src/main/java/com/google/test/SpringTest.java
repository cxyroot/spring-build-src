package com.google.test;

import com.google.config.AppConfig;
import com.google.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		////BeanDefinition
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new
				AnnotationConfigApplicationContext(AppConfig.class);
		//System.out.println(annotationConfigApplicationContext);
		//annotationConfigApplicationContext.register();
		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
		indexDao.query();
	}
}
