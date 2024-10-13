package com.net.npav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics3 {
	
WebDriver driver;
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaitanya\\eclipse-workspace\\Selenium\\Browser Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https:/login.salesforce.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
	}
	
	public void pageSRC()
	{
		String src = driver.getPageSource();
		System.out.println(src);
		if(src.contains("username"))
		{
			System.out.println("is Available");
		}
		else
		{
			System.out.println("is Not Available");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Selenium_Basics3 obj = new Selenium_Basics3();
		obj.LaunchAUT();
		obj.pageSRC();
	}

}
