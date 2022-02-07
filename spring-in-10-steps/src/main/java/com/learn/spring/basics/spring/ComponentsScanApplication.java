package com.learn.spring.basics.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learn.spring.basics.componentscan.ComponentDAO;
import com.learn.spring.basics.spring.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.learn.spring.basics.componentscan")
public class ComponentsScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentsScanApplication.class);

	public static void main(String[] args) {
		// Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ComponentsScanApplication.class,
				args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getComponentJdbcConnection());

	}

}
