package Glava4;

class Task_06_Employee 
{
//Конструктор должен называться так, как называется КЛАСС. ВАЖНО!
	public Task_06_Employee (String n, double s)
	{
		name = n;
		salary = s;
	}
	
	// Методы
	public String getName ()
	{
		return name;
	}
	
	public double getSalary ()
	{
		return salary;
	}
	
	public int getId ()
	{
		return id; // Установка идентификтатора
	}
	
	public void setId ()
	{
		id = nextId;
		nextId ++;
	}
	
	public static int getNextId() 
	{
		return nextId;
	}
	
	/*public static void main(String[] args) //Тестируем 
	{
		Task_06_Main_Employee e = new Task_06_Main_Employee("Larry", 100);
		System.out.println(e.getName() + " " + e.getSalary());
				
	}*/
	
	//Локальные переменные
	
	private String name;
	private double salary;
	private int id;
	private static int nextId = 1;
	
}
