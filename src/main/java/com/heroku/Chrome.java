package com.heroku;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	private WebDriver driver;
	
	public Chrome() {
		String chromeBin = System.getenv("GOOGLE_CHROME_SHIM");
		System.setProperty("webdriver.chrome.driver", chromeBin);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public String getGoogle() {
		String google = "";
		
		driver.get("http://www.google.com/xhtml");
		google = driver.getTitle();
		
		return google;
	}

	public static void main(String[] args) {
		Chrome main = new Chrome();
		System.out.println("Google Page Title: " + main.getGoogle());
	}
}
