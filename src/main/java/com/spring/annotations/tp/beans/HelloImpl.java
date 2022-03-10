package com.spring.annotations.tp.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloImpl implements Hello {

	static int count = 1;

	private String greeting = "Hello ";

	public HelloImpl() {

		System.out.println("Hello" + count++);

	}

	public HelloImpl(String a) {
		greeting = a;
	}

	public String sayHello(String a) {

		return greeting + a;

	}

	public void setGreeting(String a) {

		greeting = a;

	}

	@PostConstruct
	void init() {

		System.err.println("init du bean Hello");

	}

	@PreDestroy
	void destroy() {

		System.err.println("destruction du bean Hello");

	}

}
