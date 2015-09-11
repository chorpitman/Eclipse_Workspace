package ArrayLists;


public class Alist1 implements Elist
{
	private int [] ar1 = new int [10];
	private int index = 0;

	public Alist1(int[] ini) 
	{
		init(ini);
	}

	public Alist1()
	{

	}

	@Override
	public int size() 
	{
		return index;
	}

	@Override
	public void init(int[] ini) 
	{
		if ( ini == null)
		{
			ini = new int [0];
		}

		for (int i = 0; i < ini.length; i++)
		{
			ar1 [i] = ini[i];
		}
		index = ini.length;
	}

	@Override
	public void clear() 
	{
		index = 0;
	}

	@Override
	public int[] toArray() 
	{
		int [] arCopy = new int [index];
		for (int j = 0; j < index; j++) 
		{
			arCopy [j] = ar1[j];
		}

		return arCopy;
	}

	@Override
	public void addStart(int add) 
	{
		index ++;

		for (int j = index; j > 0; j--)
		{
			ar1[ j ] = ar1[ j -1];
		}
		ar1[0] = add;

	}

	@Override
	public void addEnd(int add) 
	{
		index ++;
		ar1[index-1] = add;
	}

	@Override
	public void addPos(int pos, int add) 
	{
		index ++;
		for (int j = index; j > pos; j --)
		{
			ar1[ j ] = ar1[ j -1];
		}
		ar1[pos] = add;
	}

	@Override
	public int delStart() 
	{
		int ret = ar1[0];

		for (int j = 0; j > index ; j++)
		{
			ar1[ j ] = ar1[ j + 1];
		}
		index --;
		return ret;
	}

	@Override
	public int delEnd() 
	{
		int ret = ar1[index-1];
		index --;
		return ret;
	}

	@Override
	public int delPos(int pos) 
	{
		int ret = ar1[pos];

		for (int j = index; j > pos; j --)
		{
			ar1[ j ] = ar1[ j -1];
		}
		index --;
		return ret;
	}

	@Override
	public void set(int pos, int val) 
	{


	}

	@Override
	public int get(int pos) 
	{

		return 0;
	}

	@Override
	public int max() 
	{

		return 0;
	}

	@Override
	public int min() 
	{

		return 0;
	}

	@Override
	public int maxind() 
	{

		return 0;
	}

	@Override
	public int minind() 
	{

		return 0;
	}

	@Override
	public void sort() 
	{


	}

	@Override
	public void revers() 
	{


	}

	@Override
	public void halfRevers() 
	{


	}

	@Override
	public int sumOdd() 
	{

		return 0;
	}

	@Override
	public int quantEven() 
	{

		return 0;
	}
}
