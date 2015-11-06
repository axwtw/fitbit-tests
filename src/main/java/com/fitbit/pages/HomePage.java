package com.fitbit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by sergey on 11/5/15.
 */
public class HomePage extends AnyPage {

    public HomePage(PageManager pages) {super(pages);}

    @FindBy(xpath = "//*[@class='hdr-login']//a[@class='hdr-menu-item']")
    private WebElement loginBtn;

    public LoginPage clickLogin() {
        loginBtn.click();
        return pages.loginPage;
    }

    public HomePage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.className("hdr-login")));
        return this;
    }

}
