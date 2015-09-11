package lesson2;
// отпечатать числа в диапазоне от 65 до 90
// меняем инт на чар
// char a=65 == char ='A';

public class Task6 {

	public static void main(String[] args) 
	{
		
		for (char i='A'; i<='Z'; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// номер цифр
		for (char i=48; i<=57; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// Все  символы
		for (char i=32; i<=127; i++)
		{
			System.out.print(i + " ");
		}
	}

}
