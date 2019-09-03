package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.pom.AdminLoginPOM;

import com.training.pom.ProductPOM;

public class TC13AddMultipleProducts_Excel extends TC05AdminLoginTests{
	
	
	
	private ProductPOM prodPOM;
	
	
	
	@Test(priority = 2, dataProvider = "excel-inputs1", dataProviderClass = LoginDataProviders.class)
	public void addProductTest(String prodname, String metatag, String modelname, String pricevalue, String qtyvalue) {
		
		prodPOM = new ProductPOM(driver);
		prodPOM.clickProduct();
		prodPOM.clickaddProdbtn();
		prodPOM.enterProdName(prodname);
		prodPOM.enterProdMetatag(metatag);
		prodPOM.clickDatatab();
		prodPOM.fillDatafields(modelname, pricevalue, qtyvalue);
		prodPOM.saveProd();
		
	}
	
}