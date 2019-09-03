package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UniformStore {

	private WebDriver driver; 
	
	public UniformStore(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//*[@id=\"featured-grid\"]/div[2]/div/div/div[1]/a/img") 		
	private WebElement RegularrustTshirt;
	
	@FindBy(id = "input-option376")
	private WebElement Chestsize;
	
	@FindBy(id = "button-cart")
	private WebElement AddToCart;
	
	@FindBy(xpath = "//*[@id=\"cart\"]/button")
	private WebElement ViewCart;
	
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")
	private WebElement ViewCart1;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]/i")
	private WebElement RemoveItem;
	
	@FindBy(linkText = "Checkout")
	private WebElement Checkout;
	
	@FindBy(id = "button-payment-address")
	private WebElement Continue1;
	
	@FindBy(id = "button-shipping-address")
	private WebElement Continue2;
	
	@FindBy(id = "button-shipping-method")
	private WebElement Continue3;
	
	@FindBy(name = "agree")
	private WebElement Policyreadchk;
	
	@FindBy(id = "button-payment-method")
	private WebElement ContinuePM;
	
	@FindBy(id = "button-confirm")
	private WebElement ConfirmOrder;
	
	
	public void clickRegularrustTshirt() {
		this.RegularrustTshirt.click();	
	}	
	
	public void clickChestsize() {
		this.Chestsize.click();	
	}	
	
	public void selectSize() {
		
		Select sizes = new Select(driver.findElement(By.id("input-option376")));
		sizes.selectByVisibleText("40");
		
	}
	
	public void clickAddToCart() {
		this.AddToCart.click();	
	}	
	
	public void clickViewCart() {
		this.ViewCart.click();	
		this.ViewCart1.click();
	}	
	
	public void clickRemoveItem() {
		this.RemoveItem.click();	
	}
	
	public void clickCheckout() {
		this.Checkout.click();	
	}
	
	public void clickContinue1() {
		this.Continue1.click();	
	}
	
	public void clickContinue2() {
		this.Continue2.click();	
	}
	
	public void clickContinue3() {
		this.Continue3.click();	
	}
	
	public void clickPolicyreadchk() {
		this.Policyreadchk.click();	
	}
	
	public void clickContinuePM() {
		this.ContinuePM.click();	
	}
	
	public void clickConfirmOrder() {
		this.ConfirmOrder.click();	
	}
}
