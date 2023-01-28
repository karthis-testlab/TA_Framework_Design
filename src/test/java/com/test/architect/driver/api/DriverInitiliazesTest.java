package com.test.architect.driver.api;

public class DriverInitiliazesTest extends DriverInitiliazes {
    public static void main(String[] args) {
        DriverInitiliazesTest test = new DriverInitiliazesTest();
        test.launch("firefox");
    }

    public void launch(String browserName) {
        setDriver(Browsers.valueOf(browserName.toUpperCase()));
        getDriver();
    }
}
