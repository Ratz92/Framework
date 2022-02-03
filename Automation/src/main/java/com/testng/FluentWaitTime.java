package com.testng;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class FluentWaitTime {
	WebDriver driver;
    @Test()
	public void fluentwait() {
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Fluent wait
		 
		Wait<WebDriver> wait = new FluentWait(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);		
		 
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver driver)
		{
			
		return driver.findElement(By.xpath("//p[text()='WebDriver']"));
		}
		});
		
		
		System.out.println("Element is displayed" + element.isDisplayed());
		
		driver.findElement(By.xpath("//*[text()='Click me to start timer']")).click();
		
		Boolean status = driver.findElement(By.xpath("//p[text()='WebDriver']")).isDisplayed();
		
		if(status)
		{
			System.out.println("Test Case Passed");
		}
		
	}
    
    
    

}
