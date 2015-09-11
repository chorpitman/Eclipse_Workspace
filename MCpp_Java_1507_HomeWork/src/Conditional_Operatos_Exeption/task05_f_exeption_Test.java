package Conditional_Operatos_Exeption;

import static org.junit.Assert.*;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;

public class task05_f_exeption_Test {

	@Test
	public void test0() 
	{
		char result = task05_f_exeption.count(0);
		assertEquals('F', result);
	}

	@Test
	public void test19() 
	{
		char result = task05_f_exeption.count(19);
		assertEquals('F', result);
	}

	@Test
	public void test15() 
	{
		char result = task05_f_exeption.count(15);
		assertEquals('F', result);
	}

	@Test
	public void test20() 
	{
		char result = task05_f_exeption.count(20);
		assertEquals('E', result);
	}

	@Test
	public void test39() 
	{
		char result = task05_f_exeption.count(39);
		assertEquals('E', result);
	}

	@Test
	public void test30() 
	{
		char result = task05_f_exeption.count(30);
		assertEquals('E', result);
	}

	@Test
	public void test40() 
	{
		char result = task05_f_exeption.count(40);
		assertEquals('D', result);
	}

	@Test
	public void test59() 
	{
		char result = task05_f_exeption.count(59);
		assertEquals('D', result);
	}

	@Test
	public void test50() 
	{
		char result = task05_f_exeption.count(50);
		assertEquals('D', result);
	}

	@Test
	public void test60() 
	{
		char result = task05_f_exeption.count(60);
		assertEquals('C', result);
	}

	@Test
	public void test74() 
	{
		char result = task05_f_exeption.count(74);
		assertEquals('C', result);
	}

	@Test
	public void test70() 
	{
		char result = task05_f_exeption.count(70);
		assertEquals('C', result);
	}

	@Test
	public void test75() 
	{
		char result = task05_f_exeption.count(75);
		assertEquals('B', result);
	}

	@Test
	public void test89() 
	{
		char result = task05_f_exeption.count(89);
		assertEquals('B', result);
	}

	@Test
	public void test80() 
	{
		char result = task05_f_exeption.count(80);
		assertEquals('B', result);
	}

	@Test
	public void test90() 
	{
		char result = task05_f_exeption.count(90);
		assertEquals('A', result);
	}

	@Test
	public void test100() 
	{
		char result = task05_f_exeption.count(100);
		assertEquals('A', result);
	}

	@Test
	public void test95() 
	{
		char result = task05_f_exeption.count(95);
		assertEquals('A', result);
	}


	//			
	@Test (expected = IllegalArgumentException.class)
	public void test() 
	{
		char result = task05_f_exeption.count(110);

	}
	
	@Test (expected = ArithmeticException.class)
	public void test_minus() 
	{
		char result = task05_f_exeption.count(-110);

	}


}
