package Conditional_Operatos_Exeption;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task02_F_exeptionTest {

	@Test
	public void testCount_1q() 
	{
		Task02_F_exeption.count(1, 1);
	}
	
	@Test
	public void testCount_2q() 
	{
		Task02_F_exeption.count(-1, 1);
	}

	@Test
	public void testCount_3q() 
	{
		Task02_F_exeption.count(-1, -1);
	}
	
	@Test
	public void testCount_4q() 
	{
		Task02_F_exeption.count(1, -1);
	}

	// exeption
	
	@Test (expected = IllegalArgumentException.class)
	public void testCount_0q() 
	{
		Task02_F_exeption.count(0, 0);
	}
	
	
}
