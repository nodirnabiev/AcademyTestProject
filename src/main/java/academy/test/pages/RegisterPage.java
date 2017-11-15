package academy.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import academy.test.base.TestBase;

public class RegisterPage extends TestBase {
	
	@FindBy(id="user_name")
	WebElement userName;
	
	@FindBy(id="user_email")
	WebElement userEmail;
	
	@FindBy(id="user_password")
	WebElement userPassword;
	
	@FindBy(id="user_password_confirmation")
	WebElement userPasswordConfirmation;
	
	@FindBy(id="user_agreed_to_terms")
	WebElement acceptTerms;
	
	@FindBy(xpath="//input[@class='btn btn-primary btn-md signup-button']")
	WebElement signupButton;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage signUpToQaClickAcademy(String fullName, String email, String pw) {
		userName.sendKeys(fullName);
		userEmail.sendKeys(email);
		userPassword.sendKeys(pw);
		userPasswordConfirmation.sendKeys(pw);
		
		acceptTerms.click();
		signupButton.click();
		
		return new HomePage();
	}

}
