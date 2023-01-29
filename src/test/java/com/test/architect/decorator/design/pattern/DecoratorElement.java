package com.test.architect.decorator.design.pattern;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DecoratorElement extends RemoteWebElement {
	
	private WebDriver driver;
	private JavascriptExecutor jse;
	private WebElement ele;
	private WebDriverWait wait;
	
	public DecoratorElement(WebDriver driver, WebElement ele) {
		this.driver = driver;
		this.jse = (JavascriptExecutor) driver;
		this.ele = ele;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Override
	public void click() {
		waitForClick();
		highlight();
		ele.click();
		reset();
	}
	
	@Override
	public void sendKeys(CharSequence... keysToSend) {
		waitUntilElementVisible();
		highlight();
		ele.sendKeys(keysToSend);
		reset();
	}
	
	private void waitUntilElementVisible() {
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	private void waitForClick() {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	private void highlight() {
		jse.executeScript("arguments[0].style.backgroundColor='#FDFF47';", ele);
	}
	
	private void reset() {
		jse.executeScript("arguments[0].style.backgroundColor='';", ele);
	}

}