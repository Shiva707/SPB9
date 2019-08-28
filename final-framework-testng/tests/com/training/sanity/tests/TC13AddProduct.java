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
		prodPOM.clickaddProdbtn();
		prodPOM.enterProdName("Shiva Blazer");
		prodPOM.enterProdMetatag("Shiva Metatag1");
		prodPOM.clickDatatab();
		prodPOM.fillDatafields("SHI-111", "3000", "10");
		prodPOM.saveProd();
		
	}
	
}