package Geometric_Figures_Function;

public class Task02_triangle_f {

	public static void main(String[] args) 
	{
/*		triangle();	
	triangle_empty();*/
//	triangle1();
	triangle2();
	}

	public static void triangle()
	{
		int count = 7;
		 // Внешний цикл
        for(int i=1; i <= count; i++) 
        	{
            // Внутренний цикл для печати одной строки
            // выражение k<i -  В нем вся хитрость треугольника
           
            	for(int k=1; k <= i; k++) 
            		{
            		System.out.print("*");
            		}
            	// Переход на следующую строку
            		System.out.println();
            }
        System.out.println();
	}

        
        public static void triangle_empty()
    	{
        	int count = 7;
        	// Внешний цикл
            for (int i = 1; i <= count; i++) 
            	{
                	for (int k = 1; k <= i; k++)
                		{
                			if (k == 1 || k == i || i == count) 
                				{
                					System.out.print("*");
                				}
                			else 
                				{
                					System.out.print(" ");
                				}
                		}
                // Переход на следующую строку
                System.out.println();
            	}
            System.out.println();
    	}

        
        public static void triangle1() 
        {
        int count = 7;

    
        for(int i=1; i <= count; i++) 
        {
// Сначала вставляем пробелы с начала строки до count-i включительно
             for(int k=1; k <= count - i; k++) //цикл работает до k=6 
             {
                  System.out.print(" ");
             }
             // Потом остаток до конца строки заполняем '*'
             for (int j=count - i; j < count; j++) // цикл j работает  до j=6;
             {
                 System.out.print("*");
             }
             // Переход на следующую строку
             System.out.println();
        }
        System.out.println();
        }
        
        
        public static void triangle2() 
        {
        int count = 7;

    
        for(int i=1; i <= count; i++) 
        {
// Сначала вставляем пробелы с начала строки до count-i включительно
             for(int k=1; k <= count - i; k++) //цикл работает до k=6 
             {
                  System.out.print("*");
             }
             // Потом остаток до конца строки заполняем '*'
             for (int j=count - i; j < count; j++) // цикл j работает  до j=6;
             {
                 System.out.print(" ");
             }
             // Переход на следующую строку
             System.out.println();
        }
        System.out.println();
        }

}
