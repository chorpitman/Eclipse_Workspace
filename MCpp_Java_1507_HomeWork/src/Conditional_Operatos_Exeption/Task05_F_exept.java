package Conditional_Operatos_Exeption;
//Написать программу определения оценки студента по его рейтингу, на основе следующих правил:
//0-19=F 20-39=E 40-59=D 60-74=C 75-89=B 90-100=A

public class Task05_F_exept 
{

	public static char determineRate (int i)
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
		else //if (i<0)
			throw new ArithmeticException();
		
		return resultCount;
	}
}
