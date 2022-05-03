package com.google;

import com.google.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTestSix {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext("com.google.config");
		SpringConfig springConfig = annotationConfigApplicationContext.getBean(SpringConfig.class);
		System.out.println(springConfig);
	}

}
