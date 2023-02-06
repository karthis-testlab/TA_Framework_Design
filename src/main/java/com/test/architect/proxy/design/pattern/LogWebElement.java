package com.test.architect.proxy.design.pattern;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class LogWebElement implements WebElement, Logs {	
	
	private WebElement ele;
	
	public LogWebElement(WebElement ele) {
		this.ele = ele;
	}

	@Override
	public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
		return ele.getScreenshotAs(target);
	}

	@Override
	public void click() {
		long startTime = System.currentTimeMillis();
		info("Clicking on the "+ele+" dom element.");
		ele.click();
		info("Dom element"+ele+"is clicked.");
		long endtime = System.currentTimeMillis();
		long totalTimeTaken = endtime - startTime;		
		info("Time taken to clicking the element is: "+totalTimeTaken+" milliseconds.");
	}

	@Override
	public void submit() {
		ele.submit();
	}

	@Override
	public void sendKeys(CharSequence... keysToSend) {
		long startTime = System.currentTimeMillis();
		info("Type the given text in the "+ele+" dom element.");
		ele.sendKeys(keysToSend);
		long endtime = System.currentTimeMillis();
		long totalTimeTaken = endtime - startTime;
		info("Time taken to typing the given text in the element is: "+totalTimeTaken+" milliseconds.");
	}

	@Override
	public void clear() {
		ele.clear();
	}

	@Override
	public String getTagName() {		
		return ele.getTagName();
	}

	@Override
	public String getAttribute(String name) {
		return ele.getAttribute(name);
	}

	@Override
	public boolean isSelected() {		
		return ele.isSelected();
	}

	@Override
	public boolean isEnabled() {		
		return ele.isEnabled();
	}

	@Override
	public String getText() {		
		return ele.getText();
	}

	@Override
	public List<WebElement> findElements(By by) {
		return ele.findElements(by);
	}

	@Override
	public WebElement findElement(By by) {
		return ele.findElement(by);
	}

	@Override
	public boolean isDisplayed() {		
		return ele.isDisplayed();
	}

	@Override
	public Point getLocation() {		
		return ele.getLocation();
	}

	@Override
	public Dimension getSize() {
		return ele.getSize();
	}

	@Override
	public Rectangle getRect() {
		return ele.getRect();
	}

	@Override
	public String getCssValue(String propertyName) {	
		return ele.getCssValue(propertyName);
	}

	@Override
	public void info(String message) {
		System.out.println(message);		
	}	

}