
public class Person 
{
	// Обьявляем переменные класса Person
	int id;
	String fName;
	String lName;
	int age;

	// Создаем конструктор класса Person
	public Person (int personId, String personFName, String personLName, int personAge)
	{
		this.id = personId;
		this.fName = personFName;
		this.lName = personLName;
		this.age = personAge;
	}

	//пустой конструктор. Используется для того, чтобы во время создание пустого обьекта он не создавался
	public Person()
	{

	}

	@Override
	public String toString()
	{
		return "Person [id=" + id + ", First Name=" + fName + ", Last Name=" + lName + ", Age =" + age + "]";
	}

	// Методы форматирования 

	public String toJSON() // Конструкция {id:10, fName:Oleg, lName:Chorpita, age}
	{
		return "{id: " + id + ", FName: " + fName + ", LName: " + lName + ", Age: " + age + "}";
	}


	public String toCSV() // конструкция csv файла: 10,  Вася, Пуп, 30
	{
		return id + ", " + fName + ", " + lName + ", " + age;
	}


	public String toXML() // конструкция файла как у html
	{
		return "<Person>" + "\r\n" + 
				"\t<id>" + ""+ id + "" + "</id>\r\n" + 
				"\t<FName>" + "" +fName + "" + "</FName>\r\n" + 
				"\t<LName>" + "" + lName + "" + "</LName>\r\n" +
				"\t<age>" + age + "</age>\r\n" + 
				"</Person>";
	}


	public String to() // 
	{
		return id + ", " + fName + ", " + lName + ", " + age;
	}


	public void fromCSV(String str) // конструкция csv файла: 10,  Вася, Пуп, 30
	{
		String[] ar = str.split(",");
		this.id = Integer.parseInt(ar[0].trim());
		this.fName = ar[1].trim();
		this.lName = ar[2].trim();
		this.age = Integer.parseInt(ar[3].trim());
	}


	public void fromJSON(String str) // // Конструкция {id:10, fName:Oleg, lName:Chorpita, age} 
	{
		String[] ar = str.split("");
		this.id = Integer.parseInt(ar[0].trim());
		this.fName = ar[1].trim();
		this.lName = ar[2].trim();
		this.age = Integer.parseInt(ar[3].trim());
	}

	public void fromXML(String str) //
	{
		String[] ar = str.split("{");
		this.id = Integer.parseInt(ar[0].trim());
		this.fName = ar[1].trim();
		this.lName = ar[2].trim();
		this.age = Integer.parseInt(ar[3].trim());
	}


	public void fromXMLString(String str)
	{
		String[] arr = str.split("\n");
		String[] pp = new String[4];
		
		for(int i = 1; i < arr.length - 1; i++)
		{
			String[] temp = arr[i].split(" ");
			pp[i - 1] = temp[1];
		}

		this.id = Integer.parseInt(pp[0]);
		this.fName = pp[1];
		this.lName = pp[2];
		this.age = Integer.parseInt(pp[3]);
	}
	
	public void fromXMLGontsov(String str)
	{
		
	}


}
