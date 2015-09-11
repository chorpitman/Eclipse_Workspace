package Test;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee 
{
	public Employee (String a, String b, double s, double r, int year)
	{
		fName = a;
		sName = b;
		salary = s;
		result = r;
	
		GregorianCalendar cal = new GregorianCalendar();
		hireDate = cal.getTime();
	}

// Методы
	public String getFName() 
	{
		return fName;
	}

	public String getSName()
	{
		return sName;
	}

	public double getSalary()
	{
		return salary;
	}

	public double getBonus()
	{
		double res = 0;
		if (salary>=result)
		{
			res = salary+result;
		}	
		return res;
	}
	
	public Date getHireDate()
	{
		return hireDate;
	}

	// Накапливаем данные
	private String fName;
	private String sName;
	private double salary;
	private double result;	
	private Date hireDate;


}
