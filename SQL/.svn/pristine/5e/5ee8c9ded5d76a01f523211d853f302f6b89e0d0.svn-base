
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonDAO_H2_sql implements PersonDAO
{
	public ArrayList<Person> read()
	
	{
		ArrayList <Person> resultInRam = new ArrayList<Person> ();

		try //используем этот блок для отлавливания исключений, ошибок. Например внешний сбой работы БД 
		
		{
			Class.forName("org.h2.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa", "");
			
			Statement st = conn.createStatement();
			
			/*Класс представляет встроенную команду SQL и используется приложением для доступа к базе данных. 
			При закрытии Statement автоматически закрываются все связанные с ним открытые объекты ResultSet.*/

			ResultSet resultSqlBase = st.executeQuery("SELECT * FROM PERSON"); 
			
			/*Этот класс представляет результирующий 
			набор базы данных. Он обеспечивает приложению построчный доступ к результатам запросов в базе данных. 
			Во время обработки запроса ResultSet поддерживает указатель на текущую обрабатываемую строку. 
			Приложение последовательно перемещается по результатам, пока они не будут все обработаны или не будет закрыт ResultSet.*/


			while (resultSqlBase.next())   // проверка

			{
				resultInRam.add ( new Person (resultSqlBase.getInt("Id"), resultSqlBase.getString("FName"), 
						resultSqlBase.getString("LName"), resultSqlBase.getInt("Age")) );
			}
		} 

		catch (Exception e)

		{
			e.printStackTrace();
		} 

		return resultInRam;
	}


	@Override
	public void create (Person p) 
	{
		try 
		{
			Class.forName("org.h2.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa", "");
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO PERSON VALUES (" + p.id + ", '"+ p.fName + "' , '"+ p.lName + "' , " + p.age +")" );
		} 

		catch (Exception e)
		{
			e.printStackTrace();
		} 
	}

	@Override
	public void update (Person p) 
	{
		try 
		{
			Class.forName("org.h2.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa", "");
			Statement st = conn.createStatement();
			st.executeUpdate( "UPDATE PERSON SET fName = '" + p.fName 
					+  "' , lName = '" + p.lName + "' , age = " + p.age + " WHERE id = "+ p.id);
		} 

		catch (Exception e)

		{
			e.printStackTrace();
		}

	}

	
	@Override
	public void delete(Person p) 
	{
		try 
		{
			Class.forName("org.h2.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa", "");
			Statement st = conn.createStatement();
			st.executeUpdate("DELETE FROM PERSON WHERE id= " + p.id);
		} 

		catch (Exception e)

		{
			e.printStackTrace();
		} 
		
	}
}
