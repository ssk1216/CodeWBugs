import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class cw_158_56148Test {
	cw_158_56148 obj;
	@Before
	public void setUp() throws Exception {
		  obj=new cw_158_56148();
	}

	@Test
	public void test1() {
		 
		 
		 int arr[] = {};
		 assertEquals(0, obj.sumValues(arr,false));
	}

	
	@Test
	public void test2() {
		 
		 
		 int arr[] = {};
		 assertEquals(0, obj.sumValues(arr,true));
	}
	
	@Test
	public void test3() {
		 
		 
		 int arr[] = {1,2,3,4,5};
		 assertEquals(15, obj.sumValues(arr,false));
	}
	
	@Test
	public void test4() {
		 
		 
		 int arr[] = {1,2,3,4,5};
		 assertEquals(15, obj.sumValues(arr,true));
	}
	
	@Test
	public void test5() {
		 
		 
		 int arr[] = {-1};
		 assertEquals(-1, obj.sumValues(arr,false));
	}
	
	@Test
	public void test6() {
		 
		 
		 int arr[] = {-1};
		 assertEquals(0, obj.sumValues(arr,true));
	}
	
	
	
	@Test
	public void test7() {
		 
		 
		 int arr[] = {-1,2,-3,4,-5,6};
		 assertEquals(12, obj.sumValues(arr,true));
	}
	
	@Test
	public void test8() {
		 
		 
		 int arr[] = {-1,2,-3,4,-5,6};
		 assertEquals(3, obj.sumValues(arr,false));
	}
	
	@Test
	public void test9() {
		 
		 
		 int arr[] = {-1,-2,-3,-4,-5};
		 assertEquals(-15, obj.sumValues(arr,false));
	}
	
	
	@Test
	public void test10() {
		 
		 
		 int arr[] = {-1,-2,-3,-4,-5};
		 assertEquals(0, obj.sumValues(arr,true));
	}
	
	
}
