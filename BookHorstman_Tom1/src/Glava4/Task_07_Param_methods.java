/*package Glava4;

public class Task_07_Param_methods 
{

	public static void main(String[] args) 
	{
		// Тест 1: методы не могут изменять числовые параметры.
		System.out.println("Testing tripleValue:");
		System.out.println("Before: percent = " + percent);
		tripleVAlue(percent);
		System.out.println("After: percent = " + percent);

		// Тест 2: методы не могут изменять состояние обьектов, передаваемых в качестве параметров.

		System.out.println("\nTesting tripleSalary");
		Task_07_Param_methods_Employee harry = new Task_07_Param_methods_Employee (Harry, 5000;
		System.out.println("Before: salary = " + harry.getSalary());

		tripleSalary(harry);
		System.out.println("After: salary = ")+ harry.getSalary();


		//методы
		public static void tripleValue (double x) // не работает
		{
			x = 3 *x;
			System.out.println("Ends of methods: x " + x);
		}

		public static void tripleSalary(Employee x) //Работает
		{ф
			x.raiseSalary(200);
			System.out.println("Ends of methods: salary = " + x.getSalary());
		}	

		public static void swap (Employee x, Employee y)
		{
			Employee temp = x;
			x = y;
			y = temp;
			System.out.println("Ends of methods: x = " + x.getName());
			System.out.println("Ends of methods: y = " + y.getName());
		}	
	}

}
*/