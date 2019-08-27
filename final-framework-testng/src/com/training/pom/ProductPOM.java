package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPOM {
	
private WebDriver driver; 
	
	public ProductPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"catalog\"]/a")
	private WebElement Category; 
	
	@FindBy(xpath="//*[@id=\"catalog\"]/ul/li[2]/a")
	private WebElement Product; 
	
	@FindBy(name="filter_name")
	private WebElement ProductName; 
	
	@FindBy(name="filter_price")
	private WebElement ProductPrice;  
	
	@FindBy(name="filter_status")
	private WebElement ProductStatus;  
	
	@FindBy(name="filter_model")
	private WebElement ProductModel;  
	
	@FindBy(name="filter_quantity")
	private WebElement ProductQuantity; 
	
	@FindBy(id="button-filter")
	private WebElement FilterButton; 
	
	@FindBy(xpath = "//*[@id=\"form-product\"]/div/table/tbody/tr/td[3]")
	private WebElement verifymessage;
	
	
	
	public void clickProduct() {
		this.Category.click();
		this.Product.click();

	}
	
	public void enterProductName(String ProductName) {		
		this.ProductName.sendKeys(ProductName);
	}
	
	public void enterProductPrice(String ProductPrice) {		
		this.ProductPrice.sendKeys(ProductPrice);
	}

	public void enterProductModel(String ProductModel) {		
		this.ProductModel.sendKeys(ProductModel);
	}
	
	public void enterProductQuantity(String ProductQuantity) {		
		this.ProductQuantity.sendKeys(ProductQuantity);
	}
	
	public void selectStatus() {		
		this.ProductStatus.click();
		Select s = new Select(ProductStatus);
		s.selectByVisibleText("Enabled");
	}
	
	public void clickFilterButton() {		
		this.FilterButton.click();
	}
	
	public String verifymessageprint()
	{
		return this.verifymessage.getText();
	} 
	
}
