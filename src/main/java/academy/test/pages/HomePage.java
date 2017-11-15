package academy.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import academy.test.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//img[contains(@class,'img-responsive logo')]")
	WebElement qaclickLogo;
	
	@FindBy(xpath="//a[@href='http://qaclickacademy.usefedora.com/sign_up']//span[contains(text(),'Register')]")
	WebElement registerButton;
	
	@FindBy(xpath="//a[@href='http://qaclickacademy.usefedora.com/sign_in']//span[contains(text(),'Login')]")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@href='courses-description.php']")
	WebElement coursesLink;
	
	@FindBy(xpath="//a[@href='videos.php']")
	WebElement videosLink;
	
	@FindBy(xpath="//a[@href='interview.php']")
	WebElement interviewguideLink;
	
	@FindBy(css="a[href='/blog']")
	WebElement blogLink;
	
	@FindBy(xpath="//a[@href='about.php']")
	WebElement aboutLink;
	
	@FindBy(xpath="//a[@href='contact.php']")
	WebElement contactLink;
	
	@FindBy(xpath="//h2[contains(text(),'Featured Courses')]")
	WebElement validateTextPresent;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String vefiryHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogoImage() {
		return qaclickLogo.isDisplayed();
	}
	
	public RegisterPage clickOnRegisterLink() {
		registerButton.click();
		return new RegisterPage();
	}
	
	public LoginPage clickOnLoginLink() {
		loginButton.click();
		return new LoginPage();
	}
	
	public CoursesPage clickOnCoursesLink() {
		coursesLink.click();
		return new CoursesPage();
	}
	
	public VideosPage clickOnVideosLink() {
		videosLink.click();
		return new VideosPage();
	}
	
	public InterviewGuidePage clickOnInterviewguideLink() {
		interviewguideLink.click();
		return new InterviewGuidePage();
	}
	
	public BlogPage clickOnBlogLink() {
		blogLink.click();
		return new BlogPage();
	}
	
	public AboutPage clickOnAboutLink() {
		aboutLink.click();
		return new AboutPage();
	}
	
	public ContactPage clickOnContactLink() {
		contactLink.click();
		return new ContactPage();
	}
	
//	public WebElement clickOnVideoPlayLink() {
//		WebElement clickOnVideoPlayLink = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
//		return clickOnVideoPlayLink;
//	}
	
	public String validateText() {
		return validateTextPresent.getText();
	}
	
	
	

}
