package Glava_05_toString;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee 
{
	//Переменные класса
	private String name;
	private double salary;
	private Date hireDay;

	//Конструктор
	public Employee (String n, double s, int year, int month, int day)
	{
		name =n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		hireDay = calendar.getTime();
	}

	public String getName()
	{
		return name;
	}

	public double getSalary() 
	{
		return salary;	
	}

	public Date getHireDay() 
	{
		return hireDay;	
	}

	public void raiseSalary(double byPercent) 
	{
		double raise = salary * byPercent/100;
		salary = salary + raise;
	}

	public boolean equals(Object otherObject) 
	{
		//Быстрая проверка идентичности обьектов
		if (this == otherObject)
		{
			return false;
		}
		//Если явный параметр налл - возвращается значение false,
		if (otherObject ==null)
		{
			return false;
		}
		//Если классы не совпадают, они не равны
		if (getClass() != otherObject.getClass())
		{
			return false;
		}
		//теперь мы знаем, что otherObject - ненулевой обьект Employee
		Employee other = (Employee)otherObject;

		//Проверка идентичности значений, записанных в полях.
		return name.equals(other.name)
				&& salary == other.salary
				&& hireDay.equals(other.hireDay);
	}
	
	public int hashCode() 
	{
	return 7*name.hashCode()
			+ 11* new Double(salary).hashCode()
			+ 13 * hireDay.hashCode();
	}
	
	public String toString() 
	{
		return getClass().getName()
				+ "[name=" + name + " salary =" + salary
				+ " hireDay =" + hireDay + "]";
	}
}
