package vasiliev_glava_3;

import javax.swing.JOptionPane;

public class Task4 {

	public static void main(String[] args) {
		String text;
		String str;

		text = JOptionPane.showInputDialog("Введите целое число: ");

		if (text==null)
		{
			System.exit(0);
		}

		int num = Integer.parseInt(text);
		if (num < 0)
		{
			str = "Вы ввели отрицательное число";
		}
		else if (num > 100) 
		{
			str = "Это очень большое число";
		}

		else if (num > 10)
		{
			str = "Число больше десяти";
		}
		else 
		{
			str = "Число в пределах от 0 до 10";
		}
		JOptionPane.showMessageDialog(null, str);

	}

}
