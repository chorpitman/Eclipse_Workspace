package lesson2;
//Посчитать выражение макс(а*б*с, а+б+с)+3

public class Task3 {

	public static void main(String[] args) 
	{
		int a = 1;
		int b = 3;
		int c = 6;
	
		int result = 0;
		
		int x=a+b+c;
		int z=a*b*c;

		if (x>z) 
		{
			result = x+3;
		}
		else result = z+3;

		System.out.println(result);
	}

}
