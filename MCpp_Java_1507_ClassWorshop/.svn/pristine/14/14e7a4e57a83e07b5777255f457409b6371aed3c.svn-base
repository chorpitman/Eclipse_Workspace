package lesson5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task02_calc_Test {

	@Test
	public void test() 
	{
		int a = 10;
		int b = 5;
		char op = '*';
		
		int res = Task02_calc_if.calc(a, b, op);
		assertEquals(50, res);
	}
	
	
	@Test
	public void test_minus() 
	{
		int a = 10;
		int b = 5;
		char op = '-';
		
		int res = Task02_calc_if.calc(a, b, op);
		assertEquals(5, res);
	}
	
	@Test
	public void test_del() 
	{
		int a = 10;
		int b = 5;
		char op = '/';
		
		int res = Task02_calc_if.calc(a, b, op);
		assertEquals(2, res);
	}
	
	
	@Test
	public void test_plus() 
	{
		int a = 10;
		int b = 5;
		char op = '+';
		
		int res = Task02_calc_if.calc(a, b, op);
		assertEquals(15, res);
	}

	@Test
	public void test_null() 
	{
		int a = 10;
		int b = 5;
		char op = '*';
		
		int res = Task02_calc_if.calc(a, b, op);
		assertEquals(50, res);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_Exeption() 
			{
		int res = Task02_calc_if.calc(2, 4, '&');
		assertEquals(50, res);
			}	
	
	
	
	
}
