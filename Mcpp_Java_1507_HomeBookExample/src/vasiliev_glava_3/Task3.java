package vasiliev_glava_3;

import javax.swing.JOptionPane;

public class Task3 {

	public static void main(String[] args) 
	{
		double x;
		double y;
		
		String title = "Деление чисел ";
		String text = "Результат деления: ";
		
		// вводим переменную которая определяет тип выводимого сообщения
		int type;
		
		//преобразование введенного текста в число
		x = Double.parseDouble(JOptionPane.showInputDialog("Числитель"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Знаменатаель"));
		
		if (y !=0)
		{
			type = JOptionPane.PLAIN_MESSAGE;
			text = text + x + "/" + y + "=" + x/y;
		}
		else 
		{
			type = JOptionPane.ERROR_MESSAGE;
			text = text + "деление на ноль!";
		}
		
		JOptionPane.showMessageDialog(null, text, title, type);
	}

}
