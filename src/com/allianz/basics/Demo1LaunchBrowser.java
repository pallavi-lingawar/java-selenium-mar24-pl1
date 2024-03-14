package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		//open chrome driver it will run driver in backend
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		
		//When we create obj of cd cannot use for other driver so
		
//		WebDriver driver = new ChromeDriver();
//		driver = new EdgeDriver();	
//		driver.get("https://www.facebook.com/");
		
		WebDriver driver = new ChromeDriver();
		String browser = "edge";
		
		if(browser.equalsIgnoreCase("ch"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new EdgeDriver();
		}
		
		WebDriver driver1 = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver1.get("https://www.google.com");
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.quit();
		driver1.quit();
	}

}
