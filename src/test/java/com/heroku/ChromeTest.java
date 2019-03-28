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
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("heroku");
		driver.findElement(By.name("btnK")).click();
		
		String title = driver.getTitle();
		
		System.out.println("Title=" + title);
		assertEquals("heroku - Google Search", title);
	}
}
