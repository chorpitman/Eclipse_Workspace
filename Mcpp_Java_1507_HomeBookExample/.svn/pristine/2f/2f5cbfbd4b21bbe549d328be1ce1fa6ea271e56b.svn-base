package vasiliev_glava_5;

import javax.swing.JOptionPane;

public class Task04_mass_sort_buble 
{

	public static void main(String[] args) 
	{
		// текст для окна сообщения
		String text = "Исходный массив: \n";

		// размер массива и индексные переменные
		int size;
		int i;
		int j;
		//получение рамзмера массива
		size = Integer.parseInt(JOptionPane.showInputDialog("Размер массива: "));
		// создание символьного массива
		char [] symb = new char[size];
		//начальная буква
		char s = 'a';
		//заполнение массива случайным образом
		for (i=0; i<size; i++)
		{
			symb[i]=(char)(s+(byte)(Math.random()*26));
			text=text + symb[i] + " ";
		}
		text = text + "\nПосле сортировки: \n";

		//Сортировка массива
		for (j=0; i<size; i++)
		{
			for (j=0; j<size; j++)
			{
				if(symb[j]>symb[j+1])
				{
					s=symb[j+1];
					symb[j+1]=symb[j];
					symb[j]=s;
				}
			}
		}
		//Запись в текстовую переменную элементов после сортировки
		for (i=0; i<size; i++) 
		{
			text = text + symb[i] + " ";
		}
		//отображение окна сообщения
		JOptionPane.showMessageDialog(null, text);
	}

}
