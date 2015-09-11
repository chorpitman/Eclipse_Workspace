package Glava_05;
//абстрактный класс
abstract class Person 
{
	private String name;

	//конструктор класса с аргументами
	public Person (String n) 
	{
		name = n;	
	}
	
	//абстрактный метод
	public abstract String getDedcription();

	public String  getName() 
	{
		return name;
	}
}
