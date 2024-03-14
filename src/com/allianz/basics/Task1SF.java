package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1SF {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		//Navigate onto https://www.salesforce.com/in/form/signup/freetrial-sales/
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Enter first name as “John”
		//Enter last name as “wick”
		//Enter work email as “john@gmail.com”
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.xpath("//input[contains(@id,'UserLast')]")).sendKeys("Wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		
		//Select Job title as “IT Manager”
		Select selectJob = new Select(driver.findElement(By.name("UserTitle")));
		selectJob.selectByVisibleText("IT Manager");
		
		//Select Employees as “101-500 employees”
		Select selectEmp = new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmp.selectByVisibleText("101 - 200 employees");
		
		//Select country as “United Kingdom”
		Select selectCoutry = new Select(driver.findElement(By.name("CompanyCountry")));
		selectCoutry.selectByVisibleText("United Kingdom");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Allianz");
		
		//Do not fill the phone number
		//Click on check box
		driver.findElement(By.xpath("(//div[@class = 'checkbox-ui'])[2]")).click();
		
		//Click on start my free trial
		driver.findElement(By.xpath("//button[contains(@name ,  'free trial')]")).click();
		
		//Get the error message displayed “Enter a valid phone number”
		System.out.println(driver.findElement(By.xpath("(//span[@class = 'error-msg'])[7]")).getText());
		
	}

}
