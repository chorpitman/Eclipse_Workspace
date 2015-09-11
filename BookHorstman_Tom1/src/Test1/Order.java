package Test1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Order 
{

	public Order (String aTypeOfDate, int bDeliveryTime, int c)
	{
		typeOfOrder = aTypeOfDate;
		DeliveryTime = DateOfOrder;
		DateOfOrder = c;
		GregorianCalendar calendar = new GregorianCalendar();
		
		
	}

	// Методы 
	public String getTypeOfOrder ()
	{
		String res = null;
		switch (typeOfOrder) 
		{
		case "OH":
			System.out.println("Тип заказа ОХ");
			break;
		case "Purchase":
			System.out.println("Тип заказа Покупка");
			break;
		case "Postponement":
			System.out.println("Тип заказа Отсрочка");
			break;	
			
		default:
			System.out.println("Введите правильный номер заказа");
			break;
		}
		return res;
	}
	
	public int getDeliveryTime ()
	{
		return DeliveryTime = Calendar.MONTH;
	}
	
	public int getDateOfOrder ()
	{
		return DateOfOrder = Calendar.YEAR;
	}

	private	String typeOfOrder;
	private int DeliveryTime;
	private	int DateOfOrder;
}
