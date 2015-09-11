package Conditional_Operatos_Function;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task04_fTest {

	@Test
	public void test0() 
	{
		int a = 1;
		int b = 1;
		int c = 1;
		
		int x=a+b+c;
		int z=a*b*c;
		
		int result = Task04_f.count(x, z);
		assertEquals(6, result);
	
	}

	@Test
	public void test1() 
	{
		int a = 1;
		int b = 2;
		int c = 3;
		
		int x=a+b+c;
		int z=a*b*c;
		
		int result = Task04_f.count(x, z);
		assertEquals(9, result);
	
	}
	@Test
	public void test2() 
	{
		int a = 0;
		int b = 0;
		int c = -1;
		
		int x=a+b+c;
		int z=a*b*c;
		
		int result = Task04_f.count(x, z);
		assertEquals(3, result);
	
	}
	
	@Test
	public void test3() 
	{
		int a = 0;
		int b = 0;
		int c = 0;
		
		int x=a+b+c;
		int z=a*b*c;
		
		int result = Task04_f.count(x, z);
		assertEquals(3, result);
	
	}
	
	@Test
	public void test4() 
	{
		int a = -1;
		int b = -1;
		int c = -1;
		
		int x=a+b+c;
		int z=a*b*c;
		
		int result = Task04_f.count(x, z);
		assertEquals(2, result);
	
	}	

}
