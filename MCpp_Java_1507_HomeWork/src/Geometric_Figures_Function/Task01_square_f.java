package Geometric_Figures_Function;

public class Task01_square_f 
{

	public static void main(String[] args) 
	{
		square();
		squareEmpty();
	}
	
	// заполненный квадрат 
	public static void square()
	{
			int count = 7;
		
		for (int j=1; j<=count; j++)
		{
		
			for (int i=1; i<=count; i++) 
			{
				System.out.print("*");
			}
				System.out.println();
		}
		
		System.out.println();
		}
	
	//пустой квадрат
	public static void squareEmpty ()
	{
		int count = 7;
		
		for (int i=1; i<=count; i++)
			{
				for (int j=1; j<=count; j++)
					{
						if(i==1 || i==count || j==1 || j==count) // оператор или
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
	


