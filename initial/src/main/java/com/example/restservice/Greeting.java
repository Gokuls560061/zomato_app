package com.example.restservice;
//im in greeting class
public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;     //constr
		System.out.println("inside pojo class constructor");
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		System.out.println("inside pojo class getter method");
		return content;
	}
}