package com.net.npav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Basics20 {
	
	WebDriver driver;
	String bro1="Chrome";
	String bro2="Fire";
	String bro3="Edge";
	String url = "https://www.flipkart.com/";
	
	public void LaunchAUT()
	{
		Selenium_Basics20 obj = new Selenium_Basics20();
		if(obj.bro1.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitanya\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		if(obj.bro2.equalsIgnoreCase("Fire"))
		{
			System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Chaitanya\\Desktop\\Selenium Interface Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		if(obj.bro3.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdreiver.edge.driver","C:\\Users\\Chaitanya\\Desktop\\Selenium Interface Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
	}
	
	public static void main(String[] args) {
		Selenium_Basics20 con = new Selenium_Basics20();
		con.LaunchAUT();
	}
}
