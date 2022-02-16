package com.learn.spring.basics.spring.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.learn.spring.basics.spring.BasicApplication;

// load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BasicApplication.class)
public class BinarySearchTest {

	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		// call method on binary search
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);

		// check if the value is correct
		assertEquals(3, actualResult);
	}

}
