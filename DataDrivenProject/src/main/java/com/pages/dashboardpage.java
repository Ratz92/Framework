package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class dashboardpage {
	
	WebDriver driver;
	
	public void construct(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
		}

	@FindBy(how=How.XPATH, using="//*[@id='mobileRadio']//parent::div[@class='radio-btn-wrapper']")
	WebElement radiobutton;
	
	
	
	

}
