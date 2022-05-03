package com.google.config;

import com.google.beannamegenerator.MyBeanNameGenerator;
import com.google.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 注解驱动开发方式
 */
@Configuration
//@Component
//@ComponentScan(basePackages = {"com.google","com"})
//@ComponentScan(basePackages = "com.google")
//@ComponentScan(basePackageClasses = UserService.class)
//@ComponentScan
@ComponentScan(basePackages = "com.google",nameGenerator = MyBeanNameGenerator.class,resourcePattern = "**/*.class" )//BeanNameGenerator
//ScopeMetadataResolver
//resourcePattern String resourcePattern() default ClassPathScanningCandidateComponentProvider.DEFAULT_RESOURCE_PATTERN;
public class SpringConfig {

}

