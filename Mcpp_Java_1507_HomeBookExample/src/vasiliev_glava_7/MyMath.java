package vasiliev_glava_7;

class MyMath
{
	// Статическая константа:
	final static double PI=3.14159265;
	
	// Статический метод для вычисления синуса:
	static double sin(double x,int n)
	{
	
		// Локальные переменные:
	double s=0;
	double q=x;
	int i; //для оператора for
	
	// Оператор цикла для вычисления ряда Тейлора для синуса:
	for(i=1;i<=n;i++)
	{
	s+=q;
	q*=(-1)*x*x/(2*i)/(2*i+1);
	}
	// Результат:
	return s+q;
	}
}