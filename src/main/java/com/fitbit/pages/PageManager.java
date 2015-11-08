package com.fitbit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by sergey on 11/5/15.
 */
public class PageManager {

    private WebDriver driver;

    public HomePage homePage;
    public LoginPage loginPage;
    public PasswordRecoveryPage passwordRecoveryPage;
    public RegistrationPage registrationPage;
    public DashboardPage dashboardPage;
    public FacebookLoginPage facebookLoginPage;
    public GoogleLoginPage googleLoginPage;



    public PageManager(WebDriver driver) {
        this.driver = driver;
        homePage = initElements(new HomePage(this));
        loginPage = initElements(new LoginPage(this));
        passwordRecoveryPage = initElements(new PasswordRecoveryPage(this));
        registrationPage = initElements(new RegistrationPage(this));
        dashboardPage = initElements(new DashboardPage(this));
        facebookLoginPage = initElements(new FacebookLoginPage(this));
        googleLoginPage = initElements(new GoogleLoginPage(this));

    }

    private <T extends Page> T initElements(T page) {
        //PageFactory.initElements(driver, page);
    PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), page);
//        PageFactory.initElements(new DisplayedElementLocatorFactory(driver, 10), page);
        return page;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

}
