package Glava4;
import java.util.*;

public class Task01_OOP_Calendar_Date 

{

	public static void main(String[] args) 
	{
		// Создание обьекта "календарь"
		GregorianCalendar calendar = new GregorianCalendar ();


		// Определяем (получаем, узнаем) текущий день месяца и месяц. 
		int today = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(calendar.MONTH);

		// Установка обьекта на первое число месяца
		calendar.set(Calendar.DAY_OF_MONTH, 1);

		int weekday = calendar.get(Calendar.DAY_OF_WEEK);

		// Вывод заголовка таблицы
		System.out.println("Sun  Mon  Tue  Wed  Thu Fri  Sat");

		//При отображении первой строчки календаря возможен сдвиг
		for (int i = Calendar.SUNDAY; i< weekday; i++)
		{
			System.out.print("  ");
		}

		do
		{
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			if (day==today)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
			if (weekday == Calendar.SATURDAY)
			{
				System.out.println();
			}
			
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			weekday = calendar.get(Calendar.DAY_OF_WEEK);	
		}
		
		while (calendar.get(Calendar.MONTH) == month);
		//Цикл завершается когда обьект календарь установлен
		// на первый день следующего месяца
		
		// при необходимости выводится строка
		if (weekday !=Calendar.SUNDAY) 
		{
		 System.out.println();
		}
	}

}
