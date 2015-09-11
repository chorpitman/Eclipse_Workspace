import javax.swing.*;
public class makeChoise {
 public static void main (String[] args) {
	 int number = Integer.parseInt(JOptionPane.showInputDialog ("ВВЕДИТЕ ЧИСЛО:"));
	 String text=number%2==0?" четное ":" нечетное ";
	 JOptionPane.showMessageDialog (null, "Вы ввели " + text + "число!");
 }
}
