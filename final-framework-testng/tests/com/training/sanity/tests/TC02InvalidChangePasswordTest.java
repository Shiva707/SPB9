package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ChangePassword;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC02InvalidChangePasswordTest {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ChangePassword chgPass;
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
		loginPOM = new LoginPOM(driver); 
		chgPass = new ChangePassword(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	@Test
	public void ChangePwdTest() {
		
		driver.findElement(By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/ul/li[2]/a")).click();		
		loginPOM.sendUserName("shivashankar.work@gmail.com");
		loginPOM.sendPassword("August@1");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		chgPass.clickchangepassword();
		chgPass.sendNewPassword("crAk7cab1");
		chgPass.sendconfirmPassword("crAk7cab2");
		chgPass.clickContBtn();
		screenShot.captureScreenShot("Second");
	
}

	

}
