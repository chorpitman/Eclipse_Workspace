package сycles;
// Проверить простое ли число? (число называется простым, если оно делится только само на себя и на 1)

public class Task02 
{

	public static void main (String[] args) 
	{
		int a=10;
		
		for (int i=2; i<=a; i++)
		{
			if (a%i==0) 
			{
			System.out.println("простое");	
			}
			
			else 
			{
				System.out.println("составное");
			}
		}
		
	}

}


