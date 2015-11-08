package com.fitbit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by сергий on 08.11.2015.
 */
public class GoogleLoginPage extends AnyPage {
    public GoogleLoginPage(PageManager pages) {
        super(pages);
    }

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "next")
    private WebElement nextBtn;

    @FindBy(id = "Passwd")
    private WebElement passField;

    @FindBy(id = "signIn")
    private WebElement signInBtn;

    public GoogleLoginPage setEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public GoogleLoginPage setPass(String pass) {
        passField.clear();
        passField.sendKeys(pass);
        return this;
    }

    public GoogleLoginPage clickNext() {
        nextBtn.click();
        return this;
    }



}
