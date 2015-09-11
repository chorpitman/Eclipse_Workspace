package сycles_function;
//Найти сумму четных чисел и их количество в диапазоне от 1 до 99

public class Task01_f 
{

	public static void main(String[] args) 
	{

		int result = count1();
		int resultResult = count2();
		
		System.out.println(result);
		System.out.println(resultResult);
	}

	public static int count1 ()
	{
		int res1 = 0;
		
		for (int i=1; i<=99; i++)
		{
			if (i%2==0) 
			{
				 res1++;
			}
		}
		return res1;
	}
	
	
	public static int count2 ()
	{
		int res2 = 0;
		
		for (int i=1; i<=99; i++)
		{
			if (i%2==0) 
			{
				res2 = res2 + i;
			}
		}
		
		return res2;
	}
	
	
}
