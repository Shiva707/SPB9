package com.training.sanity.tests;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.ChangePassword;
import com.training.pom.LoginPOM;
import com.training.pom.OrderReturnsPOM;
import com.training.pom.UniformStore;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC06OrderReturn {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private OrderReturnsPOM orPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		orPOM = new OrderReturnsPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/ul/li[2]/a")).click();		
		loginPOM.sendUserName("shivashankar.work@hotmail.com");
		loginPOM.sendPassword("crAk7abc");
		loginPOM.clickLoginBtn();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		

	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	@Test(priority=1)
	public void GotoOrderHistoryTest1() {
		
		orPOM.clickUserIcon();
		orPOM.clickOrderHistory();
		screenShot.captureScreenShot("First");
		orPOM.clickViewButton();
		screenShot.captureScreenShot("Second");
		
	}
	
	@Test(priority=2)
	public void GotoOrderHistoryTest2() {
		orPOM.clickReturnButton();
		orPOM.enterProductDetails();
		orPOM.clickselectReasnRadioBton1();
		orPOM.clickselectReasnRadioBton2();
		orPOM.enterTextArea();
		orPOM.checkcheckBox();
		orPOM.clicksubmit();
		String expected = orPOM.verifymessageprint();
		assertEquals("PRODUCT RETURNS",expected);
		System.out.println(expected);		
		screenShot.captureScreenShot("Third");
	
	}
	
	

	

}
