package Glava_03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Massive_1 {

	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	
	System.out.println("Число номеров? ");
	int k = input.nextInt();
	
	System.out.println("Максимальный номер ?");
	int n = input.nextInt();
	
	//ЗАполнение массива числами от 1 .2 .3 .4 n
	int[] numbers = new int [n];
	for (int i = 0; i< numbers.length; i++)
	{
		numbers[i] = i +1; 
	}
	//  Выбор к номеров и запись их в другой массив
	int [] result = new int [k];
	
	for (int i=0; i<result.length; i++)
	{
	int r = (int) (Math.random() * n);
	
	//Выбор случайного элемента
	result [i] = numbers[r];
	
	//копирование последнего элемента
	numbers[r] = numbers[n-1];
	n--;
	
	}
		
	//Вывод сортированного массива
	Arrays.sort(result);
	System.out.println("Попробуйте такую компинацию и станете богатым ! ");
	for (int r: result)
		System.out.println(r);
	}

}
