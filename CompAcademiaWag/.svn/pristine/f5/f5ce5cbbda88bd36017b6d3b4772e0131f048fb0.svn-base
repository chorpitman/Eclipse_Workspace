import javax.swing.*;
public class UsingIf {

	public static void main (String[] args) {
		//Числа (числитель и знаменатель):
		double x,y;
		//Заголовок окна:
		String title="ДЕЛЕНИЕ ЧИСЕЛ";
		//текст сообщения (начальное значение):
		String text = "Результат деления: ";
		//переменная определяет тип сообщения:
		int type;
		//Считывание числителя
		x=Double.parseDouble(JOptionPane.showInputDialog("Введите числитель:"));
		//считвание знаменателя
		y=Double.parseDouble(JOptionPane.showInputDialog("Введите Знаменатель: "));
		//Условный оператор: равен ли нулю знаменатель?
		if (y!=0) {
			type=JOptionPane.PLAIN_MESSAGE; // Знаменатель не равен нулю
			text = text + x + "/" + y + "=" + x/y;
		} else {
			type=JOptionPane.ERROR_MESSAGE; //Знаменатель равен нулю
			text = text + "деление на ноль!";}
			//отображение окна с сообщением
			JOptionPane.showMessageDialog(null, text, title, type);
		}
		
	}
