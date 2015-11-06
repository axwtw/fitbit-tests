package com.fitbit.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sergey on 11/5/15.
 */
public class PasswordRecoveryPage extends AnyPage {

    public PasswordRecoveryPage(PageManager pages) {super(pages);}

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "send")
    private WebElement sendBtn;


    public PasswordRecoveryPage setEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public PasswordRecoveryPage clickSend() {
        sendBtn.click();
        return this;
    }

}
