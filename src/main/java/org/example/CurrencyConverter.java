package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CurrencyConverter extends Utils {
    //private By _selectCurrency = By.name("US Dollar");
    // private By _customerCurrency1 = By.name("Euro");


    public void UserVeifyCurrencyAccordingly() {
//        clickOnElement(By.xpath("//select[@id=\"customerCurrency\"]"));
//        List<WebElement> peiceList = driver.findElements(By.xpath("//div[@class=\"prices\"]"));
//        for (WebElement e : peiceList) {
//            System.out.println(e.hashCode());
//            clickOnElement(By.xpath("//*[@id=\"customerCurrency\"]/option[2]"));
        //clickOnElement(_selectCurrency);
        //select currency from the currency selector
        //selectoptionVisibletext(_selectCurrency, "US Dollar");
        //store all products with the dollar currency
        clickOnElement(By.xpath("//select[@id=\"customerCurrency\"]"));
        List<WebElement> currency = driver.findElements(By.cssSelector("span.price"));
        //fetch all products with the same currency using the loop
        System.out.println("Products when currency chosen as US Dollar: ");
        for (WebElement e : currency) {
            System.out.println(e.getText());
            //select currency from the currency selector
            // selectoptionVisibletext(_selectCurrency, "Euro");
            clickOnElement(By.xpath("//*[@id=\"customerCurrency\"]/option[2]"));
            //store all products with the dollar currency
            List<WebElement> currency1 = driver.findElements(By.cssSelector("span.price"));
            //fetch all products with the same currency using the loop
            System.out.println("Products when currency chosen as Euro: ");
            for (WebElement e1 : currency1) {
                System.out.println(e1.getText());
            }


        }


    }
}


