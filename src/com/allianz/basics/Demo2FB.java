package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.quit();

	}

}
