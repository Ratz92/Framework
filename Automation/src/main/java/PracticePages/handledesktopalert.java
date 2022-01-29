package PracticePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handledesktopalert {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://html.com/input-type-file/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\Ratnesh\\Desktop\\Ratnesh.txt");
		
	}
}
