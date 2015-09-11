package ArrayLists;

//import java.util.Arrays;


public class Alist0 implements Elist

{
	private int [] ar0 = {};
	public Alist0(int[] ini) 
	{
		init(ini);
	}


	public Alist0()
	{

	}


	@Override
	public int size () // size, 
	{
		int sizeAr = ar0.length;
		return sizeAr;
	}

	@Override
	public void init (int [] ini)  // init	
	{
		if ( ini == null)
		{
			ar0 = new int [0];
		}
		else
		{
			ar0 = new int [ini.length];
			for (int i = 0; i < ini.length; i++)
			{
				ar0 [i] = ini [i];
			}
		}
	}

	@Override
	public void clear () // clear, 
	{
		int [] tmp = {};
		ar0 = tmp;
	}

	@Override
	public int [] toArray () // to arrey копия, 
	{
		int [] arCopy = new int [ar0.length];
		for (int j = 0; j < arCopy.length; j++) 
		{
			arCopy [j] = ar0[j];
		}

		return arCopy;
	}

	@Override
	public void addStart (int add) // addstart,
	{
		int [] tmp = new int [ar0.length+1];
		tmp[0] = add;

		for (int j = 1; j < tmp.length; j++)
		{
			tmp[ j ] = ar0[ j -1];
		}
		ar0 = tmp;
	}

	@Override
	public void addEnd (int add) // addend, 
	{
		int [] tmp = new int [ar0.length+1];
		tmp[tmp.length-1] = add;

		for (int j = 0; j < tmp.length-1; j++)
		{
			tmp[ j ] = ar0[ j ];
		}
		ar0 = tmp;
	}

	@Override
	public void addPos (int pos, int add)// addpos, 
	{
		int [] tmp = new int [ar0.length+1];

		for (int j = 0; j < tmp.length; j++)
		{
			if ( j < pos)
			{
				tmp[ j ] = ar0[ j ];
			}
			else if (j == pos)
			{
				tmp[ pos ] = add;
			}
			else if (j > pos)
			{
				tmp[ j ] = ar0[ j-1 ];
			}
		}
		ar0 = tmp;	
	}

	@Override
	public int delStart () // delstart,
	{
		int [] tmp = new int [ar0.length-1];
		int ret = ar0[0];

		for (int i = 0; i < tmp.length; i++)
		{
			tmp [ i ] = ar0 [ i +1 ];
		}
		ar0 = tmp;
		return ret;
	}

	@Override
	public int delEnd () // deltend, 
	{
		int [] tmp = new int [ar0.length-1];

		int ret = ar0[ar0.length-1];

		for (int i = 0; i < tmp.length; i++)
		{
			tmp [ i ] = ar0 [ i ];
		}
		ar0 = tmp;

		return ret;
	}

	@Override
	public int delPos (int pos) // delPos
	{
		int [] tmp = new int [ar0.length-1];

		int ret = ar0[pos];

		for (int i = 0; i < tmp.length; i++)
		{
			if (i < pos)
			{
				tmp [ i ] = ar0 [ i ];
			}
			else if (i >= pos)
			{
				tmp [ i ] = ar0 [i+1];
			}
		}
		ar0 = tmp;
		return ret;
	}

	@Override
	public void set (int pos, int val)// set подменяет
	{
		ar0 [ pos ] = val;		
	}

	@Override
	public int get (int pos)// get возвращает по индексу
	{
		int p =  ar0[ pos ];
		return p;
	}

	@Override
	public int max () // max, 
	{
		int max=ar0[0];
		for (int i=0; i<ar0.length; i++ )
		{
			if (max < ar0 [i])
			{
				max = ar0 [i];
			}
		}
		return max;
	}

	@Override
	public int min () // min,
	{
		int min=ar0[0];
		for (int i=0; i<ar0.length; i++ )
		{
			if (min > ar0 [i])
			{
				min = ar0 [i];
			}
		}
		return min;
	}

	@Override
	public int maxind () // maxind,
	{
		int max=ar0[0];
		int ind =0;
		for (int i=0; i<ar0.length; i++ )
		{
			if (max < ar0[i])
			{
				max = ar0 [i];
				ind ++;
			}
		}
		return ind;
	}

	@Override
	public int minind () 	// minind,
	{
		int min=ar0[0];
		int ind =0;
		for (int i=0; i<ar0.length; i++ )
		{
			if (min > ar0[i])
			{
				min = ar0 [i];
				ind ++;
			}
		}
		return ind;
	}

	@Override
	public void sort () // sort, 
	{
		for (int i = ar0.length-1; i>0; i--)
		{
			for (int j = 0; j<i; j++)
			{
				if (ar0[j] > ar0[j+1])
				{
					int tmp = ar0[j];
					ar0[j] = ar0[j+1];
					ar0[j+1] = tmp;
				}
			}
		}
	}

	@Override
	public void revers () // revers, 
	{
		for (int i=0; i < ar0.length/2; i++)
		{
			int t = ar0[i];
			ar0[i] = ar0[ar0.length -1 - i];
			ar0[ar0.length -1 - i] = t;
		}
	}

	@Override
	public void halfRevers () // halfrevers, 
	{
		if (ar0.length%2!=0)
		{
			for (int   c = 1, a =0, b=ar0.length/2+1; c<=ar0.length/2; a++, b++, c++)
			{
				int t = ar0[a];
				ar0[a] = ar0[b];
				ar0[b] = t;
			}
		}
		else
		{
			for (int   c = 1, a =0, b=ar0.length/2; c<=ar0.length/2; a++, b++, c++)
			{
				int t = ar0[a];
				ar0[a] = ar0[b];
				ar0[b] = t;
			}
		}
	}

	@Override
	public int sumOdd () // sum odd сумма нечетных элементов
	{
		int sum=0;

		for (int i=0; i<ar0.length; i++ )
		{
			if (i%2!=0)
			{
				sum += ar0[i];
			}
		}
		return sum;
	}

	@Override
	public int quantEven () // quantEven число четных элементов
	{
		int quant = 0;
		for (int i : ar0)
		{
			if (i%2==0)
			{
				quant ++;
			}
		}
		return quant;

	}
}