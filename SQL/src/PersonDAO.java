
import java.util.ArrayList;

public interface PersonDAO 
{
	ArrayList<Person> read();
	
	public void create (Person p);
	public void update (Person p);
	public void delete (Person p);

}
