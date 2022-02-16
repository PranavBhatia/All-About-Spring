package com.learn.spring.basics.spring.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	@Inject
	private SomeCdiDAO someCdiDAO;

	public SomeCdiDAO getSomeCdiDAO() {
		return someCdiDAO;
	}

	public void setSomeCdiDAO(SomeCdiDAO someCDIDAO) {
		this.someCdiDAO = someCDIDAO;
	}

	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = someCdiDAO.getData();

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}

		return greatest;
	}
}
