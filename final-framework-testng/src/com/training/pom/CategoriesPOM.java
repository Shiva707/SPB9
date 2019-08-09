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
	
	@FindBy(id="input-name1")
	private WebElement CatgoryName; 
	
	@FindBy(id="//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]")
	private WebElement Description; 
	
	@FindBy(id="input-meta-title1")
	private WebElement Metatag; 
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button")
	private WebElement Save;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]")
	private WebElement verifymessage;	
	
	
	
	public void clickCategory() {
		this.Catalog.click();
		this.Category.click();
		this.AddCategory.click();
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

	public String verifymessageprint()
	{
		return this.verifymessage.getText();
	} 

}
