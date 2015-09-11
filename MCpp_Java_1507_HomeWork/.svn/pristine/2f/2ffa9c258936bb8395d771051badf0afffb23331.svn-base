package Conditional_Operatos_Exeption;

//Написать программу определения оценки студента по его рейтингу, на основе следующих правил:
//0-19=F 20-39=E 40-59=D 60-74=C 75-89=B 90-100=A

public class task05_f_exeption {

	public static void main(String[] args) 
	{
		int a = -110;
		char result = 0;

		try
		{
			result = count(a);
		}

		catch (IllegalArgumentException errorA)
		{
			System.out.println("Братишь, ты проебал с рейтингом \nВведи нормально число в диапазоне от 0 до 100");
		}
		
		catch (ArithmeticException errorB)
		{
			System.out.println("Братишь, ты проебал с рейтингом \nВведи  число больше либо равное 0");
		}

		
		
		System.out.println(result);
	}

	public static char count (int i)
	{
		char resultCount=0;

		if (i >= 0 && i <= 19) {
			resultCount = 'F';
		}

		else if (i >= 20 && i <= 39) {
			resultCount = 'E';
		}

		else  if (i >= 40 && i <= 59) {
			resultCount = 'D';
		}

		else if (i >= 60 && i <= 74) {
			resultCount = 'C';
		}

		else if (i >= 75 && i <= 89) {
			resultCount = 'B';
		}
		else if (i >= 90 && i <= 100) {
			resultCount = 'A';
		}
		else if (i>100)
		{
			throw new IllegalArgumentException();
		}
		else 
			throw new ArithmeticException();
		
		return resultCount;
	}

}
