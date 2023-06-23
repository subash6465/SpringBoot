package com.springboot.RestfulWebServices.helloWorld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		this.message=message;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	
}
