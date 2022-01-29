package PracticePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		WebElement sorucefile = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Thread.sleep(5000);
		
		WebElement destfile = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		action.clickAndHold(sorucefile).moveToElement(destfile).release().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
