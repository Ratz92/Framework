package com.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngbasics {

	//Pre Conditions 

	@BeforeSuite 
	public void setup() {
		
	    System.out.println("Setup system property");
	}
	
	@BeforeTest
	public void LaunchBrowser() {
		
		System.out.println("Launch Browser");
	}
	
	@BeforeClass
	public void login() {
		
	    System.out.println("login to app");
	}
	
	@BeforeMethod
	public void enterURL() {
		
	    System.out.println("Enter the URL");
	}
	
	//Test case
	
	@Test
	public void googletitletext() {
		
	    System.out.println("Google title text");
	}
	
	@Test
	public void Websitetitletext() {
		
	    System.out.println("Website title text");
	}
	
	//Post condition
	
	@AfterMethod
	public void logout() {
		
	    System.out.println("Logout from the app");
	}
	
	@AfterClass
	public void CloseBrowser() {
		
		System.out.println("Close Browser");
	}
	
	@AfterTest
	public void DeleteAllCookies() {
		
	    System.out.println("Delete the cookies");
	}
	
	@AfterSuite
	public void GenerateTestReport() {
		
		System.out.println("Generate Test Report");
	}

}
