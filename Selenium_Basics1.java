package com.net.npav;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Selenium_Basics1 {
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaitanya\\Downloads\\chromedriver-win64(1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Selenium_Basics1 obj = new Selenium_Basics1();
		obj.LaunchAUT();
	}

}
