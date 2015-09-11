package Conditional_Operatos_Function;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task02_f_Test 
{

	@Test
	public void test1() 
	{
		int x=5;
		int y=5;
		int result = Task02_f.count(x, y);
		assertEquals(1, result);	
	}

	@Test
	public void test2() 
	{
		int x=-5;
		int y=5;
		
		int result = Task02_f.count(x, y);
		assertEquals(2, result);
		
	}
	
	@Test
	public void test3() 
	{
		int x=-5;
		int y=-5;
		
		int result = Task02_f.count(x, y);
		assertEquals(3, result);
		
	}

	@Test
	public void test4() 
	{
		int x=5;
		int y=-5;
		
		int result = Task02_f.count(x, y);
		assertEquals(4, result);
		
	}

	@Test
	public void test_01() 
	{
		int x=0;
		int y=1;
		int result = Task02_f.count(x, y);
		assertEquals(4, result);	
		}
	
	@Test
	public void test_10() 
	{
		int x=-1;
		int y=0;
		int result = Task02_f.count(x, y);
		assertEquals(4, result);	
		}
	@Test
	public void test_00() 
	{
		int x=0;
		int y=0;
		int result = Task02_f.count(x, y);
		assertEquals(4, result);	
		}
				
	
}
