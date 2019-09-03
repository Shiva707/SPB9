package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminLoginPOM {
	private WebDriver driver; 
	
	public AdminLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement loginBtn; 
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/h1")
	private WebElement verifymessage;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div[2]/div")
	private WebElement verifymessage2;
	
	@FindBy(xpath = "//a[@class = 'parent']/span")
	private WebElement Sales;
	
	@FindBy(xpath = "//*[@id=\"sale\"]/ul/li[1]/a")
	private WebElement Orders;
	
	@FindBy(xpath = "//*[@id=\"form-order\"]/div/table/tbody/tr[1]/td[8]/a[1]/i")
	private WebElement ViewOrder;
	
	@FindBy(id = "input-order-status")
	private WebElement OrderStatus;
	
	@FindBy(id = "button-history")
	private WebElement AddHistory;
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public String getUserName(String userName) {
		return this.userName.getAttribute("value");
	}
	
	public String getPassword(String password) {
		return this.password.getAttribute("value");
	}
	
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickSales() {
		this.Sales.click(); 
	}
	
	public void clickOrders() {
		this.Orders.click(); 
	}
	
	public void clickViewOrders() {
		this.ViewOrder.click(); 
	}
	
	public void selectOrderStatus() {
		this.OrderStatus.click(); 
		
		Select select = new Select(OrderStatus);
		select.selectByVisibleText("Complete");
	}
	
	public void clickAddHistory() {
		this.AddHistory.click(); 
	}
		
	public String verifymessageprint()
	{
		return this.verifymessage.getText();
	} 
	
	public String verifymessageprint2()
	{
		return this.verifymessage2.getText();
	} 
}
