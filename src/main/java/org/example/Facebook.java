package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Facebook extends Utils{
    private By _allowCookies = By.xpath("(//div[contains(@aria-label,'Allow all cookies')]");
    private By _closeFacebookLoginButton = By.xpath("//div[@aria-label='close']");
    private By _fbEmail = By.xpath("//input[@placeholder='Email or phone");
    private By _fbPassword = By.xpath("//input[@placeholder='password");
    private By _fbLoginButoon = By.xpath("//div[@aria-label='accessible login button']");

    public void verifyFacebookPage(){
        String currentURl = driver.getCurrentUrl();
        System.out.println("Facebook url=" + currentURl);
        Assert.assertEquals(currentURl,"http://www.facebook.com/nopCommerce");
        clickOnElement(_allowCookies);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(_closeFacebookLoginButton));
//        if (driver.findElement(_fbEmail).isDisplayed() {
//            System.out.println("Element Email is Present");
//        }else {
//            System.out.println("Element Email is Absent");
//        }if (driver.findElement(_fbPassword).isDisplayed(){
//            System.out.println("Element Password is present");
//        }else {
//            System.out.println("Element Password is not Present");
//        }if(driver.findElement(_fbLoginButoon).isDisplayed(){
//            System.out.println("Element Login Present");
//        }else {
//            System.out.println("Element Login is not Present");
//        }
//        driver.close();
//

}}
