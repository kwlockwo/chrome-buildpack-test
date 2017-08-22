package com.heroku;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChromeTest {

	@Test
	public void test() {
		Chrome chromeTest = new Chrome();
		assertEquals("Google", chromeTest.getGoogle());
	}

}
