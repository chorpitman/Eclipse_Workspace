package nasledovanie;

public class Main {

	public static void main(String[] args) 
	{
		Person p1 = new Person("Oleg", "Chorpita", 1);
		Person p2 = new Person("Nazar", "Kopito", 2);
		
		Developer d1 = new Developer("Tim", "Koock", 3);
		Developer d2 = new Developer("Ким", "Duck", 4);
		
		
		System.out.println(p1.getFirstName() + " " +p1.getLastName() + " " +p1.getId());
		System.out.println();
		System.out.println(d1.getFirstName() + " " +d1.getLastName() + " " + d1.getId());
		d1.changeId();
		d2.develop("Привет");
	}

}
