package com.test.architect.bridge.design.pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;

public class PlaywrightEngine implements UiElementAction {
	
	private Browser browser;
	private Page page;

	public void launch(String aut, WebBrowserType browserType) {
		PlaywrightBrowser pw_browser = new PlaywrightBrowser(browserType);		
		browser = pw_browser.choice();
		page =  browser.newPage();
		page.navigate(aut);
	}

	public void type(String locator, String text) {
		page.locator(locator).clear();
		page.locator(locator).type(text);
	}

	public void click(String locator) {
		page.locator(locator).click();
	}

	public String getText(String locator) {		
		return page.locator(locator).innerText();
	}

	public void close() {
		browser.close();	
	}

}
