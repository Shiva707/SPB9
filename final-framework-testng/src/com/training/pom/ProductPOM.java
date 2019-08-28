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
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a/i")
	private WebElement addProdbtn;
	
	@FindBy(id = "input-name1")
	private WebElement ProductNametext;
	
	@FindBy(id = "input-meta-title1")
	private WebElement ProductMetatag;
	
	@FindBy(xpath = "//*[@id=\"form-product\"]/ul/li[2]/a")
	private WebElement Datatab;
	
	@FindBy(id = "input-model")
	private WebElement model;
	
	@FindBy(id = "input-price")
	private WebElement price;
	
	@FindBy(id = "input-quantity")
	private WebElement qty;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button/i")
	private WebElement Save;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]")
	private WebElement verifymessage1;
	
	
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
	
	public void clickaddProdbtn() {		
		this.addProdbtn.click();
	}
	
	public void clickFilterButton() {		
		this.FilterButton.click();
	}
	
	public void enterProdName(String prodname) {		
		this.ProductNametext.sendKeys(prodname);
	}
	
	public void clickDatatab() {		
		this.Datatab.click();
	}
	
	public void enterProdMetatag(String prodmetatag) {		
		this.ProductMetatag.sendKeys(prodmetatag);
	}
	
	public void fillDatafields(String modelname, String pricevalue, String qtyvalue ) {		
		this.model.sendKeys(modelname);
		this.price.sendKeys(pricevalue);
		this.qty.clear();
		this.qty.sendKeys(qtyvalue);
	}
	
	public void saveProd() {
		
		this.Save.click();
	}

	
	public String verifymessageprint()
	{
		return this.verifymessage.getText();
	} 
	
	public String verifymessageprint1()
	{
		return this.verifymessage1.getText();
	} 
}
