package com.google;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Annotation;

public class WorkTools implements Conditional {
	@Override
	public Class<? extends Condition>[] value() {
		return new Class[0];
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		return null;
	}
}
