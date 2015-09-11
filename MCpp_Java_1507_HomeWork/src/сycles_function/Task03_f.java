package сycles_function;
//Найти корень натурального числа с точностью 
//до целого (рассмотреть вариант последовательного подбора и метод бинарного поиска)

public class Task03_f 
{

	public static void main(String[] args) 
	{
		
		double a = 169;
		double result = 0;
		
		result = count(a);
		System.out.println(result);
	}

	public static double count (double j)
	{
		
		double res=0;
		res = Math.sqrt(j);
		
		return res;
	}

}
