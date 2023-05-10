package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.sql.Timestamp;

public class Utils extends BasePage {


    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by) {

      return driver.findElement(by).getText();
    }


    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    public static void selectoptionVisibletext(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }
    public static void selectoptionvalue(By by, String Value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(Value);
    }
    public static void selectoptionIndex(By by,int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

    }


}

