package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator testCalc = new Calculator();
		assertNotNull(testCalc);
	}

	@Test
	public void testGetTotal() {
		Calculator testCalc = new Calculator();
		
		// test getTotal total with a newly constructed calculator
		assertEquals(0, testCalc.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator testCalc = new Calculator();
		
		// test adding 10 to the value of a newly constructed calculator
		testCalc.add(10);
		assertEquals(10, testCalc.getTotal()); 
		
		// test adding 5 to a calculator whose total is currently 10
		testCalc.add(5);
		assertEquals(15, testCalc.getTotal()); 
		
		// test adding a negative number
		testCalc.add(-20);
		assertEquals(-5, testCalc.getTotal()); 
	}

	@Test
	public void testSubtract() {
		Calculator testCalc = new Calculator();
		
		// test subtracting 10 from the value of a newly constructed calculator
		testCalc.subtract(10);
		assertEquals(-10, testCalc.getTotal()); 
		
		// test subtracting 5 from a calculator whose total is currently -10
		testCalc.subtract(5);
		assertEquals(-15, testCalc.getTotal()); 
		
		// test subtracting a negative number
		testCalc.subtract(-15);
		assertEquals(0, testCalc.getTotal()); 
	}

	@Test
	public void testMultiply() {
		Calculator testCalc = new Calculator();
		
		// test multiplying the value of a newly constructed calculator by 10
		testCalc.multiply(10);
		assertEquals(0, testCalc.getTotal()); 
		
		// test adding 5 to a calculator whose total is currently 0, then multiplying the result by 10
		testCalc.add(5);
		testCalc.multiply(10);
		assertEquals(50, testCalc.getTotal()); 
		
		// test multiply by a negative number
		testCalc.multiply(-1);
		assertEquals(-50, testCalc.getTotal()); 
		
		// test multiply by zero
		testCalc.multiply(0);
		assertEquals(0, testCalc.getTotal()); 
	}

	@Test
	public void testDivide() {
		Calculator testCalc = new Calculator();
		
		// test dividing the value of a newly constructed calculator by 10
		testCalc.multiply(10);
		assertEquals(0, testCalc.getTotal()); 
		
		// test adding 5 to a calculator whose total is currently 0, then dividing the result by 5
		testCalc.add(5);
		testCalc.divide(5);
		assertEquals(1, testCalc.getTotal()); 
		
		// test dividing by zero a calculator whose total is 1
		testCalc.divide(0);
		assertEquals(0, testCalc.getTotal()); 
		
		// test dividing by a negative number
		testCalc.add(5);
		testCalc.divide(-1);
		assertEquals(-5, testCalc.getTotal()); 
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
