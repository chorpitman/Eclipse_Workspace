package Glava_06_interface_obratniy_vizov;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

	public static void main(String[] args) 
	{
		ActionListener listener = new TimePrinter();
		//Создание таймера, вызывающего 
		//обработчик каждый 10 сек
		//gfhgdjfshgdkfjhgkdjshgdksfg
		Timer t = new Timer(10000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit Program");
		System.exit(0);

	}

}
