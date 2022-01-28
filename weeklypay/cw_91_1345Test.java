package ex_weeklyPay;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class cw_91_1345Test {

	cw_91_1345 obj;
	@Before
	public void setUp() throws Exception {
		  obj=new cw_91_1345();
	}

	@Test
	public void test1() {
		assertEquals(600, obj.weeklyPay(40, 0, 18));
		 
	}
	
	
	@Test
	public void test2() {
		assertEquals(1500, obj.weeklyPay(100, 0, 18));
	}
	
	
	
	@Test
	public void test3() {
		assertEquals(0, obj.weeklyPay(0, 0, 18));
		 
	}
	
	@Test
	public void test4() {
		 
		assertEquals(1000, obj.weeklyPay(50, 0, 25));
	}
	

	@Test
	public void test5() {
		assertEquals(250, obj.weeklyPay(0, 5, 30));
		 
	}
	
	

	@Test
	public void test6() {
		assertEquals(3300, obj.weeklyPay(100, 5, 35));
		 
	}
	

	@Test
	public void test7() {
		assertEquals(1750, obj.weeklyPay(40, 5, 40));
		 
	}
	

 

	@Test
	public void test8() {
		
		assertEquals(2100, obj.weeklyPay(50, 5, 45));
		 
	}
	
	

	@Test
	public void test9() {
		assertEquals(2100, obj.weeklyPay(20, 20, 45));
		 
	}
	

	@Test
	public void test10() {
		assertEquals(102, obj.weeklyPay(1, 1, 39));
	 
	}
	
}
