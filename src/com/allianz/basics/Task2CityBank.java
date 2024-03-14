package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2CityBank {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//choose credit card
		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();
		
		//Enter credit card number as 4545 5656 8887 9998
		driver.findElement(By.id("citiCard1")).sendKeys("4545");
		driver.findElement(By.id("citiCard2")).sendKeys("5656");
		driver.findElement(By.id("citiCard3")).sendKeys("8887");
		driver.findElement(By.id("citiCard4")).sendKeys("9998");
		
		//cvv
		driver.findElement(By.id("cvvnumber")).sendKeys("789");
		
		//Enter date as “14/04/2022”
		driver.findElement(By.xpath("//input[contains(@id , 'bill-date')]")).click();
		Select selectYear = new Select(driver.findElement(By.xpath("//select[@class = 'ui-datepicker-year']")));
		selectYear.selectByVisibleText("2022");
		Select selectMonth = new Select(driver.findElement(By.xpath("//select[@class = 'ui-datepicker-month']")));
		selectMonth.selectByVisibleText("Apr");
		driver.findElement(By.linkText("14")).click();
		
		//Click on Proceed
		driver.findElement(By.xpath("//input[@value = 'PROCEED']")).click();
		
		//Get the text and print it “Please accept Terms and Conditions”
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		
		
		
	
	}

}

