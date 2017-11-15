package academy.test.testcases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import academy.test.base.TestBase;
import academy.test.pages.HomePage;
import academy.test.pages.RegisterPage;

public class RegisterPageTest extends TestBase {
	public static Logger log = LogManager.getLogger(TestBase.class.getName());
	
	HomePage homePage;
	RegisterPage registerPage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		log.info("Starting the browser and Navigating to the URL");
		homePage = new HomePage();
		registerPage = new RegisterPage();
	}
	
	@Test(priority=1)
	public void signUpOnQaClickAcademy() {
		homePage.clickOnRegisterLink();
		log.info("Clicked on Register link");
		homePage = registerPage.signUpToQaClickAcademy(prop.getProperty("fullname"),
						prop.getProperty("email"), prop.getProperty("password"));
		log.info("Signing up for webpage");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		log.info("The browser closed");
	}

}
