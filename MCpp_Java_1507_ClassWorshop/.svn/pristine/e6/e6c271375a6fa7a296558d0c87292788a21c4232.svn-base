package lessons_after_vacation_9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task01_Copy 
{

	public static void main(String[] args) 
	{
		//	copy();
		copy1("/Users/Chorpita/Downloads/Mcpp/test2.rtf", "/Users/Chorpita/Downloads/McppCopy/test2.rtf");
	}

	public static void copy() 
	{ 
		Path pathSource = Paths.get("/Users/Chorpita/Downloads/Mcpp/test1.rtf"); 
		Path pathDestination = Paths.get("/Users/Chorpita/Downloads/McppCopy/test1.rtf"); 


		try 
		{ 
			Files.copy(pathSource, pathDestination); 
			System.out.println("Source file copied successfully"); 
		} 

		catch (IOException e) 
		{ 
			e.printStackTrace(); 
		} 
	}

	public static void copy1 (String s1, String s2)
	{
		InputStream inStream = null;
		OutputStream outStream = null;

		try 
		{
			File fromFile = new File(s1);
			File toFile = new File(s2);
			inStream = new FileInputStream(fromFile);
			outStream = new FileOutputStream(toFile);
			byte[] buffer = new byte[1024];
			int length;

			while ((length = inStream.read(buffer)) > 0) 
			{
				outStream.write(buffer, 0, length);
			}
			System.out.println("Копирование файла завершено"); 
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 

		finally 
		{
			try 
			{
				inStream.close();
			}
			catch (Exception e)
			{

			}
			try
			{
				outStream.close();
			} 
			catch (Exception e) 
			{

			}
		}

	}
}


