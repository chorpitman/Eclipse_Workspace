package lessons_after_vacation_9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02_Copy_Soderzhimoe 

{

	public static void main(String[] args) throws IOException 

	{        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File f = new File("/Users/Chorpita/Downloads/Mcpp/test0.txt");
		
		BufferedReader fin = new BufferedReader(new FileReader(f));
		String name;
		String line;
		
		// System.out.println("Print File "+f.getName()+"? y/n");
		
		name = br.readLine();
		if(name.equals("y"))
			while ((line = fin.readLine()) != null) 
				
				System.out.println(line);
	}

}
