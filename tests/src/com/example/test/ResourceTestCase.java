package com.example.test;

import android.test.AndroidTestCase;

import com.example.R;

public class ResourceTestCase extends AndroidTestCase {
	public void testFoo() {
		assertEquals("Hello, World!",
				getContext().getString(R.string.hello_world));
	}
}
