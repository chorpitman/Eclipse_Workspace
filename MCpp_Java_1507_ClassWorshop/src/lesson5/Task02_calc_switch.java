package lesson5;

public class Task02_calc_switch {

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 5;
		char op = '*';
		
		int res = calc(a, b, op);
		System.out.println(res);
	}
	
	public static int calc (int a, int b, char op) // плюс минус разделить умножить - (+ - / *) 
	{
		int result = 0;
		switch (op) 
		{
		case '+': result = a+b;
			break;
		
		case '-': result = a-b;	
			break;
		
		case '/': result = a/b;	
			break;
		
		case '*': result = a*b;	
			break;
		}
		
		return result;
		
		
		
	}

}
