package lesson1;
public class Cicl {

	public static void main(String[] args) 
	{
		// от 1 до 20
		for (int i = 1; i <= 20; i++) 
		{
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println();

		// от 20 до 50

		for (int i = 20; i <= 50; i++) 
		{
			System.out.print(i + ", ");
		}

		System.out.println();
		System.out.println();

		// от -10 до 20
		for (int i = -10; i <= 20; i++) 
		{
			System.out.print(i + ", ");
		}

		System.out.println();
		System.out.println();

		// от 20 до -20
		for (int i = 20; i >= -20; i--) 
		{
			System.out.print(i + ", ");
		}

		System.out.println();
		System.out.println();

		// от 0 до 50 четные
		for (int i = 0; i <= 50; i = i + 2) 
		{
			System.out.print(i + ", ");
		// еще вариант через условие if (i%2==0)
		}
		
		System.out.println();
		System.out.println();

		// от 0 до 100  кратные 3
		for (int i = 0; i <= 100; i = i + 3) 
		{
			System.out.print(i + ", ");
		}
		
		System.out.println();
		System.out.println();

		// от 0 до 100  кратные 7
		for (int i = 0; i <= 100; i = i + 7) 
		{
			System.out.print(i + ", ");
		}
		
		System.out.println();
		System.out.println();

		// от 0 до 100  кратные 3 и 5
		for (int i = 0; i <= 100; i = i + 1) 
		{
			if (i%3==0 && i%5==0) 
			{
			System.out.print(i + ", ");
			}
		}
		
		
	}
}
