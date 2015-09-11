package Glava_03;

import java.util.Scanner;

public class Operator_While {

	public static void main(String[] args) 
	{
		//Чтение входных данных 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Какая сумма Вам необходима? ");
		double goal = input.nextDouble();

		System.out.print("Сколько Вы можете вносить в год? ");
		double payment = input.nextDouble();

		System.out.print("Процентная ставка: ");
		double interestRate = input.nextDouble();

		double balance = 0;
		int year = 0;

		//Баланс обновляется до тех пор, пока не будет достигнута требуемая сумма
		while (balance < goal) 
		{
			balance = balance + payment;
			double interest = balance * interestRate / 100;
			balance = balance + interest;
			year = year + 1;
		}

		System.out.println("Вы можете уйти на отдых через " + year + " лет" + '\n' + " Вы накопите: " + balance);

	}

}
