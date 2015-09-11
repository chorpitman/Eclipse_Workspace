package Conditional_Operatos;
// Если а – четное посчитать а*б, иначе а+б

public class task1 {

	public static void main(String[] args) 
	{
		int a=6;
		int b=10;
	
		int result=0;

		if (a%2==0)
		{
			result = a*b;
		}

		else
			result = a+b;

		System.out.println(result);
	}
}
