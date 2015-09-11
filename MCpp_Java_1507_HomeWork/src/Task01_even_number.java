//найти сумму четных чисел и их колличество в диапазоне от 1 99	

public class Task01_even_number {



	public static void main(String[] args) 
	{
		int count = 0;
		int sum = 0;
		int result = 0;
		int limit = 6;

		for (int i = 1; i <= limit ; i++) 
		{
			if (i%2==0)
			{
				result = i;
				System.out.print(result + "; ");
				sum = sum + i;
				count ++;
			}
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(count);

	}

}
