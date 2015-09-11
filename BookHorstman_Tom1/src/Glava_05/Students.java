package Glava_05;

class Students extends Person
{
	private String major;

	Students (String n, String m)
	{
		super(n);
		major = m;
	}
	
	@Override
	public String getDedcription()
	{
	return "a student majoring in " + major;
	}

}