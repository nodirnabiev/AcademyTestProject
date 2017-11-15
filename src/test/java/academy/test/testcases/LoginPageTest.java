package academy.test.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import academy.test.base.TestBase;
import academy.test.pages.HomePage;
import academy.test.pages.LoginHomePage;
import academy.test.pages.LoginPage;

public class LoginPageTest extends TestBase {
	public static Logger log = LogManager.getLogger(TestBase.class.getName());
	
	LoginPage loginPage;
	LoginHomePage loginHomePage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		log.info("Starting the browser and Navigating to the URL");
		loginPage = new LoginPage();
		homePage = new HomePage();
	}
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException {
		homePage.clickOnLoginLink();
		log.info("Clicked on Login link");
		loginHomePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		log.info("User email and password entered");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		log.info("The browser closed");
	}
	

}
