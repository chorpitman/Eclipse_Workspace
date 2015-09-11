package Conditional_Operatos_Exeption;
//Определить какой четверти принадлежит точка с координатами (х,у)
public class Task02_F_exeption 
{
	
	public static int count (int x, int y )
	{
		int resultCount=0;

		if (x>0 && y>0) 
		{
			resultCount =1;	
		}

		else if (x<0 && y>0)
		{
			resultCount = 2;
		}

		else if (x<0 && y<0) 
		{
			resultCount = 3;		
		}
		else if (x>0 && y<0)
		{
			resultCount = 4;
		}

		else 
			throw new IllegalArgumentException();

		return resultCount;
	}
	
	
}
