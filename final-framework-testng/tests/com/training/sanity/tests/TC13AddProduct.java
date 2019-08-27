package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.pom.AdminLoginPOM;

import com.training.pom.ProductPOM;

public class TC13AddProduct extends TC05AdminLoginTests{
	
	
	
	private ProductPOM prodPOM;
	
	
	
	@Test(priority = 2)
	public void filterProductTest() {
		
		prodPOM = new ProductPOM(driver);
		prodPOM.clickProduct();
		prodPOM.enterProductName("Blazer(II-V)");
		screenShot.captureScreenShot("First");
		prodPOM.enterProductPrice("3000");
		screenShot.captureScreenShot("Second");
		prodPOM.selectStatus();
		screenShot.captureScreenShot("Third");
		prodPOM.enterProductModel("Blz-014");
		screenShot.captureScreenShot("Fourth");
		prodPOM.enterProductQuantity("100");
		screenShot.captureScreenShot("Fifth");
		prodPOM.clickFilterButton();
		screenShot.captureScreenShot("Sixth");
		
		String expected = prodPOM.verifymessageprint();
		assertEquals("Blazer(II-V)",expected);
		System.out.println(expected);
		
		
	}

}
