import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class cw_63_56045Test {
	cw_63_56045 obj;
	@Before
	public void setUp() throws Exception {
		  obj=new cw_63_56045();
	}

	@Test
	public void test1() {
		 int arr[] = {1,2,3};
		 assertEquals(1, obj.positionOfValueInArray(arr,2));
	}

	
	@Test
	public void test2() {
		 int arr[] = {1,2,3};
		 assertEquals(-1, obj.positionOfValueInArray(arr,5));
	}
	
	@Test
	public void test3() {
		 int arr[] = {0,0,0,0};
		 assertEquals(-1, obj.positionOfValueInArray(arr,1));
	}
	
	@Test
	public void test4() {
		 int arr[] = {0,0,1,1};
		 assertEquals(2, obj.positionOfValueInArray(arr,1));
	}
	
	@Test
	public void test5() {
		 
		 
		 int arr[] = {0,0,1,1};
		 assertEquals(-1, obj.positionOfValueInArray(arr,2));
	}
	
	@Test
	public void test6() {
		 
		 
		 int arr[] = {5};
		 assertEquals(0, obj.positionOfValueInArray(arr,5));
	}
	
	
	
	@Test
	public void test7() {
		 
		 
		 int arr[] = {5};
		 assertEquals(-1, obj.positionOfValueInArray(arr,7));
	}
	
	@Test
	public void test8() {
		 
		 
		 int arr[] = {5,4,3,2,1,4};
		 assertEquals(1, obj.positionOfValueInArray(arr,4));
	}
	
	@Test
	public void test9() {
		 
		 
		 int arr[] = {5,4,3,2,1,4};
		 assertEquals(2, obj.positionOfValueInArray(arr,3));
	}
	
	
	@Test
	public void test10() {
		 
		 
		 int arr[] = {5,4,3,2,1,4};
		 assertEquals(4, obj.positionOfValueInArray(arr,1));
	}
	
	
}