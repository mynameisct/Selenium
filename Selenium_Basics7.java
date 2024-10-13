package com.net.npav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics7 {
	
	WebDriver driver;

	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaitanya\\eclipse-workspace\\Selenium\\Browser Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	}
	
	public void SendData() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I phone 15 Pro");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Selenium_Basics7 obj = new Selenium_Basics7();
		obj.LaunchAUT();
		obj.SendData();
	}

}
