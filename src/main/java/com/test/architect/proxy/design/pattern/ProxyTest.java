package com.test.architect.proxy.design.pattern;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProxyTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*
		 * WebElement userName = driver.findElement(By.id("username")); LogWebElement
		 * logUserName = new LogWebElement(userName);
		 * logUserName.sendKeys("demosalesmanager"); WebElement password =
		 * driver.findElement(By.id("password")); LogWebElement logPassword = new
		 * LogWebElement(password); logPassword.sendKeys("crmsfa"); WebElement loginBtn
		 * = driver.findElement(By.className("decorativeSubmit")); LogWebElement
		 * logLoginBtn = new LogWebElement(loginBtn); logLoginBtn.click();
		 */
		new LoginPage(driver)
		.typeUserName("demosalesmanager")
		.typePassword("crmsfa")
		.clickOntheLoginBtn();
		driver.close();
	}

}