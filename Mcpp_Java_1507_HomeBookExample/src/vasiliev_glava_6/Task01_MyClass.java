package vasiliev_glava_6;

import javax.swing.JOptionPane;

public class Task01_MyClass 
{
	// Поля или переменные класса Task01_MyClass 
	int abcd;
	char synbol;
	String text;

	// Методы класса Task01_MyClass
	void showTextVoid()
	{
		// Локальная тектовая переменная
		String str = "Значения полей обьекта:" + "\n";
		str = str + "abcd = " + abcd + "\n";
		str += "synbol = " + synbol + "\n";
		str += "text = " + text + "\n";
		// Метод отображает окно сообщения	
		JOptionPane.showMessageDialog(null, str);
	}
	// Метод класса для присваивания значений полям класса
	void set (int n, char s, String str)
	{
		// Заполняем поля класса
		abcd = n;	
		synbol = s;
		text = str;
	}

	String showText()
	{
		//Обьявляем локальную переменную метода showText
		String str="";
		//Формирование результата
		str += "abcd=" + abcd + "\n";
		str += "synbol " + synbol + "\n";
		str += "text=" + text + "\n";
		return str;
	}
}
