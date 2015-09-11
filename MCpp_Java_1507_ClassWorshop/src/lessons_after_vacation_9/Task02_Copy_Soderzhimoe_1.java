package lessons_after_vacation_9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02_Copy_Soderzhimoe_1 
{
	 public static void main(String[] args) 
	   throws InterruptedException, IOException 
	 {
	     try 
	     {
	       FileInputStream fis = new FileInputStream("/Users/Chorpita/Downloads/Mcpp/test0.txt");
	       InputStreamReader in = new InputStreamReader(fis);
	       BufferedReader buf_read = new BufferedReader(in); 
	       
	       String buffer;
	       while ((buffer = buf_read.readLine()) != null) 
	       
	       {
	        char[] bf = buffer.toCharArray();
	        
	        for (int i=0; i<bf.length;i++) 
	        
	        {
	         if(bf[i] == ' ')
	          Thread.sleep(20000); 
	         else 
	          System.out.print(bf[i]);
	        }
	        System.out.println();
	       }
	       fis.close();
	       in.close();
	       buf_read.close();
	     } 
	     catch (FileNotFoundException e) 
	     {
	       System.out.println("File not found");
	     }
	 }
	}
	

