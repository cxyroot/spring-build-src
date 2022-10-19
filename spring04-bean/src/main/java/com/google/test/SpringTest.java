package com.google.test;

import com.google.config.AppConfig;
import com.google.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//org.springframework.beans.factory.BeanFactory
//org.springframework.beans.factory.HierarchicalBeanFactory
//org.springframework.beans.factory.ListableBeanFactory
//org.springframework.beans.factory.config.AutowireCapableBeanFactory
//org.springframework.beans.factory.config.ConfigurableBeanFactory
//org.springframework.beans.factory.support.DefaultListableBeanFactory


//XmlBeanFactory
//org.springframework.beans.factory.xml.XmlBeanFactory
//org.springframework.beans.factory.support.DefaultListableBeanFactory

//org.springframework.beans.factory.config.BeanDefinition

//org.springframework.context.ApplicationContext
//org.springframework.context.ConfigurableApplicationContext
//
//
//
// org.springframework.web.context.WebApplicationContext
//org.springframework.web.context.ContextLoaderListener
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
