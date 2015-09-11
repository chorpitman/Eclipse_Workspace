package Glava4;

public class Task_06_Main_Static_Test 
{

	public static void main(String[] args) 
	{
		//Заполнение массива обьектами класса Task_06_Main_Employee
		Task_06_Employee staff[] = new Task_06_Employee[3];
		staff[0] = new Task_06_Employee("Tom", 500);
		staff[1] = new Task_06_Employee("Bill", 780);
		staff[2]= new Task_06_Employee("Vivien", 469);

		for (Task_06_Employee e : staff)
		{
			e.setId();
			System.out.println("name = " + e.getName() + ", id = " + e.getId() + 
					", salary = " + e.getSalary());
		}
		int n = Task_06_Employee.getNextId(); // вызов статического метода
		System.out.println("Next available ID = " + n);
	}
}