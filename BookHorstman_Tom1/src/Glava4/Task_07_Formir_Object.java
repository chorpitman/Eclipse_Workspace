package Glava4;

public class Task_07_Formir_Object 

{
	public static void main (String[] args)
	{
		//заполняем массив staff термя обьектами employee
		Task_07_Formir_Object_Employee [] staff = new Task_07_Formir_Object_Employee[3];
		staff[0] = new Task_07_Formir_Object_Employee("Harry", 40000);
		staff[1] = new Task_07_Formir_Object_Employee(60000);
		staff[2] = new Task_07_Formir_Object_Employee();

		//
		for (Task_07_Formir_Object_Employee e: staff)
			System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary() );
	}
}