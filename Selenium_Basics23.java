package com.net.npav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Basics23 {
	
	WebDriver driver;

	String url = "https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk";
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitanya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	
	public void Enter_data() throws InterruptedException
	{
		driver.findElement(By.name("UserFirstName")).sendKeys("chaitanyabro");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("chaitanya@100");
		Thread.sleep(2000);
		driver.findElement(By.name("UserEmail")).sendKeys("Ctribhuwan12345@gmail.com");
		Thread.sleep(2000);
	}
	
	public void jobTitle() throws InterruptedException
	{
		WebElement job = driver.findElement(By.name("UserTitle"));
		//Create the object for Select
		Select slcobj = new Select(job);
		slcobj.selectByVisibleText("IT Manager");
		Thread.sleep(2000);	
		slcobj.selectByIndex(3);
	}

public static void main(String[] args) throws InterruptedException {
	Selenium_Basics23 obj = new Selenium_Basics23();
	obj.LaunchAUT();
	obj.Enter_data();
	obj.jobTitle();
}

}
