package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminLoginPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC07InvalidAdminLoginTests {

	public WebDriver driver;
	private String baseUrl1;
	private AdminLoginPOM adminloginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		adminloginPOM = new AdminLoginPOM(driver); 
		baseUrl1 = properties.getProperty("baseURL1");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl1);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		adminloginPOM.sendUserName("admin");
		adminloginPOM.sendPassword("admin@124");
		adminloginPOM.clickLoginBtn(); 
		String expected = adminloginPOM.verifymessageprint2();
		System.out.println(expected);
		Assert.assertTrue(expected.contains("No matchess"));
		
		/*assertEquals("No match for Username and/or Password.",expected);
		System.out.println(expected);		
		screenShot.captureScreenShot("First");*/
		
		
	}
}
