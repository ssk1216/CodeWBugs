import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class cw_155_569Test {

	cw_155_569 obj;
	@Before
	public void setUp()
	{
		obj=new cw_155_569();
	}
	
	@Test
	public void testTrue1() {
		 
		assertEquals(true, obj.productIsEven(10, 20));
	}
	
	@Test
	public void testTrue2() {
		 
		assertEquals(true, obj.productIsEven(2, 17));
	}
	

	@Test
	public void testTrue3() {
		 
		assertEquals(true, obj.productIsEven(0, 0));
	}
	
	@Test
	public void testTrue4() {
		 
		assertEquals(true, obj.productIsEven(0, 1));
	}
	
	@Test
	public void testTrue5() {
		 
		assertEquals(true, obj.productIsEven(2, 15));
	}
	
	@Test
	public void testTrue6() {
		 
		assertEquals(true, obj.productIsEven(2, 13));
	}
	
	@Test
	public void testFalse1() {
		 
		assertEquals(false, obj.productIsEven(5, 5));
	}
	
	@Test
	public void testFalse2() {
		 
		assertEquals(false, obj.productIsEven(1, 13));
	}
	
	@Test
	public void testFalse3() {
		 
		assertEquals(false, obj.productIsEven(1, 15));
	}
	
	@Test
	public void testFalse4() {
		 
		assertEquals(false, obj.productIsEven(1, 17));
	}
}
