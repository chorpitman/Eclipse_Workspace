package nasledovanie;

public class Person 
{
	private String firstName;
	private String lastName;
	private int id;

	Person (String firstName, String lastName, int id)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	// метод	
	public String getFirstName ()
	{
		return firstName;
	}

	public String getLastName ()
	{
		return lastName;
	}

	public int getId ()
	{
		return id;
	}

	//протектед
	protected void changeId() //доступен для наслеников и для классов из пакета
	{
		System.out.println(changePersonId());
		
	}
	
	private int changePersonId ()
	{
		return id ++;
	}
	

}
