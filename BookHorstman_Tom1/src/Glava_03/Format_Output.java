package Glava_03;

import java.util.Date;

public class Format_Output {

	public static void main(String[] args) 
	{
		double x = 10000.0 / 3.0;
		System.out.println(x);
		System.out.printf("%8.2f", x);
		
	//Форматирование даты и времени
		
		System.out.println();
		System.out.printf("%tc", new Date());
		
		System.out.println();
		System.out.printf("%tF", new Date());
		
		System.out.println();
		System.out.printf("%tD", new Date());
		
		System.out.println();
		System.out.printf("%tT", new Date());
		
		System.out.println();
		System.out.printf("%tR", new Date());
		
		System.out.println();
		System.out.printf("%tY", new Date());
		
		System.out.println();
		System.out.printf("%tC", new Date());
		
		System.out.println();
		System.out.printf("%tB", new Date());
		
		System.out.println();
		System.out.printf("%tb", new Date());
		
		System.out.println();
		System.out.printf("%th", new Date());
		
		System.out.println();
		System.out.printf("%tm", new Date());
		
		System.out.println();
		System.out.printf("%td", new Date());
		
		System.out.println();
		System.out.printf("%te", new Date());
		
		System.out.println();
		System.out.printf("%tA", new Date());
		
		System.out.println();
		System.out.printf("%ta", new Date());
		
		System.out.println();
		System.out.printf("%tj", new Date());
		
		//Пользовательский вывод данных на консоль
		System.out.println();
		System.out.printf("%1$s %2$tB %2$te %2$tY", "Дата:", new Date());
	}

}
