package PracticePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Launch Chrome
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        Thread.sleep(5000);
        
        Alert alert = driver.switchTo().alert();
        
        String text = alert.getText();
        
        if(text.equals("Please enter a valid user")) {
        	System.out.println("Alert message is correct --- " + alert.getText());
        }
        else {
        	System.out.println("Alert is incorrect and alert message is ----" + alert.getText());
        }
        
        //System.out.println(alert.getText());
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         
        alert.accept(); //Click on Ok button 
        
        
        
	}
	
	
	

}
