package com.test.architect.driver.api;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface DriverInitiliaze {

    public void setDriver(Browsers browsers);

    public RemoteWebDriver getDriver();

}
