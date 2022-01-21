import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class cw_179_91Test {

	cw_179_91 obj;
	@Before
	public void setUp() throws Exception {
		
		obj=new cw_179_91();
	}

	@Test
	public void test1() {
		 assertEquals("dello worlH", obj.swapEnds("Hello world"));
	}
	
	@Test
	public void test2() {
		 assertEquals("", obj.swapEnds(""));
	}

	@Test
	public void test3() {
		 assertEquals("a", obj.swapEnds("a"));
	}
	
	@Test
	public void test4() {
		 assertEquals("ba", obj.swapEnds("ab"));
	}
	
	
	@Test
	public void test5() {
		 assertEquals("oellH", obj.swapEnds("Hello"));
	}
	
	
	@Test
	public void test7() {
		 assertEquals("xxx", obj.swapEnds("xxx"));
	}
	
	
	@Test
	public void test8() {
		 assertEquals("xox", obj.swapEnds("xox"));
	}
	

	@Test
	public void test9() {
		 assertEquals("4231", obj.swapEnds("1234"));
	}
	
	@Test
	public void test10() {
		 assertEquals("eomputer sciencc", obj.swapEnds("computer science"));
	}
	
	@Test
	public void test11() {
		 assertEquals("zbcdefghijklmnopqrstuvwxya", obj.swapEnds("abcdefghijklmnopqrstuvwxyz"));
	}
	
}
