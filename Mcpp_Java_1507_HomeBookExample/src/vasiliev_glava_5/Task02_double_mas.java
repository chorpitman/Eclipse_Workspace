package vasiliev_glava_5;
import javax.swing.*;
public class Task02_double_mas 
{

	public static void main(String[] args) 
	{
		int n;
		int m;
		
		String text = "Двумерный массив случайных чисел";
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Строк в массиве"));
		m = Integer.parseInt(JOptionPane.showInputDialog("Столбцов в массиве"));
		
		int [][] myArr = new int [n][m];
		
		for (int i=0; i<n; i++)
		{
			text = text + "\n";
			for (int j=0; j<m; j++)
			{
				myArr[i][j] = (int)(10*Math.random());
				text=text + myArr[i][j]+"  ";
			}
		}
		JOptionPane.showMessageDialog(null, text);
		System.out.println("Massive myArr have: "+myArr.length + " строк");
		System.out.println("Massive myArr have: "+myArr[0].length + " столбцов");
	}

}
