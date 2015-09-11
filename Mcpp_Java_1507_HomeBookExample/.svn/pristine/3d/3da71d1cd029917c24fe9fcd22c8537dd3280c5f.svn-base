package vasiliev_glava_6;

public class Task05_obj_Copy_Main 
{

	public static void main(String[] args) 
	{
		// Создание объектов:
		Task05_obj_Copy objA=new Task05_obj_Copy("Первый объект",10);
		Task05_obj_Copy objB=new Task05_obj_Copy(objA);
		
		// Отображение информации об объектах:
		objA.show();
		objB.show();
		
		// Изменение второго объекта:
		objB.name="Второй объект";
		objB.number=200;
		
		// Отображение информации об объектах:
		objA.show();
		objB.show();
		
		// "Копирование" объектов:
		objA=objB.copy();
		
		// Отображение информации об объекте:
		objA.show();
		
		// Изменение второго объекта:
		objB.name="Второй объект изменен!";
		objB.number=300;
		
		// Отображение информации об объектах:
		objA.show();
		objB.show();
		}
}
