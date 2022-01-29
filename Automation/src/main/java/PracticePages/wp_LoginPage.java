package PracticePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class wp_LoginPage {

	WebDriver driver;
	
	public void loginWP(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="usernameOrEmail")
	
	WebElement username;
	
	@FindBy(how=How.ID, using="password")
	
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//*[contains(text(),'Log In')]/parent::div")
	
	WebElement signIn_button;
	
	@FindBy(how=How.XPATH, using="//*[contains(text(),'Continue')]/parent::div"
			+ "")
	
	WebElement continue_button;
	
	@FindBy(how=How.LINK_TEXT, using="Terms of Service"
			+ "")
	
	WebElement Terms_link;
	
	
	
	public void EnterUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void clickcontinuebutton() {
		continue_button.click();
	}
	
	public void EnterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		signIn_button.click();
	}
	
}
