package PracticePages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMousehover {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://testproject.io/?utm_source=google-ads&utm_campaign=website_testing&utm_agid=116246299425&utm_term=automation%20testing&creative=492868597094&device=c&placement&gclid=Cj0KCQiAip-PBhDVARIsAPP2xc2lXDKK0wLvnhQrz1R7ZebjQFzh-3AAbBlozNdFB1GP-u-HFxTlH0kaAvoPEALw_wcB");
		
		Actions action = new Actions(driver);
		
		Thread.sleep(5000);
		try {
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		}
		catch (NoAlertPresentException e) {
			System.out.println("Alert not found");
		}
		
		// Mouse hover to particular element
		action.moveToElement(driver.findElement(By.linkText("Platform"))).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Open Source Framework")).click();
		
		
		
		
		
	}
}
