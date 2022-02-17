

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class cw_106_55816Test {
	
	cw_106_55816 obj;
	@Before
	public void setUp() throws Exception {
		
		obj=new cw_106_55816 ();
	}

	@Test
	public void test1() {
		 assertEquals(true,  obj.magicNumbers(684,114));
	}
	
	@Test
	public void test2() {
		 assertEquals(true,  obj.magicNumbers(900,450));
	}
	
	@Test
	public void test3() {
		assertEquals(true,  obj.magicNumbers(1000,3000));
	}
	
	@Test
	public void test4() {
		assertEquals(true,  obj.magicNumbers(90,30));
	}
	
	@Test
	public void test5() {
		assertEquals(false,  obj.magicNumbers(100,100));
	}
	
	@Test
	public void test6() {
		assertEquals(false,  obj.magicNumbers(1000,100));
	}
	
	@Test
	public void test7() {
		assertEquals(false,  obj.magicNumbers(200,101));
	}
	
	@Test
	public void test8() {
		assertEquals(true,  obj.magicNumbers(228,912));
	}
	
	@Test
	public void test9() {
		assertEquals(false,  obj.magicNumbers(924,461));
	}
	
	@Test
	public void test10() {
		assertEquals(true,  obj.magicNumbers(114,684));
	}
	
}
