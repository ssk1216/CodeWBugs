import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class cw_262_55440Test {
	cw_262_55440 obj;
	@Before
	public void setUp() throws Exception {
		  obj=new cw_262_55440();
	}

	@Test
	public void test1() {
		 int arr[] = {12, 13, 14, 15, 16};
		 assertEquals(2, obj.countOdds(arr));
	}

	
	@Test
	public void test2() {
		 int arr[] = {13, 14, 15, 16, 17};
		 assertEquals(3, obj.countOdds(arr));
	}
	
	@Test
	public void test3() {
		int arr[] = {};
		 assertEquals(0, obj.countOdds(arr));
	}
	
	@Test
	public void test4() {
		int arr[] = {2,4,6,8,10,12};
		 assertEquals(0, obj.countOdds(arr));
	}
	
	@Test
	public void test5() {
		 
		 
		int arr[] = {1,3,5,7,9,11,13,15,17,19};
		 assertEquals(10, obj.countOdds(arr));
	}
	
	@Test
	public void test6() {
		 
		 
		int arr[] =  {1,1,1,1,1};
		 assertEquals(5, obj.countOdds(arr));
	}
	
	
	
	@Test
	public void test7() {
		 
		 
		int arr[] = {1,2,1,2,1,2,1,2,1,2,1};
		 assertEquals(6, obj.countOdds(arr));
	}
	
	@Test
	public void test8() {
		 
		 
		int arr[] ={6};
		 assertEquals(0, obj.countOdds(arr));
	}
	
	@Test
	public void test9() {
		 
		 
		int arr[] = {7};
		 assertEquals(1, obj.countOdds(arr));
	}
	
	
	@Test
	public void test10() {
		 
		 
		int arr[] = {1,2,1};
		 assertEquals(2, obj.countOdds(arr));
	}
	
	
}