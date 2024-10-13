package com.net.npav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics8 {
	
	WebDriver driver;

	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaitanya\\eclipse-workspace\\Selenium\\Browser Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	}
	
	public void SLogin() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("chaitanya.trihuwan100@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Password@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Login")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		Selenium_Basics8 obj = new Selenium_Basics8();
		obj.LaunchAUT();
		obj.SLogin();
		
	}
}
