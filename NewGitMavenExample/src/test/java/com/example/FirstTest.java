package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class FirstTest {
	@Test
	public void firstTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:/Software/Chrome Driver/v2.41/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.google.com");
		
		Thread.sleep(2000);
		driver.quit();
	}


}

//Rohit 11 July

//c2349e4725d94a138c8e08ed4934d1f6