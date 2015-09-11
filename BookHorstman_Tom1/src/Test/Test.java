package Test;

public class Test 
{

	public static void main(String[] args) 
	{
	
		Employee name = new Employee("Oleg", "Chorpita",10, 10, 2015);
		Employee name1 = new Employee("Tania", "Chorpita",20, 10, 1984);
		
		
		
		System.out.println(name.getFName() + " "+name.getSName() + " " + name.getBonus() + '\n' + name.getHireDate());
		System.out.println();
		System.out.println(name1.getFName() + " "+name1.getSName() + " " + name1.getBonus() + '\n' + name1.getHireDate());
	}

}
