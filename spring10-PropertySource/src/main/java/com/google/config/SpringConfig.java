package com.google.config;

import com.google.factory.YamlPropertySourceFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import(JdbcConfig.class)
//@PropertySource("classpath:jdbc.properties")
@PropertySource(value = "classpath:jdbc.yml",factory = YamlPropertySourceFactory.class)
//@PropertySource("file:///D:/JavaCode/SrcCode/spring-build-src/spring10-PropertySource/src/main/resources/jdbc.properties")
//@PropertySource("classpath:jdbc.xml")
//org.springframework.core.io.support.PropertySourceFactory
public class SpringConfig {
	/**
	 * org.springframework.core.io.support.ResourcePropertySource#ResourcePropertySource
	 * (java.lang.String, org.springframework.core.io.support.EncodedResource)
	 * @return
	 */

	/**
	@Bean
	public static PropertySourcesPlaceholderConfigurer createPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}*/
}
