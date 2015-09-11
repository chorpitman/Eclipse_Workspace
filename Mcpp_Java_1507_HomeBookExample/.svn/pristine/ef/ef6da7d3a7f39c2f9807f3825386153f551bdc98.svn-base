package vasiliev_glava_3;

import javax.swing.JOptionPane;

public class Task5_while_do_while {

	public static void main(String[] args) 
	{
		// обьявляем переменные 
		int count;
		int i=1;
		int j=1;
		int s1=0;
		int s2=0;

		count=Integer.parseInt(JOptionPane.showInputDialog("ВВедите границу суммы"));

		String text = "Сумма натуральных чисел от 1 до " + count + ".\n";
		String str1 = "Оператор while: ";
		String str2 = "Оператор do while: ";

		// вычисляем суммы оператором while
		while (i <= count) 
		{
			s1 = s1 + i;
			i++;
		}

		//вычисляем суммы операторм do while
		do 
		{
			s2=s2+j;
			 j++;
		} 
		while (j <=count);
		str1 = str1 + s1 + "\n"; 
		str2 = str2 + s2;
	
		JOptionPane.showMessageDialog(null, text+str1+str2);
	}

}
