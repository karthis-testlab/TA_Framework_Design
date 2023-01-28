package com.test.architect.adapter.desing.pattern;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	}

	public void creatIncident() {
		
	}

	public void verifyIncident(String incidentNumber) {
	}		

}