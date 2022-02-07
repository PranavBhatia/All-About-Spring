package com.learn.spring.basics.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learn.spring.basics.spring.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class BasicApplication {

	public static void main(String[] args) {
		// Application Context
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BasicApplication.class)) {

			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);

			System.out.println("\n" + binarySearchImpl + "\n" + binarySearchImpl2 + "\n");

			int result = binarySearchImpl.binarySearch(new int[] { 12, 4, 6 }, 3);
			System.out.println(result);
		}
	}

}
