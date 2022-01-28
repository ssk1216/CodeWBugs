package ex_containersNeeded;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class cw_245_255Test {
	
	cw_245_255 obj;
	@Before
	public void setUp() throws Exception {
		
		obj=new cw_245_255 ();
	}

	@Test
	public void test1() {
		 assertEquals(1,  obj.containersNeeded(5));
	}
	
	@Test
	public void test2() {
		 assertEquals(1,  obj.containersNeeded(1));
	}
	
	@Test
	public void test3() {
		 assertEquals(0,  obj.containersNeeded(0));
	}
	
	@Test
	public void test4() {
		 assertEquals(1,  obj.containersNeeded(10));
	}
	
	@Test
	public void test5() {
		 assertEquals(2,  obj.containersNeeded(11));
	}
	
	@Test
	public void test6() {
		 assertEquals(2,  obj.containersNeeded(20));
	}
	
	@Test
	public void test7() {
		 assertEquals(3,  obj.containersNeeded(21));
	}
	
	@Test
	public void test8() {
		 assertEquals(4,  obj.containersNeeded(31));
	}
	
	@Test
	public void test9() {
		 assertEquals(26,  obj.containersNeeded(253));
	}
	
	@Test
	public void test10() {
		 assertEquals(101,  obj.containersNeeded(1001));
	}
	
}
