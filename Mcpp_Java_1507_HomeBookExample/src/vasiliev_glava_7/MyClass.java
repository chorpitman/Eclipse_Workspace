package vasiliev_glava_7;

import javax.swing.JOptionPane;

public class MyClass 
{
	//статическое поле
	static int N1;
	// нестатическое поле
	int N2;
	MyClass (int n1, int n2)
	{
		N1=n1;
		N2=n2;
		String text = "Создан новый обьект! \n";
		text +="Статическое поле: " + N1 + "\n";
		text += "НеСтатическое поле: " +N2 + "\n";
		//Отображение окна сообщения
		JOptionPane.showMessageDialog(null, text);
	}
	
	//Методы
	void show()
	{
	// текст для отображения в окне
	String text = "Поля обьекта!\n";
	text += "Статическое поле: " + N1 + "\n";
	text += "НеСтатическое поле: " +N2 + "\n";
	JOptionPane.showMessageDialog(null, text);
	}
}
