package PracticePages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //launch chrome
		
		//driver.manage().window().maximize(); // maximize window
		
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		driver.get("https://www.ebay.com/");
		
		//dynamic behavior -- If page loads or element found within 10 secs then rest of the time will be ignored
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		
		System.out.println(all_links.size());
		
		try {
			
		for (int i=0; i<=all_links.size(); i++) {
			
			String list_links = all_links.get(i).getText();
			
			//System.out.println(list_links);
		}
		}
		catch(IndexOutOfBoundsException e) {
			
			System.out.println("Index is too large");
		}
		
	}

}
