package Conditional_Operatos_Function;
//Посчитать выражение макс(а*б*с, а+б+с)+3
public class Task04_f 
{

	public static void main(String[] args) 
	{
		int a = 0;
		int b = 0;
		int c = 0;
		
		int x=a+b+c;
		int z=a*b*c;
		
		int result = count(x, z);
		System.out.println(result);
	}
	
	public static int count (int x, int z)
	{
		int resultCount;
		if (x>z) {
			resultCount = x+3;
		}

		else resultCount = z+3;
		return resultCount;
	}
	
	

}
