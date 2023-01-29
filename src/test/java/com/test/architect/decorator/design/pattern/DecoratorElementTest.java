package com.test.architect.decorator.design.pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DecoratorElementTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://leaftaps.com/opentaps");

		// Maximize the browser
		driver.manage().window().maximize();

		// Find the user name and enter the username value(demosalesmanager)
		WebElement usernameTxt = driver.findElement(By.id("username"));
		DecoratorElement usernameTxtDecorator = new DecoratorElement(driver, usernameTxt);
		usernameTxtDecorator.sendKeys("demosalesmanager");

		// Find the password and enter the password(crmsfa)
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// click login button		
		WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
		DecoratorElement loginBtnDecorator = new DecoratorElement(driver, loginBtn);
		loginBtnDecorator.click();

	}

}