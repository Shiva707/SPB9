package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private WebElement userName; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//li[@class = 'dropdown myaccount']/a/span[2]")
	private WebElement UserIcon; 
	
	@FindBy(xpath="//ul[@class = 'dropdown-menu dropdown-menu-right myaccount-menu']/li[2]/a")
	private WebElement OrderHistory; 
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	private WebElement verifymessage;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickUserIcon() {
		this.UserIcon.click(); 
	}
	
	public void clickOrderHistory() {
		this.OrderHistory.click(); 
	}
	
	public String verifymessageprint()
	{
		return this.verifymessage.getText();
	} 
	
}
