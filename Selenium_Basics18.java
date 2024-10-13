package com.net.npav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Basics18 {
	
WebDriver driver;
String url = "https://login.salesforce.com/?locale=in";

public void LaunchAUT() throws InterruptedException
{
	String[] browser = {"Chrome","Fire","Edge"};
	for(String browsers:browser)
	{
		if(browsers.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitanya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		if(browsers.equalsIgnoreCase("Fire"))
		{
			System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Chaitanya\\Desktop\\Selenium Interface Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		if(browsers.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Chaitanya\\Desktop\\Selenium Interface Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
	}
}

public static void main(String[] args) throws InterruptedException {
	Selenium_Basics18 obj = new Selenium_Basics18();
	obj.LaunchAUT();
	}
}