package com.learn.spring.basics.spring.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDAO {

	public int[] getData() {
		return new int[] { 5, 89, 100 };
	}

}
