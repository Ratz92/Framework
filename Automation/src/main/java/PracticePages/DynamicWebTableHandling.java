package PracticePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		//driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		driver.get("https://www.nyse.com/ipo-center/filings");
	
	//custom xpath

	
	}
}
