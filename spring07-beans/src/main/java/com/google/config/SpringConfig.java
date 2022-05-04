package com.google.config;

import com.google.bean.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

	@Autowired
	private DataSource dataSource;

	@Bean(value = "dataSource")
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		return dataSource;
	}

	/*@Bean//(value = "jdbcTemplate") 使用方法名作为value值
	public JdbcTemplate jdbcTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("1");
		return jdbcTemplate;
	}
	@Bean//(value = "jdbcTemplate") 使用方法名作为value值
	public JdbcTemplate jdbcTemplate(@Autowired DataSource dataSource){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("2");
		return jdbcTemplate;
	}*/

	@MyBean//(value = "jdbcTemplate")
	public JdbcTemplate jdbcTemplate(@Autowired DataSource dataSource){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("2");
		return jdbcTemplate;
	}
}
