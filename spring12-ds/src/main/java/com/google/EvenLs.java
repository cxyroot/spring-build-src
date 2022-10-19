package com.google;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
@Component
public class EvenLs {
	public EvenLs(){
		System.out.println("com.google.EvenLs.EvenLs");
	}
}

