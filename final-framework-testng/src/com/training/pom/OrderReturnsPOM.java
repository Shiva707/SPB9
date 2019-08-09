package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReturnsPOM {
	
	private WebDriver driver; 
	
	public OrderReturnsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//*[@id=\"top-links1\"]/ul/li[3]/a") 		
	private WebElement UserIcon;
	
	@FindBy(linkText="Order History") 		
	private WebElement OrderHistory;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr/td[7]/a/i") 		
	private WebElement ViewButton;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/a/i") 		
	private WebElement ReturnButton;
	
	@FindBy(id="input-product") 		
	private WebElement ProductName;
	
	@FindBy(id="input-model") 		
	private WebElement ProductCode;	
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[4]/div/div[3]/label/input") 		
	private WebElement selectReasnRadioBton1;

	@FindBy(name="opened") 		
	private WebElement selectReasnRadioBton2;
	
	@FindBy(id="input-comment") 		
	private WebElement TextArea;
	
	@FindBy(name="agree") 		
	private WebElement checkBox;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div[2]/input[2]") 		
	private WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	private WebElement verifymessage;
		
	public void clickUserIcon() {
		this.UserIcon.click();	
	}	

	public void clickOrderHistory() {
		this.OrderHistory.click();	
	}	
	
	public void clickViewButton() {
		this.ViewButton.click();	
	}	
	
	public void clickReturnButton() {
		this.ReturnButton.click();	
	}	
	
	public void enterProductDetails() {
		this.ProductName.sendKeys("Girl Blazer");
		this.ProductCode.sendKeys("Girl Blazer");
	}
	
	public void clickselectReasnRadioBton1() {
		this.selectReasnRadioBton1.click();	
	}	
	
	public void clickselectReasnRadioBton2() {
		this.selectReasnRadioBton2.click();	
	}	
	
		
	public void enterTextArea() {
		this.TextArea.sendKeys("Unhappy with the product");
	}
	
	public void checkcheckBox() {
		this.checkBox.click();
	}	
	
	public void clicksubmit() {
		this.submit.click();
	}	
	
	public String verifymessageprint()
	{
		return this.verifymessage.getText();
	} 
	
}
