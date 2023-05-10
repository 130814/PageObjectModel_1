package org.example;

import org.openqa.selenium.By;

public class SearchNike extends Utils{
   // private By _searchbutton = By.xpath("//input[@placeholder=\"Search store\"]");

    public void UserSearchNike(){
//        selectoptionVisibletext(By.id(_searchbutton),"nike");
//        selectoptionvalue(By.id(_searchbutton),"nike");
//        typeText(By.id("Search"),"nike");
//        selectoptionVisibletext(By.id("Search"),"nike");
//        clickOnElement(By.xpath("//input[@placeholder=\"Search store\"]"));
        typeText(By.xpath("//input[@placeholder=\"Search store\"]"),"nike");
        //need to parameterised not just nike




    }
}
