package Conditional_Operatos_Exeption;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task05_F_exept_Tests {

	@Test 
	public void testDetermineRate_A() 
	{
		int resultOfCalculation = Task05_F_exept.determineRate(100);
		assertEquals('A', resultOfCalculation );
	}
	
	@Test 
	public void testDetermineRate_B() 
	{
		int resultOfCalculation = Task05_F_exept.determineRate(80);
		assertEquals('B', resultOfCalculation );
	}
	
	// exeptions
	@Test (expected = IllegalArgumentException.class)
	public void testDetermineRate() {
		Task05_F_exept.determineRate(1001);
	}

	@Test (expected = ArithmeticException.class)
	public void testDetermineRate_minus() {
		Task05_F_exept.determineRate(-50);
	}

	
}
