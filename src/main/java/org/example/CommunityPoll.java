package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static java.awt.SystemColor.text;
import static java.time.Duration.ofSeconds;

public class CommunityPoll extends Utils{

public void Usershouldsuccessfullyvote(){

    clickOnElement(By.xpath("//input[@id=\"pollanswers-2\"]"));

    clickOnElement(By.xpath("//button[@class='button-2 vote-poll-button']"));
    WebDriverWait wait = new WebDriverWait(driver, ofSeconds(20));
    String a = String.valueOf(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id=\"block-poll-vote-error-1\"]"))));
    System.out.println(a);
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("block-poll-vote-error-1")));
    String actualResult = getTextFromElement(By.xpath("//*[@id=\"block-poll-vote-error-1\"]"));
    Object expectedresult = "User Vote";
    Assert.assertEquals(text, expectedresult, "Vote successfully");



}


}
