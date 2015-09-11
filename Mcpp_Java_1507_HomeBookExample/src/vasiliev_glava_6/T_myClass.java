package vasiliev_glava_6;

import javax.swing.JOptionPane;


public class T_myClass
{
	int numbers;
	double salary;
	String text;

	// КОНСТРУКТОРЫ КЛАССА T_myClass

	// 1. Без аргументов	
	T_myClass ()
	{
		set();
		showMessage();
	}

	T_myClass(int a)
	{
		set(a);
		showMessage();
	}

	// 2. Два аргумента
	T_myClass (int myCNumbers, double myCSalary)
	{
		set(myCNumbers, myCSalary);
		showMessage();
	}

	// 3. Три аргумента
	T_myClass (int myCNumbers, double myCSalary, String myCText)
	{
		set(myCNumbers, myCSalary, myCText);
		showMessage();
	}

	// МЕТОДЫ КЛАССА

	public void set()
	{
		numbers=0;
		salary=0;
		text="Пустой конструктор";
	}

	public void set(int a)
	{
		numbers = a;
		salary = 0;
		text = "Один аргумент";
	}

	public void set(int a, double b)
	{
		numbers = a;
		salary = b;
		text = "Два аргумента на входе";
	}

	public void set(int a, double b, String c) 
	{
		numbers = a;
		salary = b;
		text = c;
	}

	public void showMessage() 
	{
		String str = "Значение обьекта:\n";

		str += "numbers = " + numbers + "\n";
		str += "salary = " + salary + "\n";
		str += "text = " + text + "\n";

		JOptionPane.showMessageDialog(null, str);

	}
}
