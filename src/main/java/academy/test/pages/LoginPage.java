package academy.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import academy.test.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="user_email")
	WebElement userEmail;
	
	@FindBy(id="user_password")
	WebElement userPassword;
	
	@FindBy(xpath="//input[@class='btn btn-primary btn-md login-button']")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginHomePage login(String un, String pwd) {
		userEmail.sendKeys(un);
		userPassword.sendKeys(pwd);
		
		loginButton.click();
		return new LoginHomePage();
	}

}
