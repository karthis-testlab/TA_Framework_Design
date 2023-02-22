package com.test.architect.browser.factory;

public class BrowserFactoryTest {

	public static void main(String[] args) {
		Driver driverfactory = DriverFactory.getDriver(BrowserType.CHROME);
		driverfactory.maximize();
		driverfactory.getUrl("https://www.saucedemo.com/");
	}

}
