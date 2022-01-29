package com.testng;

import org.testng.annotations.Test;

public class TestNGFeature {
	
	@Test(priority = 2,dependsOnMethods = "loginTest")
	public void HomePageTest() {
		System.out.println("Home Page test");
		
	}
	
	@Test(groups = "Login")
	public void loginTest() {
		System.out.println("Login test");
	}
	
	
	@Test(priority=1, dependsOnMethods = "loginTest")
	public void Check() {
		System.out.println("Check groups");
	}
	

}
