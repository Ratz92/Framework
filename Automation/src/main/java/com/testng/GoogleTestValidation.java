package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestValidation {
	
	
	WebDriver driver;
	
    @BeforeMethod
	public void setupbrowser() {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
	}
    
    @Test(priority=2)
    public void googletitletext() {
    	String title = driver.getTitle();
    	System.out.println(title);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   
    	//Validations in form of assertion
    	Assert.assertEquals(title, "Google", "Title is not matched");
    	    
    }
    
    @Test(priority=1)
    public void searchtext() {
    	
    	Boolean b = driver.findElement(By.xpath("//*[@title='Search']")).isDisplayed();
    
    	System.out.println(b);
    	
    	Assert.assertTrue(b);
    }
    
    @AfterMethod
    public void closeBrowser() {
    	driver.quit();
    	
    }
	
	
	

}
