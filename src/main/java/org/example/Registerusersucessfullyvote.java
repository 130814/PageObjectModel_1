package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;

public class Registerusersucessfullyvote extends Utils{

    public void usershouldsucessfullyvote(){
    clickOnElement(By.xpath("//label[@for=pollanswers-2]"));

    clickOnElement(By.xpath("//button[@class=\"button-2 vote-poll-button\"]"));
    WebDriverWait wait = new WebDriverWait(driver, ofSeconds(20));
    String a = String.valueOf(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id=\"block-poll-vote-error-1\"]"))));
    System.out.println(a);
    String actualResult = getTextFromElement(By.className("poll-total-votes"));
    System.out.println(actualResult);



}}
