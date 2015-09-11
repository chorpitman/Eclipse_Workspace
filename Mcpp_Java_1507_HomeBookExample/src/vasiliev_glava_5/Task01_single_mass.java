package vasiliev_glava_5;
import javax.swing.*;

public class Task01_single_mass 
{
	public static void main(String[] args) 
	{
		//Индексаня переменная и размер массива
		int i;
		int size;

		//Текст для отображения
		String text = "Массив из нечетных чисел: \n";

		// Ввод размера массива
		size = Integer.parseInt(JOptionPane.showInputDialog("Укажите размер массива:"));

		// Создание массива
		int [] nums = new int[size];

		// Заполнение массива и формирование текста вывода
		for (i=0; i<size; i++)
		{
			nums[i]=2*i+1;
			text=text+nums[i]+" ";
		}
		
		//вывод окна сообщения
		JOptionPane.showMessageDialog(null, text);
	}
}