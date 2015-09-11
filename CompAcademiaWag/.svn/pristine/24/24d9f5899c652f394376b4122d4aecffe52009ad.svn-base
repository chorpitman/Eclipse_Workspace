import javax.swing.*;;
public class UsingMoreIf {
	public static void main (String[] args){
		//ќбъ¤вл¤ем текстовые переменные дл¤ считвани¤ ввода
		//пользовател¤
		String text, str;
		text=JOptionPane.showInputDialog("¬ведите целое число");
		if (text==null) {
			System.exit(0);
		}  
		int num=Integer.parseInt(text);
		if (num<0) {
			str="¬ы ввели отрицательное число!";
		} else if (num>100) {
			str="Ё“ќ очень большое число";
		} else if (num>10) {
			str="„исло больше 10ти";
		} else {
			str="„исло в пределах от 0 до 10";
		}
		JOptionPane.showMessageDialog(null, str);
	}
}
