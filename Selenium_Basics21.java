package com.net.npav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics21 {
	
WebDriver driver;

public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitanya\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
}

public void navigate() throws InterruptedException
{
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
}

public static void main(String[] args) throws InterruptedException {
	Selenium_Basics21 obj = new Selenium_Basics21();
	obj.LaunchAUT();
	obj.navigate();
}
	

}
