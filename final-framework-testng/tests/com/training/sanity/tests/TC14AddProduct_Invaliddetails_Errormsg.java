package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.pom.AdminLoginPOM;

import com.training.pom.ProductPOM;

public class TC14AddProduct_Invaliddetails_Errormsg extends TC05AdminLoginTests{
	
	
	
	private ProductPOM prodPOM;
	
	
	
	@Test(priority = 2)
	public void filterProductTest() {
		
		prodPOM = new ProductPOM(driver);
		prodPOM.clickProduct();
		prodPOM.clickaddProdbtn();
		//prodPOM.enterProdName("Shiva Blazer");
		prodPOM.enterProdMetatag("Shiva Metatag2");
		prodPOM.clickDatatab();
		prodPOM.fillDatafields("SHI-112", "5000", "20");
		prodPOM.saveProd();
		String expected = prodPOM.verifymessageprint1();
		Assert.assertTrue(expected.contains("Warning: Please check the form"));
		//assertEquals("Warning: Please check the form carefully for errors!",expected);
		System.out.println(expected);		
		screenShot.captureScreenShot("First");
		
	}
	
}