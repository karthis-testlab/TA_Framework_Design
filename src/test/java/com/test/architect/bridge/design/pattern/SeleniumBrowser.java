package com.test.architect.bridge.design.pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBrowser implements IWebBrowserChoice<WebDriver> {

	WebBrowserType browserType;

	public SeleniumBrowser(WebBrowserType browserType) {
		this.browserType = browserType;
	}

	@Override
	public WebDriver choice() {
		switch (browserType) {
		case CHROME:
			return new ChromeDriver();
		case FIREFOX:
			return new FirefoxDriver();
		case EDGE:
			return new EdgeDriver();
		default:
			return null;
		}
	}

}