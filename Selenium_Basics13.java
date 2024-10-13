package com.net.npav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Basics13 {
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Chaitanya\\Desktop\\Selenium Interface Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("bedsheets & more")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Selenium_Basics13 obj = new Selenium_Basics13();
		obj.LaunchAUT();
	}
}
