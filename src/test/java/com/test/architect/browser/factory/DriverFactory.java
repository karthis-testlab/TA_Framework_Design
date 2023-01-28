package com.test.architect.browser.factory;

public class DriverFactory {
	
	public static Driver getDriver(BrowserType browserType) {
		
		switch (browserType) {
		case CHROME:
			return new ChromeBrowser();			
		case FIREFOX:			
			return new FireFoxBrowser();			
		case EDGE:
			return new EdgeBrowser();
		default:
			return null;
		}
		
		
	}

}