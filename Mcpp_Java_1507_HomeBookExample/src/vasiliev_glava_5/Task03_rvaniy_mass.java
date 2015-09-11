package vasiliev_glava_5;

import javax.swing.JOptionPane;

public class Task03_rvaniy_mass 
{

	public static void main(String[] args) 
	{
		//Размер массива (количество строк) - случайное число от 2 до4
		int size = 2 + (int)(Math.random()*3);
		
		//Перемення для записи колличества элементов массива:
		int n;
		
		//Начальная буква для заполнения массива
		char s = 'a';
		
		//Текст для вывда на экран в окне сообщения
		String text = "\"Рваный\" символьный массив: ";
		char [][] symbs = new char[size][];
		
		//Добавлени строк в массив
		for (int k=0; k<size; k++)
		{
			//Случайное число от 1 до 8:
			n=1+(int)(Math.random()*8);
			//Создание строки случайной длины
			symbs[k] = new char[n];
		}
		//Заполнение массива буквами
		for (int i=0; i<symbs.length; i++)
		{
			//Переход на новую строку и символ вертикальной черты
			text=text + "\n| ";
			//Переменная j для разных значений i имеет разные ограничения
			for (int j=0; j<symbs[i].length; j++)
			{
				//Заполнение элемента символом
				
				symbs [i][j] =s;
				//Следующий символ
				s++;
				//Добавление записи в текст
				text= text + symbs[i][j] + "  |  ";
			}

		}

		JOptionPane.showMessageDialog(null, text);
	}

}
