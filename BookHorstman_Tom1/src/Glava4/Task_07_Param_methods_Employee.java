package Glava4;

public class Task_07_Param_methods_Employee 
{

	// Конструктор. Создаем метод - Конструктор класса  Task_07_Param_methods_Employee 

	public Task_07_Param_methods_Employee (String n, double s)
	{
		name = n;
		salary = s;
	}

	//Методы класса Task_07_Param_methods_Employee 
	public String getName ()
	{
		return name;
	}

	public double getSalary ()
	{
		return salary;
	}

	public void raiseSalary (double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary = salary + raise;
	}

	// Переменные класса
	private String name;
	private double salary;
}
