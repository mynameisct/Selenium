package com.net.npav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics9 {
	
	WebDriver driver;

	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaitanya\\eclipse-workspace\\Selenium\\Browser Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	}
	
	public void SLogin(String uname, String passwd) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(uname);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(passwd);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Login")).click();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Selenium_Basics9 obj = new Selenium_Basics9();
		
		obj.LaunchAUT();
		obj.SLogin("abhishek23@gmail.com","abhi123");
		obj.SLogin("chaitanya12345@gmail.com", "chaitanya100");
		
	}
}
