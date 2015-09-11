/**
 * 
 */
package Glava_05;

/**
 * @author Chorpita
 *
 */
class Task5_1_Manager extends Task5_1_Class
{
	private double bonus;

	public Task5_1_Manager(String n, double s, int year, int month, int day)
	{
		super(n, s, year, month, day);
		bonus = 0;
	}

	public double getSalary()
	{
		double result = 0;
		double baseSalary = super.getSalary();
		result = baseSalary + bonus;
		return	result;

	}

	public void setBonus (double b)
	{
		bonus = b;
	}

}
