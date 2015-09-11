package lesson5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task02_calc_switch_Test {

	@Test
	public void test() 
	{
		int a = 10;
		int b = 5;
		char op = '*';
		
		int res = Task02_calc_switch.calc(a, b, op);
		assertEquals(50, res);
	}

}
