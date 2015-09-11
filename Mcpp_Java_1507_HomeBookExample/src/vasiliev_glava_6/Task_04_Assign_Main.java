package vasiliev_glava_6;

public class Task_04_Assign_Main 
{

	public static void main(String[] args) 
	{
		Task_04_Assign obj1 = new Task_04_Assign();
		Task_04_Assign obj2 = new Task_04_Assign("Второй обьект создан");
		
		obj1.show();
		obj2.show();
		
		obj1 = obj2;
		obj1.show();
		obj2.text = "Второй обьект создан_ и_изменен";
		obj1.show();
		obj2.show();
		}

}
