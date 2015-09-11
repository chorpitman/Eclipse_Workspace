package lesson4;

public class Test {

	public static void main(String[] args) 
	{
		int count = 11;
		// Внешний цикл
		for(int i = 1; i <= count; i++) {
		// Внутренний цикл для печати одной строки
		for(int k=1; k <= count; k++) {
		// Вот наше сложное условие
		if( k==1 || k==count || i==1 || i==count || k == (count+1)-i || i == k ) 
		{
		System.out.print("*");
		} else {
		System.out.print(" ");
		}
		}
		// Переход на следующую строку
		System.out.println();
		}
	}

}
