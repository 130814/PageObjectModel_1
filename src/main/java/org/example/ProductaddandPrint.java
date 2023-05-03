package org.example;

import org.openqa.selenium.By;

public class ProductaddandPrint extends Utils{

    public void Addproducttocart() {

        clickOnElement(By.xpath("//a[text()=' Electronics ']"));

        clickOnElement(By.xpath("//a[text()=' Camera & photo ']"));
        clickOnElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]"));

        clickOnElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]"));


    }
}
