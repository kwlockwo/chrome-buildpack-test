package com.heroku;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.tap4j.ext.junit.runner.TapRunnerClass;

@RunWith(TapRunnerClass.class)
public class ChromeTest {

	@Test
	public void test() {
		Chrome chromeTest = new Chrome();
		assertEquals("Google", chromeTest.getGoogle());
	}

}