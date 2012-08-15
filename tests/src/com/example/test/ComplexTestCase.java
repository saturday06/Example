package com.example.test;

import junit.framework.TestCase;

public class ComplexTestCase extends TestCase {
	public void testHogeSuccess() {
		assertTrue(true);
	}

	public void testHogeFailure() {
		fail();
	}

	public void testFugaSuccess() {
		assertTrue(true);
	}

	public void testFugaFailure() {
		fail();
	}
}



