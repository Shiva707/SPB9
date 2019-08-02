package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword {

	private WebDriver driver; 
	
	public ChangePassword(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(linkText="Change your password") 		
	private WebElement changepasswordlink;
	
	@FindBy(id="input-password")
	private WebElement NewPassword;
		
	@FindBy(id="input-confirm")
	private WebElement confirmpassword;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div[2]/input")
	private WebElement continueBtn;
	
	public void clickchangepassword() {
		this.changepasswordlink.click(); 
	
	}	
	
	public void sendNewPassword(String NewPassword) {
		this.NewPassword.clear(); 
		this.NewPassword.sendKeys(NewPassword); 
	}
	
	
	public void sendconfirmPassword(String confirmpassword) {
		this.confirmpassword.clear(); 
		this.confirmpassword.sendKeys(confirmpassword); 
	}
	
	
	public void clickContBtn() {
		this.continueBtn.click(); 
	}
	
	
	
}
