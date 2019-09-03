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

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.AdminLoginPOM;
import com.training.pom.CategoriesPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC11AddCategoriesandDBtest extends TC05AdminLoginTests{

	
	private AdminLoginPOM adminloginPOM;
	private CategoriesPOM catPOM;
	
	
	@Test(priority = 2, dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void addCategoriesDBTest(String CategoryName, String Metatag) {
		
		catPOM = new CategoriesPOM(driver);
		catPOM.clickCategory();
		screenShot.captureScreenShot("First");
		catPOM.sendCategoryame(CategoryName);
		
		String CATEGORYNAME = catPOM.getCategoryName(CategoryName);
		
		catPOM.sendMetatag(Metatag);
		
		String METATAG = catPOM.getMetatag(Metatag);
		
		catPOM.fillTextfields();
		screenShot.captureScreenShot("Second");
		
		Assert.assertEquals(CATEGORYNAME, CategoryName);
		Assert.assertEquals(METATAG, Metatag);
		
		
	}
}
