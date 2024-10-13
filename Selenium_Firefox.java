package com.net.npav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Firefox {
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Chaitanya\\Desktop\\Selenium Interface Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Selenium_Firefox obj = new Selenium_Firefox();
		obj.LaunchAUT();
		
	}
}
