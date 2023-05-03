package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.Utils.clickOnElement;
import static org.example.Utils.getTextFromElement;
public class RegisterResultPage {
    public void veryfyUserShuoldregistersuccesfullyornot() {
        String text = getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println(text);
        String expectedresult = "Registration done";
        Assert.assertEquals(text, expectedresult, "Registration not done");
    }
    public void PrintproductName(){
        String text = getTextFromElement(By.partialLinkText("Leica T Mirrorless Digital Camera"));
        System.out.println(text);
    }

    public void ProductComapreandPrintName() {
        String text1 = getTextFromElement(By.xpath("//a[text()='HTC One M8 Android L 5.0 Lollipop']"));
        System.out.println(text1);
        String text2 = getTextFromElement(By.xpath("//a[text()='$25 Virtual Gift Card']"));
        System.out.println(text2);
        clickOnElement(By.className("clear-list"));
        String message = getTextFromElement(By.className("no-data"));
        System.out.println(message);
        String expectedresult = "Product not compare";
        Assert.assertEquals(text1, expectedresult, "Product Compare");


    }

}


