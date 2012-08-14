package com.example.test;

import android.test.AndroidTestCase;

import com.example.R;

public class ResourceTestCase extends AndroidTestCase {
	public void testFoo() {
		assertEquals("Hello, world!",
				getContext().getString(R.string.hello_world));
	}
}
