package com.net.npav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics2 {
	
	WebDriver driver;
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaitanya\\eclipse-workspace\\Selenium\\Browser Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https:/login.salesforce.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
	}
	
	public void Title()
	{
		String exp = "Welcome to Salesforce";
		String act = driver.getTitle();
		System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{
			System.out.println("Both are same");
		}
		
		else
		{
			System.out.println("Both are not same");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Selenium_Basics2 obj = new Selenium_Basics2();
		obj.LaunchAUT();
		obj.Title();
	}
}
