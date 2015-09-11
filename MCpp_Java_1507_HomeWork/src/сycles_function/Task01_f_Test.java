package сycles_function;
//Найти сумму четных чисел и их количество в диапазоне от 1 до 99

import static org.junit.Assert.*;

import org.junit.Test;

public class Task01_f_Test 
{

	@Test
	public void test_count1() 
	{
		int result = Task01_f.count1();
		assertEquals(49, result);
	}

	@Test
	public void test_count2() 
	{
		int resultResult = Task01_f.count2();
		assertEquals(2450, resultResult);
	}
}
