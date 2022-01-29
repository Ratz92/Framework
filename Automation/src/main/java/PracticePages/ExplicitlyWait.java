package PracticePages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		//driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		driver.get("https://www.facebook.com/");
		
		
		clickon(driver, driver.findElement(By.xpath("//button[@name=\"login\"]")), 20);
				
	}
	
	public static void clickon(WebDriver driver, WebElement locator, int timeout ) {
		
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		
		locator.click();
	}
	
}
