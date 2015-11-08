package com.fitbit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by сергий on 08.11.2015.
 */
public class FacebookLoginPage extends AnyPage {
    public FacebookLoginPage(PageManager pages) {
        super(pages);
    }

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "loginbutton")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@class='_42ft _4jy0 layerConfirm _51_n autofocus _4jy5 _4jy1 selected _51sy']")
    private WebElement okBtn;

    public FacebookLoginPage setEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public FacebookLoginPage setPass(String pass) {
        passwordField.clear();
        passwordField.sendKeys(pass);
        return this;
    }

    public FacebookLoginPage clickLogin() {
        loginBtn.click();
        return this;
    }

    public DashboardPage clickOkayFbBtn() {
        okBtn.click();
        return pages.dashboardPage;
    }
}
