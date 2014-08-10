package com.java.hackbulgaria.collections1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BracketsTest {
	private Brackets expression;

	@Before
	public void setUp() throws Exception {
		expression = new Brackets();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(true, expression.isCorrectExpression("()"));
		assertEquals(false, expression.isCorrectExpression("())"));
	}

}
