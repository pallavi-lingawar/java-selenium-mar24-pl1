package com.allianz.tabs;

public class Demo2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://db4free.net");
        
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();

	}

}
