package org.example;

import org.openqa.selenium.By;

public class AddtoCartAndEmail extends Utils {

    public void ProductAddoncart() {


        clickOnElement(By.xpath("(//a[@href=\"/htc-one-m8-android-l-50-lollipop\"])[2]"));
        clickOnElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));


    }
}