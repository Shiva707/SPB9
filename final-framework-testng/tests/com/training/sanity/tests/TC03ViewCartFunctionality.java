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
import com.training.pom.UniformStore;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC03ViewCartFunctionality {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private UniformStore uStore;
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
		uStore = new UniformStore(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/ul/li[2]/a")).click();		

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	@Test
	public void ViewCart() {
		
		
		loginPOM.sendUserName("shivashankar.work@hotmail.com");
		loginPOM.sendPassword("crAk7abc");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		driver.findElement(By.linkText("Uniform Store")).click();
		uStore.clickRegularrustTshirt();
		uStore.clickChestsize();
		uStore.selectSize();
		uStore.clickAddToCart();
		uStore.clickViewCart();
		screenShot.captureScreenShot("Second");
		
	
}

	

}
