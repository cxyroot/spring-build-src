package com.google.config;

import com.google.beannamegenerator.MyBeanNameGenerator;
import com.google.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 注解驱动开发方式
 */
@Configuration
//@Component
//@ComponentScan(basePackages = {"com.google","com"})
//@ComponentScan(basePackages = "com.google")
//@ComponentScan(basePackageClasses = UserService.class)
//@ComponentScan
@ComponentScan(basePackages = "com.google",
	nameGenerator = MyBeanNameGenerator.class,
	resourcePattern = "**/*.class",
	// includeFilters = @ComponentScan.Filter(value = Service.class),
	// excludeFilters = @ComponentScan.Filter(value = Service.class),
	excludeFilters = {},
	lazyInit = false
)//BeanNameGenerator
//ScopeMetadataResolver
//resourcePattern String resourcePattern() default ClassPathScanningCandidateComponentProvider.DEFAULT_RESOURCE_PATTERN;

//excludeFilters org.springframework.context.annotation.FilterType
public class SpringConfig {

}

