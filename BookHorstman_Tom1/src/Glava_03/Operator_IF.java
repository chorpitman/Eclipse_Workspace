package Glava_03;

import java.util.Scanner;

public class Operator_IF 
{

	public static void main(String[] args) 
	{
		System.out.println("Введите ваш результат продаж: ");
		Scanner input = new Scanner(System.in);		
		int yourSales = input.nextInt();

	//	int yourSales = 200;		
		String perfomance; 
		int target = 100;
		int bonus;

		if (yourSales >= 2 * target)
		{
			perfomance = "Великолепно";
			bonus = 1000;
			System.out.println("Ваш результат:" + yourSales + " Ваш бонус:" + bonus + " Ваш рейтинг:" + perfomance);
		}

		else if (yourSales >= 1.5 * target)
		{
			perfomance = "Хорошо";
			bonus = 500;
			System.out.println("Ваш результат:" + yourSales + " Ваш бонус:" + bonus + " Ваш рейтинг:" + perfomance);
		}
		
		else if (yourSales >= target)
		{
			perfomance = "Удовлетворительно";
			bonus = 100;
			System.out.println("Ваш результат:" + yourSales + " Ваш бонус:" + bonus + " Ваш рейтинг:" + perfomance);
		}
		
		else 
		{
			System.out.println("Вы уволены!");
		}
		

	}

}
