package com.google.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import(JdbcConfig.class)
//org.springframework.context.annotation.ImportSelector
//org.springframework.context.annotation.ImportBeanDefinitionRegistrar
public class SpringConfig {

}
