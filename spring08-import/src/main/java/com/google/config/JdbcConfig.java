package com.google.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

public class JdbcConfig {

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//dataSource.setDriverClassName();
		//dataSource.setDriverClassName();
		//dataSource.setDriverClassName();
		//dataSource.setDriverClassName();
		return dataSource;
	}
}
