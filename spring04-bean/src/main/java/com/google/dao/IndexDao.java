package com.google.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class IndexDao {

	public IndexDao(){
		System.out.println("IndexDao Function");
	}

	@PostConstruct
	public void init(){
		System.out.println("init");
	}


	public void query(){
		System.out.println("query");
	}
}
