package com.google;

import com.google.config.SpringConfig;
import com.google.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTestSix {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext("com.google.config");
		SpringConfig springConfig = annotationConfigApplicationContext.getBean(SpringConfig.class);
		System.out.println(springConfig);



		/*AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext(SpringConfig.class);
		SpringConfig springConfig = annotationConfigApplicationContext.getBean(SpringConfig.class);
		System.out.println(springConfig);*/



		/*AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext(SpringConfig.class);
		UserServiceImpl userServiceImpl = annotationConfigApplicationContext.getBean(UserServiceImpl.class);
		userServiceImpl.save();*/

		/*
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext("com.google");
		UserServiceImpl userServiceImpl = annotationConfigApplicationContext.getBean("myuserServiceImpl",UserServiceImpl.class);
		//UserServiceImpl userServiceImpl = annotationConfigApplicationContext.getBean(UserServiceImpl.class);
		userServiceImpl.save();
		 */
	}

}
