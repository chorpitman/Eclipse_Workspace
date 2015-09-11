package lesson5;

public class Task01_figure {

	public static void main(String[] args) 
	{
square1();
	}
	
	public static void square1()
	{
		for (int i=1; i<=7; i++)
		{
			for (int j=1; j<=7; j++)
			{
				if (j==1 || j==7 || i==1 || i==7 || i==j ||i+j==8)
				{
					System.out.print("*");
				}
				
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
