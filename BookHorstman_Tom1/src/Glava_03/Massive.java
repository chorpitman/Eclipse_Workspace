package Glava_03;

public class Massive 
{

	public static void main(String[] args) 
	{
		// обьявление переменной а. для инициализации необходимо - new
	
		int [] a = new int[10];
		for (int i=0; i<10; i++)
		{
			a[i] = i; //ЗАполняет массив от 0 до 99
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		//
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
			
		
		
	}

}
