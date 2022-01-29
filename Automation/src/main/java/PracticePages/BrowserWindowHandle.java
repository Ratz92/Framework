package PracticePages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		//driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		driver.get("https://www.naukri.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Jobs")).click();
		
		System.out.println("Executed");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		String parentwindowname = driver.getWindowHandle();
//		
//		System.out.println(parentwindowname);
//		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> Itr = handler.iterator();
		
		String parrentwindow = Itr.next();
		
		System.out.println(parrentwindow);
		
		String childwindow = Itr.next();
		
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		
	System.out.println("child window Title name " + driver.getTitle());
	
	
	Thread.sleep(5000);
	
	driver.close();
	
	driver.switchTo().window(parrentwindow);
		
		
		
		
	}
}