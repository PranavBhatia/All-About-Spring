package com.learn.spring.basics.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.basics.spring.xml.XmlPersonDAO;

@Configuration
@ComponentScan
public class XmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}", xmlPersonDAO);
			LOGGER.info("{}", xmlPersonDAO.getXmlJdbcConnection());
		}
	}

}
