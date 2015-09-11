package Glava_03;

import java.util.Scanner;

public class Operator_While_1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Сколько Вы можете вносить в год? ");
		double payment = input.nextDouble();
		
		System.out.print("Процентная ставка: ");
		double interestRate = input.nextDouble();
		
		double balbance = 0;
		int year = 0;
		
		String inputInput;
		
		//Обновлять балан пока пользователь вводит N
		
		do 
		{
			//Добавление ежегодного взноса и процентов
			balbance = balbance + payment;
			double interest = balbance * interestRate / 100;
			balbance = balbance + interest;
			
			year++;
			
			//Вывод текущего баланса
			System.out.printf("Через %d, у Вас будет %,.2f%n", year, balbance);
			
			//Запрос готов ли пользователь прекратить работу
			System.out.print("Уходите на отдых (Y/N) ");
			inputInput = input.next();
				
		} 
		
		while 
			
			(inputInput.equals("N"));
			
	}

}
