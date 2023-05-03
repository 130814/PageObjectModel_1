package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{

    public void enterLoginDetail(){
        clickOnElement(By.xpath("//a[text()=\"Log in\"]"));
        typeText(By.id("Email"),"emma@gmail.com");
        typeText(By.id("Password"),"Test1234");
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));

    }


}
