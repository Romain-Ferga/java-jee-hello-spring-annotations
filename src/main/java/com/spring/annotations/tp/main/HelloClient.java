package com.spring.annotations.tp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.annotations.tp.beans.Hello;
import com.spring.tp.annotations.bean.autowired.Salutation;

public class HelloClient {

	public static void main(String args[]) {

		try {

			System.out.println("Début : Bean Hello ….");

			AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(
					com.spring.annotations.tp.config.ConfigBean.class);

			Hello beanHello = ctxt.getBean(Hello.class);

			System.out.println(beanHello.sayHello("Spring"));

			// Salutation

			Salutation beanSalutation = ctxt.getBean(Salutation.class);

			System.out.println(beanSalutation.saluer("Spring"));

			beanSalutation = (Salutation) ctxt.getBean(Salutation.class);

			System.out.println(beanSalutation.saluer("Ani"));

			beanSalutation = (Salutation) ctxt.getBean(Salutation.class);

			System.out.println(beanSalutation.saluer("Dilo"));

			ctxt.close();

			System.out.println("… Fin.");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
