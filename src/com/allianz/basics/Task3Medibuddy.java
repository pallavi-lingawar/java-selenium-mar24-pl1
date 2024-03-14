package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Medibuddy {

	public static void main(String[] args) 
	{
		// Navigate onto https://www.medibuddy.in/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medibuddy.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Close if any popup and Click on Login
		driver.switchTo().alert().dismiss();
		driver.findElement(By.linkText("Login")).click();

		//Click on I have Corporate Account
		driver.findElement(By.xpath("//div[@class ='coperate']")).click();

		//Click on Learn More
		driver.findElement(By.linkText("https://www.medibuddy.in/")).click();

		// Click on Skip
		driver.findElement(By.linkText("skip")).click();
		
		//Click on Login using Username & Password
		driver.findElement(By.linkText("Login using Username & Password")).click();
		
		// Enter username as john
		// Enter password as john123
		// Click on show password
		driver.findElement(By.id("username")).sendKeys("john");
		driver.findElement(By.xpath("//button[text() ='Proceed']")).click();
		driver.findElement(By.id("password")).sendKeys("john123");
		//driver.findElement(By.xpath(null)).click();
		
		// Click log in
		driver.findElement(By.xpath("//button[text() = 'Sign In']")).click();
		
		// Get the error message shown and print it in terminal
		System.out.println(driver.findElement(By.xpath("//div[contains(text() , 'Oops! You')]")).getText());
	}

}
