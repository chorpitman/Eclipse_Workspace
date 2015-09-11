package lesson2;
// от 50 до 100. То, что кратно 3 вывести и подсчитать колличество 
public class Task1 
{
	public static void main(String[] args)
	{
		int count=0;

		for (int i=50; i<=100; i++) 
		{
			if (i%3==0) 
			{
				System.out.print(i+" ");
				count++;
			}
		}	
		
		System.out.println();
		System.out.println();
		System.out.println(count);

	}
}
