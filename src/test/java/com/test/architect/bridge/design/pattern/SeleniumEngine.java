package com.test.architect.bridge.design.pattern;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumEngine implements UiElementAction {

	private WebDriver driver;

	public void launch(String aut, WebBrowserType browserType) {
		SeleniumBrowser browser = new SeleniumBrowser(browserType);
		driver = browser.choice();
		driver.manage().window().maximize();
		driver.get(aut);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void type(String locator, String text) {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
	}

	public void click(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	public String getText(String locator) {
		return driver.findElement(By.xpath(locator)).getText();
	}

	public void close() {
		driver.close();
	}

}