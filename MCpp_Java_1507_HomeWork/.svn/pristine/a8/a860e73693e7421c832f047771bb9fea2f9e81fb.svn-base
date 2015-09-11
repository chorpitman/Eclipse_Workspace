package sql_h2;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.io.*;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		PersonDAO personDao = new PersonDAO_H2_sql();   //Через интерфейс PERSON DAO - создаем обьект
		
		// Person p = new Person (45, "Alexey", "Shipaev", 15);

//  выбираем метод котоым мы будем пользоваться

		// pd.delete(p); - удалить из базы
		// pd.create(p); - создать в базу
		// pd.update(p); - обновить в базе

		ArrayList<Person> pp = personDao.read();
		
		//printToFile(personDao);
		//toCSV(personDao);
		//toJSON(personDao);
		//toXML(personDao);
		//fromJSON(personDao);
		//fromCSV(personDao);
	}

	//  Метод, который считывает всех Pерсон из файла на диске

	public static void fromJSON(ArrayList<Person>pp) throws IOException
	{
		//open file
		File f = new File("2.txt");
		Scanner scanner = new Scanner(f);

		while (scanner.hasNextLine() == true)
		{
			String str = scanner.nextLine();
			System.out.println(str);
		}				
		// close file
		scanner.close();
	}

	//  Метод, который считывает всех Pерсон из ArrayList и сохраняет его в файле на диске

	public static void toCSV(ArrayList<Person>pp) throws IOException
	{
		//open file
		File file = new File("result//4.csv");
		FileWriter fw = new  FileWriter(file);
		for (Person person: pp)
		{
			String str = person.toCSV();
			System.out.println(str);
			
			//write too file
			fw.write(str+"\r\n");
		}
		fw.flush();
		fw.close();
	}

	//  Метод, который считывает всех Pерсон из ArrayList и сохраняет его в файле на диске

	public static void toJSON(ArrayList<Person>pp) throws IOException
	{
		//open file
		File f = new File("result//3.json");
		FileWriter fw = new FileWriter(f);

		for (Person person: pp)
		{
			String str = person.toJSON();
			System.out.println(str);
			// write to file
			fw.write(str + "\r\n");
		}
		// close file
		fw.flush();
		fw.close();
	}
	
	public static void toXML(ArrayList<Person>pp) throws IOException
	{
		//open file
		File f = new File("result//2.xml");
		FileWriter fw = new FileWriter(f);

		for (Person person: pp)
		{
			String str = person.toXML();
			System.out.println(str);
			// write to file
			fw.write(str + "\r\n");
		}
		// close file
		fw.flush();
		fw.close();
	}
	
	//Метод сохранает в в текстовый файл данные которые находятся в ArayList<Person> pp

	public static void printToFile(ArrayList<Person> arr) throws IOException
	{
		//открыть файл
		File file = new File("result//text.txt");
		FileWriter fw = new FileWriter(file);
		
		for(Person p : arr) // по очереди закладывается в обьектную ссылку p
		{
			//записать файл
			String str = p.toString();
			System.out.println(p.toString());
			fw.write(str+"\r\n");
		}
		//закрыть файл
		fw.flush();
		fw.close();
	}


	// метод который 
	public static void print(ArrayList<Person> pp)
	{
		for(Person p : pp) // по очереди закладывается в обьектную ссылку p
		{
			System.out.println(p.toString());
		}
	}
}


