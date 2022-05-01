package com.google.test;

import com.google.config.AppConfig;
import com.google.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
	public static void main(String[] args) {

		////BeanDefinition
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new
				AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
		indexDao.query();

		//org.springframework.beans.factory.config.BeanFactoryPostProcessor
	}
	/*
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new
				AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(IndexDao.class);
		annotationConfigApplicationContext.refresh();
		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
		indexDao.query();
	}*/
}
