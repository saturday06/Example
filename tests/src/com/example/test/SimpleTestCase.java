package com.example.test;

import junit.framework.TestCase;

public class SimpleTestCase extends TestCase {
	public void testBarSuccess() {
		assertTrue(true);
	}

	public void testBarFailure() {
		fail();
	}

	public void testFooSuccess() {
		assertTrue(true);
	}

	public void testFooFailure() {
		fail();
	}
}
