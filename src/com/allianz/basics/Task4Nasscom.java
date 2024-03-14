package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4Nasscom {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://nasscom.in/");
		driver.findElement(By.xpath(//a[@text()="Login"]));
		driver.switchTo()

	}

}
