package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class nopCommerceNewRelease extends Utils {

    public void usershouldsucessfullyComment() {
        clickOnElement(By.xpath("(//a[@href=\"/nopcommerce-new-release\"])[2]"));
        typeText(By.id("AddNewComment_CommentTitle"), "Nice Book");
        typeText(By.id("AddNewComment_CommentText"), "All the new Release have Good features ");
        clickOnElement(By.xpath("//Button[@name='add-comment']"));

        List<WebElement> commentlist = driver.findElements(By.cssSelector("p.comment-text"));
        WebElement mycomment = commentlist.get(commentlist.size() - 1);
        System.out.println(mycomment.getText());
        Assert.assertEquals(mycomment.getText(), "New Comment Not added");


    }
}
