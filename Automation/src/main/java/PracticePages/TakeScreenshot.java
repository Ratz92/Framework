package PracticePages;

import java.io.File;
import java.io.IOException;
//import org.apache.commons.io.FileUtils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		//driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		driver.get("https://www.ebay.com/");
		
		// Take screenshot and store as a file format
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Ratnesh\\eclipse-workspace\\Automation\\src\\main\\java\\PracticePages\\ebay.png");
		
		// now copy the screenshot to desired location using copy file method

		try {
            FileUtils.copyFile(screenshot, dest);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		
		
	}



}
