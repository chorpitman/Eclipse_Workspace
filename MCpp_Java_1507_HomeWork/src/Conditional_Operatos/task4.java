package Conditional_Operatos;
//Посчитать выражение макс(а*б*с, а+б+с)+3

public class task4 {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int c = 6;

		int x=a+b+c;
		int z=a*b*c;

		int result = 0;

		if (x>z) {
			result = x+3;
		}

		else result = z+3;

		System.out.println(result);
	}

}
