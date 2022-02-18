import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class cw_63_54382Test {

	cw_63_54382 obj;
	@Before
	public void setUp()
	{
		obj=new cw_63_54382();
	}
	
	@Test
	public void testTrue1() {
		 int arr[]= {1,2,3};
		 int arr1[] = {3,2,1};
		 assertArrayEquals(arr1, obj.reverse(arr));
	 
	}
	
	@Test
	public void testTrue2() {
		int arr[]= {5};
		 int arr1[] = {5};
		 assertArrayEquals(arr1, obj.reverse(arr));
	}
	

	@Test
	public void testTrue3() {
		 
		int arr[]= {1,2,1};
		 int arr1[] = {1,2,1};
		 assertArrayEquals(arr1, obj.reverse(arr));
	}
	
	@Test
	public void testTrue4() {
		 
		int arr[]= {1,2,3,4,5,6,7};
		 int arr1[] = {7,6,5,4,3,2,1};
		 assertArrayEquals(arr1, obj.reverse(arr));
	}
	
	@Test
	public void testTrue5() {
		 
		int arr[]= {-5,-4,-3,-2,-1,0,1,2,3,4,5,6};
		 int arr1[] = {6,5,4,3,2,1,0,-1,-2,-3,-4,-5};
		 assertArrayEquals(arr1, obj.reverse(arr));
	}
	
	@Test
	public void testTrue6() {
		int arr[]= {3,3,3,3,3,3,3,3,5};
		 int arr1[] = {5,3,3,3,3,3,3,3,3};
		 assertArrayEquals(arr1, obj.reverse(arr));
		 
	}
	
	@Test
	public void testtrue7() {
		 
		int arr[]= {1,1};
		 int arr1[] = {1,1};
		 assertArrayEquals(arr1, obj.reverse(arr));
	}
	
	@Test
	public void testtrue8() {
		 
		 
			int arr[]= {1,1,1,1,1,1,2,1,1,1,1,1,1};
			 int arr1[] = {1,1,1,1,1,1,2,1,1,1,1,1,1};
			 assertArrayEquals(arr1, obj.reverse(arr));
	}
	
	@Test
	public void testtrue9() {
		 
		int arr[]= {0};
		 int arr1[] = {0};
		 assertArrayEquals(arr1, obj.reverse(arr));
	}
	 
}
