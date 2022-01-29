package PracticeTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PracticePages.wp_LoginPage;
import Helper.BrowserFactory;

public class VerifyValidLogin {
	
	WebDriver driver ;
	
	@Test(priority = 1)
	public void sendusername() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	driver	= BrowserFactory.startBrowser("chrome", "https://wordpress.com/log-in");
	
	wp_LoginPage loginpg = PageFactory.initElements(driver, wp_LoginPage.class);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		loginpg.EnterUsername("admin");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	}
	
	@Test(priority = 2)
	public void clickcontinuebutton() throws InterruptedException {
		wp_LoginPage loginpg = PageFactory.initElements(driver, wp_LoginPage.class);
		loginpg.clickcontinuebutton();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	@Test(priority = 3)
	public void sendpassword() throws InterruptedException {
		wp_LoginPage loginpg = PageFactory.initElements(driver, wp_LoginPage.class);
		loginpg.EnterPassword("password");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	@Test(priority = 4)
	public void clicklogin() throws InterruptedException {
		wp_LoginPage loginpg = PageFactory.initElements(driver, wp_LoginPage.class);
		loginpg.clickLoginButton();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

}
