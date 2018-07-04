package com.zensar.junit;
import junit.framework.TestCase;

public class MyCalculatorTest extends TestCase{
	
	private MyCalculator theCalculator;
	protected void setUp()throws Exception{
	super.setUp();
		
		theCalculator=new MyCalculator();
		
	}
	protected void tearDown()throws Exception{
		super.tearDown();
		
	}
	public void testGetSum() {
		
		int a=5;
		int b=10;
		
		//check the sum of two + val
		assertEquals(15,(theCalculator.getSum(a, b)));
		assertEquals(15,(theCalculator.getSum(b, a)));
	
		
		int a1=-5;
		int b1=10;
		
		//check the sum of two + val
		assertEquals(5,(theCalculator.getSum(a1, b1)));
		assertEquals(5,(theCalculator.getSum(b1, a1)));
	

	 a1=-5;
	 b1=-10;
		
		//check the sum of two + val
		assertEquals(-15,(theCalculator.getSum(a1, b1)));
		assertEquals(-15,(theCalculator.getSum(b1, a1)));
	
	}
}
