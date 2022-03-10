package com.spring.annotations.tp.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.annotations.tp.beans.Hello;
import com.spring.annotations.tp.beans.HelloImpl;
import com.spring.tp.annotations.bean.autowired.Salutation;

@Configuration
public class ConfigBean {

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Hello getHello() {

		return new HelloImpl();

	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Salutation getSalutation() {

		return new Salutation();

	}

}
