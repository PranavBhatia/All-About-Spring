package com.learn.spring.basics.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learn.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.learn.spring.basics.componentscan")
public class ComponentsScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentsScanApplication.class);

	public static void main(String[] args) {
		// Application Context
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ComponentsScanApplication.class);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getComponentJdbcConnection());

	}

}
