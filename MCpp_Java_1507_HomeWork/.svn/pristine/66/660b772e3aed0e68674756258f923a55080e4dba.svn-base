package Conditional_Operatos_Exeption;

public class Task05_F_Main 
{
	public static void main(String[] args)  
	{

		char resultOfCalculation = 0;

		try 
		{
			resultOfCalculation = Task05_F_exept.determineRate(-3);	
		}

		catch (IllegalArgumentException errorA)
		{
			System.out.println("проебал и ввел не верый диапазон значений");
		}
		
		catch (ArithmeticException errorB)
		{
			System.out.println("проебал и ввел Отрицательное число");
		}
		

		System.out.println(resultOfCalculation);
	}
}
