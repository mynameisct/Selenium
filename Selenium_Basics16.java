package com.net.npav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Basics16 {
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Chaitanya\\Desktop\\Selenium Interface Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.cssSelector(".inputtext ")).sendKeys("Ctribhuwan12345@gmail.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Selenium_Basics16 obj = new Selenium_Basics16();
		obj.LaunchAUT();
	}
}
