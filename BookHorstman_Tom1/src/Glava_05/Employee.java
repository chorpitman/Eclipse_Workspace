package Glava_05;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee extends Person 
{
	private double salary;
	private Date hireDay;

	public Employee(String n, double s, int year, int month, int date)
	{
		// имя передается конструктору суперкласса
		super(n);
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, date);
		hireDay = calendar.getTime();
	}

	//методы класса
	public double getSalaty() 
	{
		return salary;
	}

	public Date getHireDay() 
	{
		return hireDay;
	}

	@Override
	public String getDedcription()
	{
		return String.format("an employee with a salary of $%.2f", salary);
	}

	public void  raiseSalary(double byPercent) 
	{
		double raise = salary * byPercent/100;
		salary = salary + raise;
	}


}



