package com.diego.learn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatheratorTest {
	
	private Matherator classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new Matherator();
		
	}

	@Test
	public void testSubtract() {
		long result = 100 + 34 - (-17) - 4;
		
		result = 0;
		
		assertEquals(result, classUnderTest.add(0, 0, 0, 0));
	}

	@Test
	public void testAdd() {
		long result = 10 + 23 + (-1) + 16;
		
		assertEquals(result, classUnderTest.add(10, 23, -1,  16));
		
		result = 100 + 102;
		assertEquals(result, classUnderTest.add(100, 102));
		
		result = 0;
		assertEquals(result, classUnderTest.add(0));
	}

}
