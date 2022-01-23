package com.learn.spring.basics.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learn.spring.basics.springin10steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn10StepsBasicApplication {

	public static void main(String[] args) {
		// Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsBasicApplication.class,
				args);

		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println("\n" + binarySearchImpl + "\n" + binarySearchImpl2 + "\n");

		int result = binarySearchImpl.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}

}
