package com.dataProviders;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.testutil;

public class TestngDataProviders {
	
	
    WebDriver driver;
	
    @BeforeMethod
	public void setupbrowser() {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
	}
    
    @DataProvider
    public Iterator<Object[]> getTestData() {
    	
    	ArrayList<Object[]> testData = testutil.getDatafromExcel();
    	
    	return testData.iterator();
    }
    
    
    @Test(expectedExceptions = {RuntimeException.class, NullPointerException.class}, dataProvider = "getTestData")
    public void Registrationpage(String firstname, 
    		String lastname, String email, 
    		String password) throws InterruptedException {
    	
    	//firstname
    	driver.findElement(By.xpath("//*[@id='firstname']")).clear();
    	driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstname);
    	
    	//Lastname
    	driver.findElement(By.xpath("//*[@id='lastname']")).clear();
    	driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastname);
    	
    	//Email
    	driver.findElement(By.xpath("//*[@id='Email']")).clear();
    	driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(email);
    	
    	//Password
    	driver.findElement(By.xpath("//*[@id='password']")).clear();
    	driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
    	
    	Thread.sleep(5000);
    }
    
    
    
    
    
    
    @AfterMethod
    public void teardown() {
    	
    	driver.quit();
    }

}
