package сycles;
// Посчитать сумму цифр заданного числа

public class Task05 
{

	public static void main(String[] args) 
	{
		int n = 456789;
		int s = 0; 
		int m = 1;
		
		for (int i = 0; i < 6; i++) 
		
		{
		    m *= n % 10;
		    s += n % 10;
		    n /= 10;
		    }
		System.out.println("Сумма: " + s);
		System.out.println("Произведение: " + m);


	}

}
