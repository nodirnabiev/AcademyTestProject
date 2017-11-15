package academy.test.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import academy.test.base.TestBase;
import academy.test.pages.CoursesPage;
import academy.test.pages.HomePage;
import academy.test.pages.RegisterPage;
import academy.test.util.TestUtil;

public class HomePageTest extends TestBase {
	
	public static Logger log = LogManager.getLogger(TestBase.class.getName());
	
	HomePage homePage;
	RegisterPage registerPage;
	TestUtil testUtil;
	CoursesPage coursesPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		log.info("Starting the browser and Navigated to the URL");
		homePage = new HomePage();
		registerPage = new RegisterPage();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.vefiryHomePageTitle();
		log.info("Getting the Page Title");
		System.out.println("The Title of the Page is: " + homePageTitle);
		Assert.assertEquals(homePageTitle, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
	}
	
	@Test(priority=2)
	public void qaClickAcademyLogoTest() {
		boolean flag = homePage.validateLogoImage();
		log.info("Verifying Page Logo is displayed");
		System.out.println("Logo image is displayed: " + flag);
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void clickOnCoursesLinkTest() {
		coursesPage = homePage.clickOnCoursesLink();
		log.info("Clicked on Courses link");
	}
	
	@Test(priority=4)
	public void clickOnVideosLinkTest() {
		homePage.clickOnVideosLink();
		log.info("Clicked on Videos link");
	}
	
	@Test(priority=5)
	public void clickOnIntervewGuideLinkTest() {
		homePage.clickOnInterviewguideLink();
		log.info("Clicked on Interview Guide link");
	}
	
	@Test(priority=6)
	public void clickOnBlogLinkTest() {
		homePage.clickOnBlogLink();
		log.info("Clicked on Blog link");
	}
	
	@Test(priority=7)
	public void clickOnAboutLinkTest() {
		homePage.clickOnAboutLink();
		log.info("Clicked on About link");
	}
	
	@Test(priority=8)
	public void clickOnContactLinkTest() {
		homePage.clickOnContactLink();
		log.info("Clicked on Contact link");
	}
	
//	@Test(priority=9)
//	public void clickOnVideoPlayLinkTest() throws InterruptedException {
//		WebElement elm = driver.findElement(By.xpath("//div[@class='video-wrapper']/iframe"));
//		String urlStr = elm.getAttribute("src");
//		System.out.println("Video Url : " + urlStr);
//		
//		driver.navigate().to(urlStr);
//		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		//Click on play button
//		Thread.sleep(3000);
//		jse.executeScript("jwplayer().play();");
//		Thread.sleep(2000);
//	}
	
	@Test(priority=9)
	public void verifyTextPresentTest() {
		String text = homePage.validateText();
		log.info("Validating text");
		Assert.assertEquals(text, "FEATURED COURSES", "The Actual Text didn't match with Expected Text");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("Closed the browser");
	}
	
	

}
