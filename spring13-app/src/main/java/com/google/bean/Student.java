package com.google.bean;

public class Student {
	private String sid;
	private String name;
	private Book springBook;
	public Student() {
		super();
	}
	public Student(String sid, String name, Book springBook) {
		super();
		this.sid = sid;
		this.name = name;
		this.springBook = springBook;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getSpringBook() {
		return springBook;
	}
	public void setSpringBook(Book springBook) {
		this.springBook = springBook;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", springBook="
				+ springBook + "]";
	}
}
