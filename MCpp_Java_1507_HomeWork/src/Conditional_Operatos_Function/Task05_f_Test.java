package Conditional_Operatos_Function;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task05_f_Test 
{

	@Test
	public void test() 
	{
		int a = 0;
		char result =Task05_f.count(a);
		assertEquals('F', result);

	}
	
	@Test
	public void test1() 
	{
		int a = 10;
		char result =Task05_f.count(a);
		assertEquals('F', result);

	}
	
	@Test
	public void test2() 
	{
		int a = 19;
		char result =Task05_f.count(a);
		assertEquals('F', result);

	}

}
