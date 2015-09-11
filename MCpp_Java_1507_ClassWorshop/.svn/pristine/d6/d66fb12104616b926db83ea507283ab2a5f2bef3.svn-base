package lesson11;

import java.io.IOException;

class Mama_mila_ramu
{
	static int size;
	static int count;
	static String[] arrString = new String[100];
	
	public static void main(String[] args) throws IOException
	{
		String s = "мама мыла раму";
		String[] ss = s.split(" ");
		size = ss.length; // Определение размера
		count = 0;
		
		for(int j = 0; j < size; j++)
		{
			arrString[j] = ss[j];
		} 
		doAnagram(size); // Построение анаграмм
	}
	
	public static void doAnagram(int newSize)
	{
		if(newSize == 1)
		{
			return;
		}
		for(int j = 0; j < newSize; j++) 
		{
			doAnagram(newSize-1); 
			if(newSize==2)
			{
				displayWords(); 
			}
			rotate(newSize); 
		}
	}
	
	public static void rotate(int newSize)
	{
		int j;
		int position = size - newSize;
		String temp = arrString[position]; 
		for(j = position + 1; j < size; j++) 
		{
			arrString[j - 1] = arrString[j]; 
		}
		arrString[j - 1] = temp; 
	} 
	public static void displayWords()
	{
		for(int j=0; j < size; j++)
		{
			System.out.print( arrString[j] + " ") ;
		}
		System.out.println();
	}
}