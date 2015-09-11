package Glava4;

import java.text.NumberFormat;

public class Task05_Porozd_methods 
{

	public static void main(String[] args) 
	{
		NumberFormat currecyForamtter = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		double x=0.1;
		System.out.println(currecyForamtter.format(x));
		System.out.println(percentFormatter.format(x));
	}

}
