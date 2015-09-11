package vasiliev_glava_7;

public class Main_MyClassTrasportArgs 
{
	// Перегруженный статический метод.
	// Аргумент - объект:
	static void MakeChange(MyClassTrasportArgs obj)
	{
		// Изменение полей объекта - аргумента метода:
		obj.number++;
		obj.symb++;

		// Текст для отображения:

		String text="Аргумент-объект: поля "+obj.number+" и "+obj.symb;
		// Вывод сообщения на консоль:
		System.out.println(text);
	}

	// Перегруженный статический метод.
	// Аргументы - переменные базовых типов:

	static void MakeChange(int number,char symb)
	{
		// Изменение аргументов метода:
		number++;
		symb++;
		
		// Текст для отображения:
		String text="Аргументы базовых типов: значения "+number+" и "+symb;
		
		// Вывод сообщения на консоль:
		System.out.println(text);
	}

	// Главный метод программы:
	public static void main(String[] args)
	{
		// Создание объекта:
		MyClassTrasportArgs obj=new MyClassTrasportArgs(1,'a');

		// Значения полей объекта:
		obj.show();

		// Изменение объекта:
		MakeChange(obj);

		// Значения полей объекта:
		obj.show();

		// Изменение полей объекта:
		MakeChange(obj.number,obj.symb);

		// Значения полей объекта:
		obj.show();
	}
}
