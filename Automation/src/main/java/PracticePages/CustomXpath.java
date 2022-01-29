package PracticePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); // maximize window
		
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		driver.get("https://www.ebay.com/");
		
		//dynamic behavior -- If page loads or element found within 10 secs then rest of the time will be ignored
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//links
		
		driver.findElement(By.xpath("//a[contains(text(), 'Electronics')]/ancestor::li")).click();
		
		
		
		
	}
}
