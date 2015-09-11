
public class CalcFunction {

	public static void  calc (int a, int b, char op)
	{
		a=4;
		b=2;
		op='+';
		int res=0;
		res=resultOfCalculation(a, b, op);
		System.out.println(res);
	}
	public static int resultOfCalculation (int a, int b, char op)
	{
		int res=0;
		if (op=='-') {
			res=a-b;
		} else if (op=='+') {
			res=a+b;
		} else if (op=='*') {
			res=a*b;
		} else if (op=='/') {
			res=a/b;
		}
		return res;
	}

}