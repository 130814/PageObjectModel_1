package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class HomePage extends Utils {


    private By _registerButton = By.className("ico-register");

    public void clickOnregisterButton() {
        clickOnElement(_registerButton);


    }

    public void printoutproducttitle() {
        List<WebElement> productList = driver.findElements(By.cssSelector("div.product-grid"));
        for (WebElement e : productList) {
            System.out.println(e.getText());


        }
    }

    public void SearchAlret() {
        clickOnElement(By.xpath("//button[@class=\"button-1 search-box-button\"]"));
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please enter some search keyword");
        alert.accept();
    }

}



