package Logging;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class log {
	WebDriver driver;
	@Test
	public void errorlogging() {
		
		Logger log = Logger.getLogger("LogDemo");
		
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Chrome Opened");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		log.info("URL Opened");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		log.info("Title fetched");
    	System.out.println(title);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

}
