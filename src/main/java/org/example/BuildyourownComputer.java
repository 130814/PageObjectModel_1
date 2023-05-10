package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class BuildyourownComputer extends Utils {

    public void UsershoouldCheckoutSucessfullyforproduct(){
        clickOnElement(By.xpath("(//a[@href=\"/build-your-own-computer\"])[2]"));

        //driver.findElement(By.xpath("//*[@id=\"product_attribute_label_1\"]/label"));

     selectoptionIndex(By.xpath("//*[@id=\"product_attribute_1\"]"),1);
     selectoptionIndex(By.xpath("//*[@id=\"product_attribute_2\"]"),2);
     clickOnElement(By.xpath("//*[@id=\"product_attribute_3_6\"]"));
        clickOnElement(By.xpath("//*[@id=\"product_attribute_4_9\"]"));
     clickOnElement(By.xpath("//*[@id=\"add-to-cart-button-1\"]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        clickOnElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a"));
        clickOnElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[3]/label"));
        clickOnElement(By.xpath("//*[@id=\"checkout\"]"));
        clickOnElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]"));
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
        typeText(By.id("BillingNewAddress_FirstName"),"emma");
        typeText(By.id("BillingNewAddress_LastName"),"joseph");
        typeText(By.id("BillingNewAddress_Email"),"abcd@gmail.com");
        selectoptionIndex(By.name("BillingNewAddress.CountryId"),3);
        typeText(By.id("BillingNewAddress_City"),"London");
        typeText(By.id("BillingNewAddress_Address1"),"Room No 1");
        typeText(By.id("BillingNewAddress_Address2"),"Holy Road");
        typeText(By.id("BillingNewAddress_ZipPostalCode"),"E7 9PQ");
        typeText(By.id("BillingNewAddress_PhoneNumber"),"0123456789");
        clickOnElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]"));
        clickOnElement(By.xpath("//*[@id=\"shipping-methods-form\"]/ul/li[2]/div[1]/label"));
        clickOnElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"));
        clickOnElement(By.xpath("//*[@id=\"paymentmethod_1\"]"));
        clickOnElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button"));
        selectoptionIndex(By.xpath("//*[@id=\"CreditCardType\"]"),1);
        typeText(By.id("CardholderName"),"emma j");
        typeText(By.id("CardNumber"),"4532273605048976");
        selectoptionIndex(By.id("ExpireMonth"),3);
        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
        selectoptionIndex(By.id("ExpireYear"),5);
        typeText(By.id("CardCode"),"734");
        clickOnElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button"));
        clickOnElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button"));

       Object expectedresult = "Your Order Sucessfully not Processed ";
       Assert.assertEquals(expectedresult, "Your order has been successfully processed!");









    }

}
