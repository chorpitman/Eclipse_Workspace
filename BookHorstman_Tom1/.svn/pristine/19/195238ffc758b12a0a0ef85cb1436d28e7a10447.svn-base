package Glava_03;

import java.util.Scanner;

public class Operators_For1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Сколько номеров ?");
		int k = input.nextInt();
		
		System.out.println("Наибольший номер ?");
		int n = input.nextInt();
		
		
		
		int lotteryOdds = 1;
		for (int i=1; i<=k; i++)
			lotteryOdds = lotteryOdds * (n-i+1)/i;
		System.out.println("Ваши шансы 1 из " + lotteryOdds + ".  Успехов!");
	}

}
