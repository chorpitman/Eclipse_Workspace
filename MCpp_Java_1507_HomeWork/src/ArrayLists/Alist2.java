package ArrayLists;


public class Alist2 implements Elist 
{
	private int [] ar2 = new int [30];
	private int start = 15;
	private int end = 15;


	public Alist2(int[] ini) 
	{
		init(ini);
	}

	public Alist2()
	{

	}


	@Override
	public int size()
	{

		return end - start;
	}

	@Override
	public void init(int[] ini)
	{
		clear();

		if ( ini == null)
		{
			ini = new int [0];

		}
		start -= ini.length/2;
		for (int i = 0; i < ini.length; i++)
		{
			ar2  [start+ i ] = ini[ i ];
		}
		end = start + ini.length;
	}

	@Override
	public void clear()
	{
		start = end = ar2.length/2;

	}

	@Override
	public int[] toArray()
	{
		int [] arCopy = new int [end-start];
		for (int j = 0; j < (end-start); j++) 
		{
			arCopy [ j ] = ar2[start + j];
		}

		return arCopy;
	}

	@Override
	public void addStart(int add)
	{
		
		ar2[start-1] = add;
		start --;

	}

	@Override
	public void addEnd(int add)
	{
		
		ar2[end] = add;
		end ++;
	}

	@Override
	public void addPos(int pos, int add)
	{
		start--;
		for(int i = start; i <= start + pos; i++)
		{
			ar2[i] = ar2[i + 1];
		}
		ar2[start + pos] = add;

	}

	@Override
	public int delStart()
	{
		int ret = ar2[start];
		start ++;
		return ret;
	}

	@Override
	public int delEnd()
	{
		end --;
		return ar2[end];
	}

	@Override
	public int delPos(int pos)
	{
		int ret = ar2[pos];
		end --;
		for (int j = start + pos; j < (end); j ++)
		{
			ar2[ j ] = ar2[ j + 1 ];
		}
		
				
		return ret;
	}

	@Override
	public void set(int pos, int val)
	{
		if((end - start) == 0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		ar2[start + pos] = val;

	}

	@Override
	public int get(int pos)
	{
		if( (end - start) == 0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int g = ar2[start + pos];
		return g;
	}

	@Override
	public int max()
	{
		if( (end - start) == 0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int max = ar2[start];
		for(int j = start; j < end; j++)
		{
			if(ar2[j] > max)
			{
				max = ar2[j];
			}
		}
		return max;
	}

	@Override
	public int min()
	{
		if( (end - start) == 0 )
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int min = ar2[start];
		for(int j = start; j < end; j++)
		{
			if(ar2[j] < min)
			{
				min = ar2[j];
			}
		}
		return min;
	}

	@Override
	public int maxind()
	{
		if( (end - start) == 0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int maxind = 0;
		for( int j = start; j < end; j++ )
		{
			if(ar2[j] > ar2[maxind])	
			{
				maxind = j;
			}
		}
		maxind -=  start;
		return maxind;
	}

	@Override
	public int minind()
	{
		if( (end - start) == 0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}

		int minind = start;
		for( int j = start; j < end; j++ )
		{
			if(ar2[j] < ar2[minind])	
			{
				minind = j;
			}
		}
		minind -= start;
		return minind;
	}

	@Override
	public void sort()
	{


	}

	@Override
	public void revers()
	{

		if( (end - start) == 0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int a = end-1;
		for(int i = start; i < (end + start) / 2; i++)
		{
			int tmp = ar2[i];
			ar2[i] = ar2[a];
			ar2[a] = tmp;
			a--;
		}

	}

	@Override
	public void halfRevers()
	{
		if( (end - start) == 0)
		{
			throw new IllegalArgumentException();
		}
		int half = (end - start) / 2;
		for(int i = 0; i < half; i++)
		{	
			if( (end - start) % 2 == 0)
			{
				int tmp = ar2[start + i];
				ar2[start + i] = ar2[start + half + i];
				ar2[start + half + i]= tmp;
			}
			else
			{
				int tmp = ar2[start + i];
				ar2[start + i] = ar2[start + half + i + 1];
				ar2[start + half + i + 1 ]= tmp;
			}
		}

	}

	@Override
	public int sumOdd()
	{

		if( (end - start) == 0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int sum = 0;
		for(int j = start + 1; j < end; j += 2)
		{
			sum += ar2[j];
		}
		return sum;
	}

	@Override
	public int quantEven()
	{
		int quan = 0;
		for(int j = start; j < end; j ++ )
		{
			if(ar2[j] % 2 == 0)
			{
				quan++;
			}
		}
		return quan;
	}
}
