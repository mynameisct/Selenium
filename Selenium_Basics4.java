package com.net.npav;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics4 {

WebDriver driver;
	
	public void LaunchAUT() throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plz enter your desired url you want to open");
		
		String url = sc.nextLine();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaitanya\\eclipse-workspace\\Selenium\\Browser Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		sc.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Selenium_Basics4 obj = new Selenium_Basics4();
		
		obj.LaunchAUT();
		
	}
	
}
