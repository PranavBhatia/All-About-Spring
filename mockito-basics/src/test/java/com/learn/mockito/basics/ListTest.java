
package com.learn.mockito.basics;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void test() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(10);
		assertEquals(10, mockList.size());
	}

	@Test
	void test_multipleReturns() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, mockList.size());
		assertEquals(20, mockList.size());
		assertEquals(20, mockList.size());
	}

	@Test
	void testGet() {
		List mockList = mock(List.class);
		when(mockList.get(0)).thenReturn("Some String");
		assertEquals("Some String", mockList.get(0));
		assertEquals(null, mockList.get(1));
	}

	@Test
	void testGet_GenericParameter() {
		List mockList = mock(List.class);
		when(mockList.get(Mockito.anyInt())).thenReturn("Some String");
		assertEquals("Some String", mockList.get(0));
		assertEquals("Some String", mockList.get(1));
	}

}
