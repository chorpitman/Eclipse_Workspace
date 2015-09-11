package ArrayLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlistTest 
{
	Elist al = new Alist0 ();
	//Elist al = new Alist1 ();
	//Elist al = new Alist2 ();

	
	//================================================
	// size
	//================================================
	
	@Test
	public void testSize_1() 
	{
		int [] test = {1,2,3,4,5};
		al.init(test);
		int res = al.size();
		assertEquals(5, res);
	}
	@Test
	public void testSize_2() 
	{
		int [] test = {1};
		al.init(test);
		int res = al.size();
		assertEquals(1, res);
	}
	@Test
	public void testSize_3() 
	{
		int [] test = {1,2};
		al.init(test);
		int res = al.size();
		assertEquals(2, res);
	}
	@Test
	public void testSize_4() 
	{
		int [] test = {};
		al.init(test);
		int res = al.size();
		assertEquals(0, res);
	}
	@Test
	public void testSize_5()
	{
		int [] test = null;
		al.init(test);
		int res = al.size();
		assertEquals(0, res);
	}
	//================================================
	// clear
	//================================================
	@Test
	public void	testClear_1()
	{
		int [] test = null;
		int [] befotTest = {};
		al.init(test);
		al.clear();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testClear_2()
	{
		int [] test = {};
		int [] befotTest = {};
		al.init(test);
		al.clear();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testClear_3()
	{
		int [] test = {1};
		int [] befotTest = {};
		al.init(test);
		al.clear();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testClear_4()
	{
		int [] test = {1,2};
		int [] befotTest = {};
		al.init(test);
		al.clear();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testClear_5()
	{
		int [] test = {1,2,3,4,5,6,7,8,9};
		int [] befotTest = {};
		al.init(test);
		al.clear();
		assertArrayEquals(befotTest, al.toArray());
	}

	@Test
	public void	testtoArray_1()
	{
		int [] test = {1,2,3,4,5,6};
		al.init(test);
		int [] copy = al.toArray();
		assertArrayEquals(test, copy);
	}
	@Test
	public void	testtoArray_2()
	{
		int [] test = {1};
		al.init(test);
		int [] copy = al.toArray();
		assertArrayEquals(test, copy);
	}
	@Test
	public void	testtoArray_3()
	{
		int [] test = {1,2};
		al.init(test);
		int [] copy = al.toArray();
		assertArrayEquals(test, copy);
	}
	@Test
	public void	testtoArray_4()
	{
		int [] test = {};
		al.init(test);
		int [] copy = al.toArray();
		assertArrayEquals(test, copy);
	}
	@Test (expected = AssertionError.class)
	public void	testtoArray_5()
	{
		int [] test = null;
		al.init(test);
		int [] copy = al.toArray();
		assertArrayEquals(test, copy);
	}

	@Test
	public void testGet_1() 
	{
		int [] test = {1,2,3,4,5,6};
		al.init(test);
		int res = al.get(0);
		assertEquals(1, res);
	}
	@Test
	public void testGet_2() 
	{
		int [] test = {1,2,3,4,5,6};
		al.init(test);
		int res = al.get(4);
		assertEquals(5, res);
	}
	@Test
	public void testGet_3() 
	{
		int [] test = {1,2,3,4,5,6};
		al.init(test);
		int res = al.get(5);
		assertEquals(6, res);
	}
	@Test
	public void testGet_4() 
	{
		int [] test = {1,2,3,4,5,6};
		al.init(test);
		int res = al.get(1);
		assertEquals(2, res);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testGet_5()
	{
		int [] test = {};
		al.init(test);
		al.get(1);
	}

	@Test
	public void	testAddStart_1()
	{
		int [] test = {};
		int [] befotTest = {9};
		al.init(test);
		al.addStart(9);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testAddStart_2()
	{
		int [] test = null;
		int [] befotTest = {9};
		al.init(test);
		al.addStart(9);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testAddStart_3()
	{
		int [] test = {1};
		int [] befotTest = {9,1};
		al.init(test);
		al.addStart(9);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testAddStart_4()
	{
		int [] test = {1,2};
		int [] befotTest = {9,1,2};
		al.init(test);
		al.addStart(9);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testAddStart_5()
	{
		int [] test = {1,2,3,4,5,6,7,8};
		int [] befotTest = {9,1,2,3,4,5,6,7,8};
		al.init(test);
		al.addStart(9);
		assertArrayEquals(befotTest, al.toArray());
	}

	@Test
	public void	testAddEnd_1()
	{
		int [] test = {};
		int [] befotTest = {9};
		al.init(test);
		al.addEnd(9);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testAddEnd_2()
	{
		int [] test = null;
		int [] befotTest = {9};
		al.init(test);
		al.addEnd(9);
		assertArrayEquals(befotTest, al.toArray());
	}	
	@Test
	public void	testAddEnd_3()
	{
		int [] test = {1};
		int [] befotTest = {1,9};
		al.init(test);
		al.addEnd(9);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testAddEnd_4()
	{
		int [] test = {1,2};
		int [] befotTest = {1,2,9};
		al.init(test);
		al.addEnd(9);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testAddEnd_5()
	{
		int [] test = {1,2,3,4,5,6,7,8,9};
		int [] befotTest = {1,2,3,4,5,6,7,8,9,9};
		al.init(test);
		al.addEnd(9);
		assertArrayEquals(befotTest, al.toArray());
	}

	@Test
	public void	testAddPos_1()
	{
		int [] test = {1,2,3,4,5,6};
		int [] befotTest = {9,1,2,3,4,5,6};
		al.init(test);
		al.addPos(0, 9);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testAddPos_2()
	{
		int [] test = {1,2,3,4,5,6};
		int [] befotTest = {9,1,2,3,4,5,6};
		al.init(test);
		al.addPos(0, 9);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testAddPos_3()
	{
		int [] test = {1,2,3,4,5,6};
		int [] befotTest = {1,9,2,3,4,5,6};
		al.init(test);
		al.addPos(1, 9);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testAddPos_4()
	{
		int [] test = {1,2,3,4,5,6};
		int [] befotTest = {1,2,3,4,5,6,9};
		al.init(test);
		al.addPos(6, 9);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test //(expected = ArrayIndexOutOfBoundsException.class)
	public void	testAddPos_5()
	{
		int [] test = {};
		int [] befotTest = {};
		al.init(test);
		al.addPos(6, 9);
		assertArrayEquals(befotTest, al.toArray());
	}

	@Test (expected = NegativeArraySizeException.class)
	public void	tesDelStart_1()
	{
		int [] test = {};
		al.init(test);
		al.delStart();
	}
	@Test (expected = NegativeArraySizeException.class)
	public void	tesDelStart_2()
	{
		int [] test = null;
		al.init(test);
		al.delStart();

	}
	@Test
	public void	tesDelStart_3()
	{
		int [] test = {1};
		int [] befotTest = {};
		al.init(test);
		al.delStart();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	tesDelStart_4()
	{
		int [] test = {1,2};
		int [] befotTest = {2};
		al.init(test);
		al.delStart();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	tesDelStart_5()
	{
		int [] test = {1,2,3,4,5,6,7,8,9};
		int [] befotTest = {2,3,4,5,6,7,8,9};
		al.init(test);
		al.delStart();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test (expected = NegativeArraySizeException.class)
	public void	tesDelEnd_1()
	{
		int [] test = {};
		al.init(test);
		al.delEnd();
	}
	@Test (expected = NegativeArraySizeException.class)
	public void	tesDelEnd_2()
	{
		int [] test = null;
		al.init(test);
		al.delEnd();
	}
	@Test
	public void	tesDelEnd_3()
	{
		int [] test = {1};
		int [] befotTest = {};
		al.init(test);
		al.delEnd();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	tesDelEnd_4()
	{
		int [] test = {1,2};
		int [] befotTest = {1};
		al.init(test);
		al.delEnd();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	tesDelEnd_5()
	{
		int [] test = {1,2,3,4,5,6,7,8,9};
		int [] befotTest = {1,2,3,4,5,6,7,8};
		al.init(test);
		al.delEnd();
		assertArrayEquals(befotTest, al.toArray());
	}

	@Test
	public void	testDelPos_1()
	{
		int [] test = {1,2,3,4,5,6};
		int [] befotTest = {2,3,4,5,6};
		al.init(test);
		al.delPos(0);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testDelPos_2()
	{
		int [] test = {1,2,3,4,5,6};
		int [] befotTest = {1,3,4,5,6};
		al.init(test);
		al.delPos(1);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testDelPos_3()
	{
		int [] test = {1,2,3,4,5,6};
		int [] befotTest = {1,2,3,4,6};
		al.init(test);
		al.delPos(4);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test  (expected = NegativeArraySizeException.class)
	public void	testDelPos_4()
	{
		int [] test = null;

		al.init(test);
		al.delPos(0);
	}
	@Test  (expected = NegativeArraySizeException.class)
	public void	testDelPos_5()
	{
		int [] test = {};
		al.init(test);
		al.delPos(0);
	}

	@Test 
	public void	testSet_1()
	{
		int [] test = {1};
		int [] befotTest = {555};
		al.init(test);
		al.set(0, 555);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test 
	public void	testSet_2()
	{
		int [] test = {1,2};
		int [] befotTest = {1,555};
		al.init(test);
		al.set(1, 555);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test 
	public void	testSet_3()
	{
		int [] test = {1,2,3,4,5,6,7,8,9};
		int [] befotTest = {1,2,3,4,5,555,7,8,9};
		al.init(test);
		al.set(5, 555);
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test  (expected = ArrayIndexOutOfBoundsException.class)
	public void	testSet_4()
	{
		int [] test = {};
		al.init(test);
		al.set(0, 555);
	}
	@Test  (expected = ArrayIndexOutOfBoundsException.class)
	public void	testSet_5()
	{
		int [] test =null;
		al.init(test);
		al.set(0, 555);
	}

	@Test
	public void testMax_1() 
	{
		int [] test = {1};
		al.init(test);
		int res = al.max();
		assertEquals(1, res);
	}
	@Test
	public void testMax_2() 
	{
		int [] test = {1,2};
		al.init(test);
		int res = al.max();
		assertEquals(2, res);
	}
	@Test
	public void testMax_3() 
	{
		int [] test = {1,2,3,4,5};
		al.init(test);
		int res = al.max();
		assertEquals(5, res);
	}
	@Test  (expected = ArrayIndexOutOfBoundsException.class)
	public void testMax_4() 
	{
		int [] test = {};
		al.init(test);
		al.max();

	}
	@Test  (expected = ArrayIndexOutOfBoundsException.class)
	public void testMax_5() 
	{
		int [] test = null;
		al.init(test);
		al.max();
	}

	@Test
	public void testMin_1() 
	{
		int [] test = {1};
		al.init(test);
		int res = al.min();
		assertEquals(1, res);
	}
	@Test
	public void testMin_2() 
	{
		int [] test = {1,2};
		al.init(test);
		int res = al.min();
		assertEquals(1, res);
	}
	@Test
	public void testMin_3() 
	{
		int [] test = {1,2,3,4,5};
		al.init(test);
		int res = al.min();
		assertEquals(1, res);
	}
	@Test  (expected = ArrayIndexOutOfBoundsException.class)
	public void testMin_4() 
	{
		int [] test = {};
		al.init(test);
		al.min();
	}
	@Test  (expected = ArrayIndexOutOfBoundsException.class)
	public void  testMin_5() 
	{
		int [] test = null;
		al.init(test);
		al.min();
	}

	@Test
	public void testMaxInd_1()
	{
		int [] test = {1};
		al.init(test);
		int res = al.maxind();
		assertEquals(0, res);
	}
	@Test
	public void testMaxInd_2() 
	{
		int [] test = {1,2};
		al.init(test);
		int res = al.maxind();
		assertEquals(1, res);
	}
	@Test
	public void  testMaxInd_3() 
	{
		int [] test = {0,1,2,3,4,5,6,7,8,9};
		al.init(test);
		int res = al.maxind();
		assertEquals(9, res);
	}
	@Test  (expected = ArrayIndexOutOfBoundsException.class)
	public void testMaxInd_4() 
	{
		int [] test = {};
		al.init(test);
		al.maxind();
	}
	@Test  (expected = ArrayIndexOutOfBoundsException.class)
	public void  testMaxInd_5() 
	{
		int [] test = null;
		al.init(test);
		al.maxind();
	}

	@Test
	public void testMinind_1()
	{
		int [] test = {1};
		al.init(test);
		int res = al.minind();
		assertEquals(0, res);
	}
	@Test
	public void testMinind_2() 
	{
		int [] test = {1,2};
		al.init(test);
		int res = al.minind();
		assertEquals(0, res);
	}
	@Test
	public void testMinind_3() 
	{
		int [] test = {9,2,3,4,5};
		al.init(test);
		int res = al.minind();
		assertEquals(1, res);
	}
	@Test  (expected = ArrayIndexOutOfBoundsException.class)
	public void testMinind_4() 
	{
		int [] test = {};
		al.init(test);
		al.minind();
	}
	@Test  (expected = ArrayIndexOutOfBoundsException.class)
	public void testMinind_5() 
	{
		int [] test = null;
		al.init(test);
		al.minind();
	}

	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void	testRevers_1()
	{
		int [] test = {};
		int [] befotTest = {};
		al.init(test);
		al.revers();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void	testRevers_2()
	{
		int [] test = null;
		int [] befotTest = null;
		al.init(test);
		al.revers();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testRevers_3()
	{
		int [] test = {1};
		int [] befotTest = {1};
		al.init(test);
		al.revers();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testRevers_4()
	{
		int [] test = {1,2};
		int [] befotTest = {2,1};
		al.init(test);
		al.revers();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testRevers_5()
	{
		int [] test = {1,2,3,4,5,6,7,8,9};
		int [] befotTest = {9,8,7,6,5,4,3,2,1};
		al.init(test);
		al.revers();
		assertArrayEquals(befotTest, al.toArray());
	}

	public void	testHalfRevers_1()
	{
		int [] test = {};
		int [] befotTest = {};
		al.init(test);
		al.halfRevers();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test (expected = IllegalArgumentException.class)
	public void	testHalfRever_2()
	{
		int [] test = null;
		int [] befotTest = null;
		al.init(test);
		al.halfRevers();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testHalfRever_3()
	{
		int [] test = {1};
		int [] befotTest = {1};
		al.init(test);
		al.halfRevers();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testHalfRever_4()
	{
		int [] test = {1,2};
		int [] befotTest = {2,1};
		al.init(test);
		al.halfRevers();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testHalfRever_5()
	{
		int [] test = {1,2,3,4};
		int [] befotTest = {3,4,1,2};
		al.init(test);
		al.halfRevers();
		assertArrayEquals(befotTest, al.toArray());
	}
	@Test
	public void	testHalfRever_6()
	{
		int [] test = {1,2,3,4,5};
		int [] befotTest = {4,5,3,1,2};
		al.init(test);
		al.halfRevers();
		assertArrayEquals(befotTest, al.toArray());
	}

	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSumOdd_1() 
	{
		int [] test = {};
		al.init(test);
		int res = al.sumOdd();
		assertEquals(0, res);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSumOdd_2() 
	{
		int [] test = null;
		al.init(test);
		int res = al.sumOdd();
		assertEquals(0, res);
	}
	@Test
	public void testSumOdd_3() 
	{
		int [] test = {1};
		al.init(test);
		int res = al.sumOdd();
		assertEquals(0, res);
	}
	@Test
	public void testSumOdd_4() 
	{
		int [] test = {1,2};
		al.init(test);
		int res = al.sumOdd();
		assertEquals(2, res);
	}
	@Test
	public void testSumOdd_5() 
	{
		int [] test = {1,2,3,4,5};
		al.init(test);
		int res = al.sumOdd();
		assertEquals(6, res);
	}

	@Test
	public void testQuantEven_1() 
	{
		int [] test = {};
		al.init(test);
		int res = al.quantEven();
		assertEquals(0, res);
	}
	@Test
	public void testQuantEven_2() 
	{
		int [] test = null;
		al.init(test);
		int res = al.quantEven();
		assertEquals(0, res);
	}
	@Test
	public void testQuantEven_3() 
	{
		int [] test = {1};
		al.init(test);
		int res = al.quantEven();
		assertEquals(0, res);
	}
	@Test
	public void testQuantEven_4() 
	{
		int [] test = {1,2};
		al.init(test);
		int res = al.quantEven();
		assertEquals(1, res);
	}
	@Test
	public void testQuantEven_5() 
	{
		int [] test = {1,2,3,4,5};
		al.init(test);
		int res = al.quantEven();
		assertEquals(2, res);
	}

}
