package com.google;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
//@Value
public class EvenSource {
	public EvenSource(){
		System.out.println("com.google.EvenSource");
	}
}
