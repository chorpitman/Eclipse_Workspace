package lesson2;
//Определить какой четверти принадлежит точка с координатами (х,у)
public class Task4 {

	public static void main(String[] args) 
	{
		int x=-5;
		int y=5;

		int result=0;

		if (x>0 && y>0) 
		{
			result =1;	
		}
		else if (x<0 && y>0)
		{
			result = 2;
		}
		else if (x<0 && y<0) 
		{
			result = 3;		
		}
		else
		{
			result = 4;
		}

		System.out.println(result);
	}

}
