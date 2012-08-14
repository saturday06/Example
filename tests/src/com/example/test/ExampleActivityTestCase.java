package com.example.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import android.test.ActivityInstrumentationTestCase2;

import com.example.ExampleActivity;

public class ExampleActivityTestCase extends
		ActivityInstrumentationTestCase2<ExampleActivity> {
	public ExampleActivityTestCase(Class<ExampleActivity> activityClass) {
		super(activityClass);
	}

	public void testRunOnUiThread() throws Exception {
		final CountDownLatch cdl = new CountDownLatch(1);
		getActivity().runOnUiThread(new Runnable() {
			public void run() {
				cdl.countDown();
			}
		});
		assertTrue(cdl.await(10, TimeUnit.SECONDS));
	}
}
