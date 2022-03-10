package com.spring.tp.annotations.bean.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.annotations.tp.beans.Hello;

@Component("Salutation")
public class Salutation {

	static int count = 1;

	@Autowired
	Hello hello;

	public Salutation() {

		System.out.println("Salutation " + count++);

	}

	public String saluer(String s) {

		return hello.sayHello(s).toUpperCase();

	}

}
