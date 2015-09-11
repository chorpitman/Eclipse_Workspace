package lesson1;
public class Task5 {
	// Написать программу определения оценки студента по его рейтингу, на основе
	// следующих правил:
	// 0-19=F 20-39=E 40-59=D 60-74=C 75-89=B 90-100=A

	public static void main(String[] args) {

		int rate = 17;
		
		char res=0;

//		String a = "A";
//		String b = "B";
//		String c = "C";
//		String d = "D";
//		String e = "E";
//		String f = "F";

		if (rate >= 0 && rate <= 19) {
			res ='F';
		} else if (rate == 20 && rate <= 39) {
			res = 'E';
		} else if (rate == 40 && rate <= 59) {
			res = 'D';
		} else if (rate == 60 && rate <= 74) {
			res = 'C';
		} else if (rate == 75 && rate <= 89) {
			res = 'B';
		} else if (rate == 90 && rate <= 100) {
			res = 'A';
		}
		
		System.out.println(res);
	}

}
