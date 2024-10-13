package com.net.npav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Basics11 {
	
WebDriver driver;

	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Chaitanya\\Desktop\\Selenium Browsers Drivers\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Selenium_Basics11 obj = new Selenium_Basics11();
		
		obj.LaunchAUT();
		
	}

}
