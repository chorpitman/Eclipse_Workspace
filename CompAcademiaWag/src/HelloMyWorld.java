import javax.swing.*;
public class HelloMyWorld {
	public static void main (String[] args) {
		String name;
		name=JOptionPane.showInputDialog("Добрый день! Как Вас зовут?");
		JOptionPane.showMessageDialog(null, "ПРИЯТНО ПОЗНАКОМИТЬСЯ, \n" + name + " !");
	}
}
