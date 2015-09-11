package Conditional_Operatos_Function;

//Если а – четное посчитать а*б, иначе а+б

import static org.junit.Assert.*;

import org.junit.Test;

public class Task01_fTest {

	@Test
	public void test0() {
		int a=0;
		int b=20;
		int res = Task01_f.count(a, b);
		assertEquals(0, res);
	}
	
	@Test
	public void test_minus() {
		int a=-2;
		int b=20;
		int res = Task01_f.count(a, b);
		assertEquals(-40, res);
	}
	@Test
	public void test1() {
		int a=2;
		int b=20;
		int res = Task01_f.count(a, b);
		assertEquals(40, res);
	}
	@Test
	public void test2() {
		int a=1;
		int b=20;
		int res = Task01_f.count(a, b);
		assertEquals(21, res);
	}	
	@Test
	public void test3() {
		int a=3;
		int b=20;
		int res = Task01_f.count(a, b);
		assertEquals(23, res);
	}
	
	
}
