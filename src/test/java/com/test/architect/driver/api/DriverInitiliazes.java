package com.test.architect.driver.api;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverInitiliazes implements DriverInitiliaze {

    private RemoteWebDriver driver;

    public void setDriver(Browsers browsers) {
        switch (browsers) {
            case CHROME:
                this.driver = new ChromeDriver();
                break;
            case FIREFOX:
                this.driver = new FirefoxDriver();
            case EDGE:
                this.driver = new EdgeDriver();
            default:
                this.driver = null;
        }

    }

    public RemoteWebDriver getDriver() {
        return driver;
    }

}
