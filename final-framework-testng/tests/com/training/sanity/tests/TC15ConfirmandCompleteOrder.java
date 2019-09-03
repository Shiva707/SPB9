package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

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
import com.training.pom.AdminLoginPOM;
import com.training.pom.ChangePassword;
import com.training.pom.LoginPOM;
import com.training.pom.UniformStore;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC15ConfirmandCompleteOrder {

	private WebDriver driver;
	private String baseURL1;
	private String baseURL;
	private LoginPOM loginPOM;
	private AdminLoginPOM adminloginPOM;
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
		adminloginPOM = new AdminLoginPOM(driver); 
		uStore = new UniformStore(driver); 
		baseURL1 = properties.getProperty("baseURL1");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseURL1);
		driver.findElement(By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/ul/li[2]/a")).click();		

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	@Test(priority = 1)
	public void confirmProduct() throws InterruptedException {
		
		
		loginPOM.sendUserName("shivashankar.work@hotmail.com");
		loginPOM.sendPassword("crAk7abc");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		driver.findElement(By.linkText("Uniform Store")).click();
		uStore.clickRegularrustTshirt();
		uStore.clickChestsize();
		uStore.selectSize();
		Thread.sleep(3000);
		uStore.clickAddToCart();
		uStore.clickViewCart();
		screenShot.captureScreenShot("Second");
		uStore.clickCheckout();
		uStore.clickContinue1();
		Thread.sleep(3000);
		uStore.clickContinue2();
		Thread.sleep(3000);
		uStore.clickContinue3();
		Thread.sleep(3000);
		uStore.clickPolicyreadchk();
		uStore.clickContinuePM();
		uStore.clickConfirmOrder();
						
		}

	@Test(priority = 2, enabled = false)
	public void addOrderHistory() {
		
		adminloginPOM.sendUserName("admin");
		adminloginPOM.sendPassword("admin@123");
		adminloginPOM.clickLoginBtn(); 
		adminloginPOM.clickSales();
		adminloginPOM.clickOrders();
		adminloginPOM.clickViewOrders();
		adminloginPOM.selectOrderStatus();
		adminloginPOM.clickAddHistory();
	
	}
	
	@Test(priority = 3)
	public void viewOrderHistory() {
		
		loginPOM.sendUserName("shivashankar.work@hotmail.com");
		loginPOM.sendPassword("crAk7abc");
		loginPOM.clickLoginBtn();
		loginPOM.clickUserIcon();
		loginPOM.clickOrderHistory();
		
		String expected = loginPOM.verifymessageprint();
		assertEquals("ORDER HISTORY",expected);
		System.out.println(expected);		
		screenShot.captureScreenShot("First");
		
	
	}


}
