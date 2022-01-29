package PracticePages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class property {
	
	WebDriver driver;
	
	public void Flipkart_Login_page(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public static void main(String args[]) throws IOException {
	Properties prop = new Properties();
	
	FileInputStream ip = new  FileInputStream("C:\\Users\\Ratnesh\\eclipse-workspace\\Automation\\config.properties");
	
	prop.load(ip);
	
	System.out.println(prop.getProperty("URL"));
	}
	
	
	
	
	
	
	
	
	

}
