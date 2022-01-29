package PracticePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testproject.io/?utm_source=google-ads&utm_campaign=website_testing&utm_agid=116246299425&utm_term=automation%20website&creative=492868597094&device=c&placement&gclid=Cj0KCQiAip-PBhDVARIsAPP2xc3UjJjz8jNYxMqyjWfNgH_tcRPP7iqVNjzqxRyM81KAZaSC8AT03zIaAtyuEALw_wcB#");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("");
		
		//Frames by index 
		
		//frame by name 
		
		//frame by webelement
		
		WebElement frame = driver.findElement(By.xpath(""));
		
		//multple frames
		
		int total_frame = driver.findElements(By.tagName("")).size();
	}
}
