package vasiliev_glava_7;

import javax.swing.JOptionPane;

public class Main_MyMath 
{

	public static void main(String[] args) 
	{
		// Текст для отображения в окне сообщения:
			String text="Значения ряда Тейлора для синуса.";
		// Оператор цикла для вычисления синуса (несколько значений):
			for(int k=0;k<5;k++)
			{
			text+="\nСлагаемых "+(k+1)+":  ";
			text+="sin(pi/4)="+MyMath.sin(MyMath.PI/4,k);
			}
		// Отображение окна сообщения:
			JOptionPane.showMessageDialog(null,text);

	}

}
