package org.example;

import org.openqa.selenium.By;




public class RegisterPage extends Utils {
    private By _registerButton = By.id("FirstName");
    private By _dateOfBirthDay = By.name("DateOfBirthDay");
    private By _dateOfBirthMonth = By.name("DateOfBirthMonth");
    private By _dateOfBirthYear = By.name("DateOfBirthYear");

    public void enterRegistrayionDetail() {
        clickOnElement(By.className("ico-register"));
        typeText(By.id("FirstName"),"abcde");
        typeText(By.id("LastName"), "dfgr");
        selectoptionVisibletext(_dateOfBirthDay,"22");
        selectoptionvalue(_dateOfBirthMonth,"5");
        selectoptionIndex(_dateOfBirthYear,19);
        typeText(By.name("Email"), "TestEmail" + timestamp() + "emma@gmail.com");

        typeText(By.id("Password"), "Test1234");

        typeText(By.id("ConfirmPassword"), "Test1234");

        clickOnElement(By.id("register-button"));

    }
}
