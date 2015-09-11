package Glava_03;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.omg.Messaging.SyncScopeHelper;

public class OOP 
{
	public static void main (String args[] ) 
	{


		// Создаем обьект. инициализируем его текущей датой.
		GregorianCalendar d = new GregorianCalendar();

		//Определим текущий день и месяц, дваждый вызвав метод get()

		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);

		// передаем методу set() обьекта d параметр, заадющий первое число месяца, 
		// и получим день недели, соотвествующий этой дате
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		
		// Вывод заголовка таблицы
		System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		
		//при отображении первой строки календаря возможен сдвиг
		
		for (int i = Calendar.SUNDAY; i < weekday; i++ )
			System.out.print("   ");
		
		
		do
		{
			// вывод дня месяца
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			// Символом * помечается текущий день
			
			if (day == today)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("   ");
			}
			
			// после каждой субботы начинается новая строка
			
			if (weekday == Calendar.SATURDAY)
			{
			System.out.println();
			}
			
			//перевод d на следующий день
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		
		while (d.get(Calendar.MONTH)==month);
		
		// Цикл завершается когда обьект d 
		// установлен на первый день следующего месяца
		
		// При необходимости переводится строка
		if (weekday !=Calendar.SUNDAY)
		{
			System.out.println();
		}
		
	}
}



