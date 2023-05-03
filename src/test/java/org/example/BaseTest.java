package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest extends Utils {

    DriverManager driverManager = new DriverManager();

    @BeforeMethod

    public void setup(){
        driverManager.openBrowser();

    }

    @AfterMethod
    public void tearDown(){
        driverManager.closeBrowser();
    }


}

