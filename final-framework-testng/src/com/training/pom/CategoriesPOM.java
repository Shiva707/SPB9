package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPOM {
	
private WebDriver driver; 
	
	public CategoriesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"catalog\"]/a")
	private WebElement Catalog; 
	
	@FindBy(xpath="//*[@id=\"catalog\"]/ul/li[1]/a")
	private WebElement Category; 
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a[1]")
	private WebElement AddCategory; 
	
	@FindBy(xpath="//*[@id=\"form-category\"]/div/table/tbody/tr[2]/td[4]/a/i")
	private WebElement EditCategory; 
	
	@FindBy(id="input-name1")
	private WebElement CatgoryName; 
	
	@FindBy(id="//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]")
	private WebElement Description; 
	
	@FindBy(id="input-meta-title1")
	private WebElement Metatag; 
	
	@FindBy(id="input-meta-description1")
	private WebElement Metatagdescription; 
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button")
	private WebElement Save;
	
	@FindBy(xpath="//*[@id=\"form-category\"]/div/table/tbody/tr[2]/td[1]/input")
	private WebElement EthnicWear;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]")
	private WebElement verifymessage;	
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button/i")
	private WebElement Delete;	
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button/i")
	private WebElement Confirmalert;	
		
	
	public void clickCategory() {
		this.Catalog.click();
		this.Category.click();
		this.AddCategory.click();
	}	
	
	public void clickEditCategory() {
		this.Catalog.click();
		this.Category.click();
		this.EditCategory.click();
	}	
	
	public void fillTextfields() {
		this.CatgoryName.sendKeys("Ethnic Wear");
		try {
			this.Description.sendKeys("This dress is to be worn on Festival days");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		this.Metatag.sendKeys("Ethnic Wear - Tag 1");
		this.Save.click();
		
	}	
	
	public void editTextfields() {
		this.CatgoryName.clear();
		this.CatgoryName.sendKeys("Ethnic Wear");
		try {
			this.Description.sendKeys("This dress is to be worn on Festival days");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		this.Metatag.clear();
		this.Metatag.sendKeys("BLZ 05");
		this.Metatagdescription.sendKeys("Uniform for students");
		
		this.Save.click();
		
	}	

	public String verifymessageprint()
	{
		return this.verifymessage.getText();
	} 
	
	public void clickEthnicWear() {
		
		this.EthnicWear.click();
	}
	
	public void clickDelete() {
		
		this.Delete.click();
	}
	
	public void confirmAlert() {
		
		driver.switchTo().alert().accept();
	}


}
