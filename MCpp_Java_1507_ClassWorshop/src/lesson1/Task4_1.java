package lesson1;

public class Task4_1 {
	//Посчитать выражение макс(а*б*с, а+б+с)+3

	public static void main(String[] args) 
	{

		int a=1;
		int b=2;
		int c=5;
		
		int res=0;
		
		int x=a+b+c;
		int z=a*b*c;

		if (x>z) {
			res = x+3;
		} 

		else {
			res = z+3;
		}

		System.out.println(res);
		
	}

}
