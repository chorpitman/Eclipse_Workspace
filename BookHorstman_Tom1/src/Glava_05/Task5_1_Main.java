package Glava_05;

import java.util.jar.Attributes.Name;

public class Task5_1_Main 
{

	public static void main (String[] args)
	{
		Task5_1_Manager obj = new Task5_1_Manager("Carl Sucker", 80000, 1987, 12, 15);
		obj.setBonus(5000);
		
		Task5_1_Class [] staff = new Task5_1_Class[3];
//Заполняем массив staff обьектами manager and employee
		staff[0] = obj;
		staff[1] = new Task5_1_Class("Vasya Fucker", 50000, 1989, 10, 11);
		staff[2] = new Task5_1_Class("Dima Haker", 40000, 1990, 3, 15);
		
		//выводим инфо на экран
		for (Task5_1_Class e: staff)
			System.out.println("name = " + e.getName() + "; salary = " + e.getSalary()); 

	}
}
