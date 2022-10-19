package com.google.config;

import com.google.WorkTools;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component

@Conditional(value= WorkTools.class)
public class LogUtils {

	public void printLog(){
		System.out.println("com.google.config.LogUtils.printLog");
	}
}
