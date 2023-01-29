package com.test.architect.bridge.design.pattern;

public interface UiElementAction {
	
	void launch(String aut, WebBrowserType browserType);
	void type(String locator, String text);
	void click(String locator);
	String getText(String locator);
	void close();

}