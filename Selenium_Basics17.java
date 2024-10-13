package com.net.npav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Basics17 {
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Chaitanya\\Desktop\\Selenium Interface Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[name=pass]")).sendKeys("Chaitanya@1000");
		
		Thread.sleep(2000);
	}
	public static void main(String[] args) throws InterruptedException {
		Selenium_Basics17 obj = new Selenium_Basics17();
		obj.LaunchAUT();
	}
}
