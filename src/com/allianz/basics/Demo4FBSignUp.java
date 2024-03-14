package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4FBSignUp {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("wick");
		driver.findElement(By.id("password_step_input")).sendKeys("test123");
		
		//Dropdown
		
		Select selectDay = new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("14");
		
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		//selectMonth.selectByVisibleText("Apr");
		//selectMonth.selectByIndex(3);
		selectMonth.selectByValue("4");
		
		Select selectYear = new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("1947");
		
		
		driver.findElement(By.xpath("//input[@value ='-1']")).click();
		
		driver.findElement(By.xpath("//button[text()=\"Sign Up\"]")).click();
		
	}

}
