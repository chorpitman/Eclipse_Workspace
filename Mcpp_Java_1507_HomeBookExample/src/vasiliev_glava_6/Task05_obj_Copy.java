package vasiliev_glava_6;

public class Task05_obj_Copy 
{
	// Текстовое поле класса:
	String name;
	
	// Числовое поле класса:
	int number;
	
	// Конструктор класса (два аргумента):
	Task05_obj_Copy(String str,int num)
	{
	name=str;
	number=num;
	}
	
	// Конструктор создания копии:
	Task05_obj_Copy(Task05_obj_Copy obj)
	{
	name=obj.name;
	number=obj.number;
	}
	
	// Метод для создания копии объекта:
	Task05_obj_Copy copy()
	{
	// Создание объекта-копии:
	//MakeObjCopy tmp=new MakeObjCopy(name,number);
		
		Task05_obj_Copy tmp=new Task05_obj_Copy(this);
		
	// Возвращение результата:
	return tmp;
	}
	
	// Метод для вывода информации об объекте:
	void show()
	{
	String text="Поля объекта:\n";
	text+="name: "+name+"\nnumber: "+number;
	
	// Вывод на консоль:
	System.out.println(text);
	}
}
