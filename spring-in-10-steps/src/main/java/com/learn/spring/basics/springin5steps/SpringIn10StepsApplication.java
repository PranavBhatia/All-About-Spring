package com.learn.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {
		// Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsApplication.class,
				args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearchImpl.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}

}
