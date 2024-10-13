package com.net.npav;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics22 {
	
WebDriver driver;

public void LaunchAUT() throws InterruptedException
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Mr. User please provide URL");
	String url = sc.nextLine();
	System.out.println("Mr. User please provide expected title");
	String exp = sc.nextLine();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitanya\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	String act = driver.getTitle();
	
	if(exp.equalsIgnoreCase(act))
	{
		System.out.println("Both are same");
	}
	
	else
	{
		System.out.println("Both are not same");
	}
	
	sc.close();
}

public static void main(String[] args) throws InterruptedException {
	Selenium_Basics22 obj = new Selenium_Basics22();
	obj.LaunchAUT();
}

}
