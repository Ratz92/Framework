package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googetext {

	
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
	    
	    @Test(priority = 1, groups="Title")
	    public void googletitletext() {
	    	String title = driver.getTitle();
	    	System.out.println(title);
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    }
	    
	    @Test(priority = 2, groups="Logo")
	    public void googlelogo() {
	    	
	    	Boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	    
	    	System.out.println(b);
	    }
	    
	    @Test(priority = 3, groups="Search")
	    public void searchtext() {
	    	
	    	Boolean b = driver.findElement(By.xpath("//*[@title='Search']")).isDisplayed();
	    
	    	System.out.println(b);
	    }
	    
	    
	    @AfterMethod
	    public void closeBrowser() {
	    	driver.quit();
	    	
	    }

}
