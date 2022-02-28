package com.learn.springboot.springbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootBasicsApplication.class, args);

		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			System.out.println("Bean: " + beanName);
		}
	}

}
