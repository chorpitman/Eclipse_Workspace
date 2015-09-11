package lesson5;

public class Task02_calc_if {

	public static void main(String[] args) 
	{
	int a = 10;
	int b = 5;
	char op = '&';
	int res = 0;
	
	try 
	{
		res = calc(a, b, op);		
	
	}
	
	catch (IllegalArgumentException qq)
	{
		
	}
	
	catch (ArithmeticException rr) 
	{
	
	}
	System.out.println(res);

	}
	
	public static int calc (int a, int b, char op) // плюс минус разделить умножить - (+ - / *) 
	{
		int result = 0;
		String str = "+-/*";
		if (op=='+')
			{
			result = a+b;
			}
		
		if (op=='-')
			{
			result = a - b;
			}
		
		if (op=='/')
			{
			result = a/b;
			}
		
		if (op=='*')
			{
			result = a*b;
			}
		if (str.indexOf(op)==-1)
			{
			throw new IllegalArgumentException();
			}
		if (b==0 && op=='/')
		{
			throw new ArithmeticException();
		}
		return result;
		
	}

}
