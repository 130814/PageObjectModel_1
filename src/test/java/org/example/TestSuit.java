package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    ProductaddandPrint productaddandPrint = new ProductaddandPrint();
    CompareProductList compareProductList = new CompareProductList();
    CommunityPoll communityPoll = new CommunityPoll();
    AddtoCartAndEmail addtoCartAndEmail = new AddtoCartAndEmail();
    CurrencyConverter currencyConverter = new CurrencyConverter();
    SearchNike searchNike = new SearchNike();
    nopCommerceNewRelease nopCommerceNewRelease = new nopCommerceNewRelease();
    BuildyourownComputer buildyourownComputer = new BuildyourownComputer();

    @Test
    public void usershouldregistersuccesfullyornot() {
        homePage.clickOnregisterButton();
        registerPage.enterRegistrayionDetail();
        registerResultPage.veryfyUserShuoldregistersuccesfullyornot();
    }

    @Test
    public void AddtocartproductandPrintlist() {

        //homePage.clickOnregisterButton();
        // registerPage.enterRegistrayionDetail();
        //loginPage.enterLoginDetail();
        productaddandPrint.Addproducttocart();
        registerResultPage.PrintproductName();
    }
    @Test
    public void Addtocartaproductandprint() {
        compareProductList.CompareproductandprintResult();
        registerResultPage.ProductComapreandPrintName();
    }
    @Test
    public void Vote() {
        //homePage.clickOnregisterButton();
        // registerPage.enterRegistrayionDetail();
        //loginPage.enterLoginDetail();
        communityPoll.Usershouldsuccessfullyvote();
    }
    @Test
    public void EmailaFriendProduct() {
        addtoCartAndEmail.ProductAddoncart();


    }

    @Test
    public void registerusershouldvoteSucessfully() {
        loginPage.enterLoginDetail();
        communityPoll.Usershouldsuccessfullyvote();
    }
@Test
public void printoutproducttitle(){
        homePage.printoutproducttitle();
}
@Test
    public void clickonsearch(){
       homePage.SearchAlret();
}
@Test
    public void CurrencyConverterverify(){
        currencyConverter.UserVeifyCurrencyAccordingly();
}
@Test
    public void ClickonSearch(){
        searchNike.UserSearchNike();
}
@Test
    public void usershouldsucessfullyComment(){
        nopCommerceNewRelease.usershouldsucessfullyComment();
}
@Test

    public void SucesssfullyBuyProduct(){
        buildyourownComputer.UsershoouldCheckoutSucessfullyforproduct();
}

}