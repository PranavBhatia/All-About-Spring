package com.learn.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection componentJdbcConnection;

	public ComponentJdbcConnection getComponentJdbcConnection() {
		return componentJdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.componentJdbcConnection = jdbcConnection;
	}

}
