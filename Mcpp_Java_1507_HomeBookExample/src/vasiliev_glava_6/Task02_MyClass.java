package vasiliev_glava_6;

import javax.swing.JOptionPane;

public class Task02_MyClass 
{
	int numbers;
	char symbols;
	String text;
	// Конструктор класса с 3мя аргументами (полями класса Task02_MyClass)
	public Task02_MyClass(int numbersMyClass, char symbolsMyClass, String textMyCkass) 
	{
		//Заполняем поля
		set(numbersMyClass, symbolsMyClass, textMyCkass);
		//Отображение сообщения с информацией об обьекте
		showTextVoid();
	}


	// МЕТОДЫ КЛАССА

	// 1. Метод для присваивания значений полям класса (без аргументов)
	void set()
	{
		// Заполняем поля класса
		numbers = 0;	
		symbols = 'a';
		text = "Нет аргументов, Нах!";
	}
	// 2. Метод класса для отображения сообщения
	void showTextVoid()
	{
		// Локальная тектовая переменная
		String str = "Значения полей обьекта:" + "\n";
		//Формирование результата (значения локальное переменной)
		str = str + "abcd = " + numbers + "\n";
		str += "synbol = " + symbols + "\n";
		str += "text = " + text + "\n";
		// Метод отображает окно сообщения	
		JOptionPane.showMessageDialog(null, str);
	}

	// 3. Метод для присваивания значений полям класса (целочисленный аргумент)
	void set(int n)
	{
		// Заполняем поля класса
		numbers = n;	
		symbols = 'b';
		text = "Целочисленный аргумент";
	}
	
	// 4. Метод для присваивания значений полям класса (три аргумента)
		void set(int n, char s, String text)
		{
			// Заполняем поля класса
			numbers = n;	
			symbols = s;
			text = text;
		}

}
