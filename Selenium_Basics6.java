package com.net.npav; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics6 {
	
	WebDriver driver;

	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaitanya\\eclipse-workspace\\Selenium\\Browser Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	}
		
		public void CurrentURL()
		{
			String exp = "https://www.youtube.com/";
			String act = driver.getCurrentUrl();
			System.out.println(act);
			
			if(exp.equalsIgnoreCase(act))
			{
				System.out.println("Both are Same");
			}
			else
			{
				System.out.println("Both are Not Same");
			}
		}
		
		public static void main(String[] args) throws InterruptedException {
			
			Selenium_Basics6 obj = new Selenium_Basics6();
			obj.LaunchAUT();
			obj.CurrentURL();
			
		}
}
