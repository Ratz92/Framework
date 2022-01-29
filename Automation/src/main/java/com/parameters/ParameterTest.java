package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	
	@Test
	@Parameters({"Browser","url","emailId"})
	public void YahoologinTest(String Browser,String url,String emailId) {
		if(Browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(Browser.equals("chrome")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='login-username']")).clear();
		
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(emailId);
		
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
	}
	
	
	
	
	
	
	
	
	
}
