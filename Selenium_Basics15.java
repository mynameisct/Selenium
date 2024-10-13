package com.net.npav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Basics15 {
		
		public void LaunchAUT() throws InterruptedException
		{
			System.setProperty("webdriver.firefox.marionette","C:\\Users\\Chaitanya\\Desktop\\Selenium Interface Drivers\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.amazon.in/");
			
			int links = driver.findElements(By.tagName("a")).size();
			
			System.out.println(links);
		}
	
	public static void main(String[] args) throws InterruptedException {
		Selenium_Basics15 obj = new Selenium_Basics15();
		obj.LaunchAUT();
	}
}
