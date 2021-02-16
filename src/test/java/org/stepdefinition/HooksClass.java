package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HooksClass {
	WebDriver d;
	@Before
	public void beforeExecution() {
		 WebDriverManager.chromedriver().setup();
		   d = new ChromeDriver();

	}
	
	@After
	public void afterExecution() {
		d.quit();

	}
	 

}
