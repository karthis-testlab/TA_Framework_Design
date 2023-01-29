package com.test.architect.adapter.desing.pattern;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowUiApdapter implements ServiceNowApp {
	
	WebDriver driver;
	
	public void startApp(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void login(String userName, String password) {
		driver.findElement(By.id("user_name")).sendKeys(userName);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.id("sysverb_login")).click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

	public void creatIncident() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement all = (WebElement) jse.executeScript("return document.querySelector('macroponent-f51912f4c700201072b211d4d8c26010').shadowRoot.querySelector('div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout').shadowRoot.querySelector('div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header').shadowRoot.querySelector('nav > div > div.starting-header-zone > div.sn-polaris-navigation.polaris-header-menu > div[aria-label]')");
		String js = "arguments[0].click();";
		((JavascriptExecutor) driver).executeScript(js, all);
	}

	public void verifyIncident(String incidentNumber) {
	}		

}