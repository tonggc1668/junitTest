package com.test.junitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();
	
	@Before
	public void setUp() throws Exception {
		  calculator.clear();
	}
	@After
	public void tearDown() throws Exception {
		System.out.println(calculator.getResult());
	}

	@Test
	public void testAdd() {
		  calculator.add(2);
	        calculator.add(3);
	        assertEquals(5, calculator.getResult());
	}

	@Test
	public void testSubstract() {
		 calculator.add(10);
	        calculator.substract(2);
	        assertEquals(8, calculator.getResult());
	}

	 @Ignore("Multiply() Not yet implemented")
	public void testMultiply() {
	}

	@Test
	public void testDivide() {
		  calculator.add(8);
	        calculator.divide(2);
	        assertEquals(4, calculator.getResult());
	}
	
	@Test(timeout = 1000)  
	public void testSquareRoot() {
		while (true);  
	}

	@Test
	public void testSquare() {
		fail("Not yet implemented");
	}



	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetResult() {
		fail("Not yet implemented1");
	}
	@Test
	public void testGetResult2() {
		fail("Not yet implemented");
	}
	@Test
	public void testGetResult3() {
		fail("Not yet implemented");
	}
}
