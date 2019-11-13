package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

import org.junit.jupiter.api.Test;

import Examples.TestEx;

class TestExTest {

	@Test
	void testcheckPositive1() {
		TestEx te = new TestEx();
		boolean expected = false;
		boolean actual = te.checkPositive(-1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testcheckPositive2() {
		TestEx te = new TestEx();
		boolean expected = true;
		boolean actual = te.checkPositive(1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testcheckPositive3() {
		TestEx te = new TestEx();
		assertThrows(InputMismatchException.class,() ->{te.checkPositive(0);});
	}
	
	@Test
	void testdropFirstLetter() {
		TestEx te = new TestEx();
		String expected = "pple";
		String actual = te.dropFirstLetter("apple");
		assertEquals(expected, actual);
	}
}
