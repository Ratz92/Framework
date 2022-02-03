package crossBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class ParallelTesting {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void Verifytitle(String browsername) {
		
		if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
	
	

}
