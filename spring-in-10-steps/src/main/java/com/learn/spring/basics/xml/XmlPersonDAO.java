package com.learn.spring.basics.xml;

public class XmlPersonDAO {
	XmlJdbcConnection xmlJdbcConnection;

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setJdbcConnection(XmlJdbcConnection xMLJdbcConnection) {
		this.xmlJdbcConnection = xMLJdbcConnection;
	}

}
