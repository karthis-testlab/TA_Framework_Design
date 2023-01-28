package com.test.architect.browser.factory;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser implements Driver {
	
	private EdgeDriver driver;
	
	public EdgeBrowser() {
		driver = new EdgeDriver();
	}
	
	public boolean maximize() {
		boolean bReturn;
		try {
			driver.manage().window().maximize();
			bReturn = true;
		} catch (Exception e) {
			bReturn = false;
		}
		return bReturn;
	}

	public boolean getUrl(String url) {
		boolean bReturn;
		try {
			driver.get(url);
			bReturn = true;
		} catch (Exception e) {
			bReturn = false;
		}
		return bReturn;
	}

}