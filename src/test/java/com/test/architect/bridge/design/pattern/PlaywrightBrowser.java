package com.test.architect.bridge.design.pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class PlaywrightBrowser implements IWebBrowserChoice<Browser> {
	
	Playwright pw;
	WebBrowserType browserType;
	
	public PlaywrightBrowser(WebBrowserType browserType) {
		pw = Playwright.create();
		this.browserType = browserType;
	}

	@Override
	public Browser choice() {
		 Browser browser;
			switch (browserType) {
			case CHROME:			
				browser = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
				break;
			case FIREFOX:
				browser = pw.firefox().launch(new BrowserType.LaunchOptions().setChannel("firefox").setHeadless(false));
				break;
			case EDGE:	
				browser = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("edge").setHeadless(false));
				break;
			default:
				browser = null;
				break;
			}
			return browser;
	}

}