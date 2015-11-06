package com.fitbit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import sun.rmi.runtime.Log;

/**
 * Created by sergey on 11/5/15.
 */
public class LoginPage extends AnyPage {

    public LoginPage(PageManager pages) {super(pages);}

    @FindBy(xpath = "//*[@class='auth-btn auth-btn-facebook track-Auth-SignUp-ClickFacebook']")
    private WebElement loginWithFacebookBtn;

    @FindBy(xpath = "auth-btn auth-btn-google track-Auth-Login-ClickGoogle")
    private WebElement loginWithGoogleBtn;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@class='forgot']")
    private WebElement forgotPassLink;

    @FindBy(id = "rememberMe")
    private WebElement rememberMeCheckbox;

    @FindBy(xpath = "//button[@class='common-btn common-btn-submit track-Auth-Login-ClickFitbit']")
    private WebElement logInBtn;

    @FindBy(xpath = "//*[@class='swap track-Auth-Login-ClickGetFree']")
    private WebElement signUpLink;

    public LoginPage setEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickLoginBtn() {
        return pages.loginPage;
    }

    public LoginPage clickRememberMeCheckbox() {
        rememberMeCheckbox.click();
        return this;
    }

    public PasswordRecoveryPage clickForgorPassLink() {
        forgotPassLink.click();
        return pages.passwordRecoveryPage;
    }

    public RegistrationPage clickRegisterLink() {
        signUpLink.click();
        return pages.registrationPage;
    }

    public LoginPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//button[@class='common-btn common-btn-submit track-Auth-Login-ClickFitbit']")));
        return this;
    }


}
