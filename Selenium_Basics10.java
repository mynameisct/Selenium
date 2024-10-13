package com.net.npav;

import java.io.File;
import java.io.IOException; 

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics10 {

	WebDriver driver;

	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaitanya\\eclipse-workspace\\Selenium\\Browser Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	}
	
	public void SLogin(String uname, String passwd) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(uname);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(passwd);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(3000);
		
	}
	
	public void ScreenShot() throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des = new File("D:\\Screenshots By Code\\selenium.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(src, des);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		Selenium_Basics10 obj = new Selenium_Basics10();
		
		obj.LaunchAUT();
		obj.SLogin("chaitanya.tribhuwan100@gmail.com","passwordct");
		obj.ScreenShot();
	}
}
