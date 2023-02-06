package com.test.architect.proxy.design.pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {	
	
	@FindBy(how=How.ID, using="username")
	private WebElement eleUsername;
	
	@FindBy(how=How.ID, using="password")
	private WebElement elePassword;
	
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit")
	private WebElement eleloginBtn;
	
	public LoginPage(WebDriver driver) {		
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage typeUserName(String userName) {
		LogWebElement logUsername = new LogWebElement(eleUsername);
		logUsername.sendKeys(userName);
		return this;
	}
	
	public LoginPage typePassword(String password) {
		LogWebElement logPassword = new LogWebElement(elePassword);
		logPassword.sendKeys(password);
		return this;
	}
	
	public LoginPage clickOntheLoginBtn() {
		LogWebElement logLoginBtn = new LogWebElement(eleloginBtn);
		logLoginBtn.click();
		return this;
	}

}