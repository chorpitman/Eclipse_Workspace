package Glava4;

import java.util.Random;

class Task_07_Formir_Object_Employee 
{
	// Создаем 3 перегруженных конструткора
	public Task_07_Formir_Object_Employee (String n, double s)
	{
		name = n;
		salary = s;
	}

	// Второй конструктор
	public Task_07_Formir_Object_Employee (double s)
	{
		// Вызов конструктора Task_07_Formir_Object_Employee (String, double)
		this("Task_07_Formir_Object_Employee #" + nextId, s);
	}

	// Конструктор по умолчанию
	public Task_07_Formir_Object_Employee ()
	{/*
	Поле name инициализируется как "" - см.ниже
	Поле salary задается неявно -- инициализируется нулем
	Поле id задается в блоке инициализации*/
	}

	//Методы класса
	public String getName ()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getId()
	{
		return id;
	}

	//переменные класса
	private static int nextId;
	private int id;
	private String name = ""; //Инициализация поля name
	private double salary;

	//Статический блок инициализации
	static 
	{
		Random generator = new Random();
		// Задаем nextId как случайное число от 0 до 9999
		nextId = generator.nextInt(10000);
	}

	//Инициализационный блок обьекта
	{
		id = nextId;
		nextId++;
	}
}
