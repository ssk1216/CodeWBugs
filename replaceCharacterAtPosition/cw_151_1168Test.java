package ex_replaceCharacterAtPosition;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

 

public class cw_151_1168Test {

	cw_151_1168 obj;
	@Before
	public void setUp() throws Exception {
		  obj= new cw_151_1168();
	}

	@Test
	public void test1() {
		assertEquals("Xbc",obj.replaceCharacterAtPosition(0,"abc",'X'));
	}
	

	@Test
	public void test2() {
		assertEquals("aXc",obj.replaceCharacterAtPosition(1,"abc",'X'));
	}																			
	
	@Test
	public void test3() {
		assertEquals("abX",obj.replaceCharacterAtPosition(2,"abc",'X'));
	}	
	
	@Test
	public void test4() {
		assertEquals("hellX",obj.replaceCharacterAtPosition(4,"hello",'X'));
	}
	
	@Test
	public void test5() {
		assertEquals("Xello",obj.replaceCharacterAtPosition(0,"hello",'X'));
	}
	
	@Test
	public void test6() {
		assertEquals("hello world",obj.replaceCharacterAtPosition(5,"helloXworld",' '));
	}
	
	@Test
	public void test7() {
		assertEquals("A",obj.replaceCharacterAtPosition(0,"a",'A'));
	}
	
	@Test
	public void test8() {
		assertEquals("A",obj.replaceCharacterAtPosition(0,"a",'A'));
	}	
	@Test
	public void test9() {
		assertEquals("012345678_",obj.replaceCharacterAtPosition(9,"0123456789",'_'));
	}
	@Test
	public void test10() {
		assertEquals("_123456789",obj.replaceCharacterAtPosition(0,"0123456789",'_'));
	}
	@Test
	public void test11() {
		assertEquals("01234_6789",obj.replaceCharacterAtPosition(5,"0123456789",'_'));
	}
	
	 
}																																																																																																																																																																																																																																																																									                             																													