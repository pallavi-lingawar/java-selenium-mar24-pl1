package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3FBLogin {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("hello123@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("jacl123");

		driver.findElement(By.name("login")).click();
	}

}
