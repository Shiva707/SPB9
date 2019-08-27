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
import com.training.pom.CategoriesPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC09EditCategory_MetaTag extends TC05AdminLoginTests{

	
	private AdminLoginPOM adminloginPOM;
	private CategoriesPOM catPOM;
	
	
	@Test(priority = 2)
	public void addCategoriesTest() {
		
		catPOM = new CategoriesPOM(driver);
		catPOM.clickEditCategory();
		screenShot.captureScreenShot("First");
		catPOM.editTextfields();
		screenShot.captureScreenShot("Second");
		
		String expected = catPOM.verifymessageprint();
		 
		Assert.assertTrue(expected.contains("You have modified categories!"));
		System.out.println(expected);		
		screenShot.captureScreenShot("Third");
		
	}
}
