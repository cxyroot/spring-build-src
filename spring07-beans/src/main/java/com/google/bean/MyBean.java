package com.google.bean;

import org.springframework.context.annotation.Bean;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Bean
public @interface MyBean {

}
