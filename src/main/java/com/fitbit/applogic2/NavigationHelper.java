package com.fitbit.applogic2;

import org.openqa.selenium.Alert;

/**
 * Created by sergey on 11/5/15.
 */
public class NavigationHelper  extends DriverBasedHelper implements com.fitbit.applogic.NavigationHelper{

    private String baseUrl;
    private Alert alert;

    public NavigationHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
        this.baseUrl = manager.getBaseUrl();
    }

    @Override
    public void openMainPage() {
//        driver.get(baseUrl);
        driver.get("http://fitbit.com/");
    }


    @Override
    public void openRelativeUrl(String url) {
        driver.get(baseUrl + url);
    }

    @Override
    public void acceptAlert() {
        alert = super.driver.switchTo().alert();
        alert.accept();
    }

    @Override
    public int getSizeOfElements() {
        return pages.searchPage.getResultsSize();
    }

    @Override
    public void gotoLoginPage() {
        pages.homePage.clickLogin();
    }

    @Override
    public void gotoSignUpPage() {
        pages.loginPage.clickRegisterLink();
    }

    @Override
    public void signInByFacebook() {
        clickFbLoginBtn();
        switchToNewWindow("Facebook");
    }

    @Override
    public void switchToMainWindowHandle() {
        switchToNewWindow("Fitbit Dashboard");
    }

    @Override
    public String getTitleOfPage() {
        return driver.getTitle();
    }

    @Override
    public void openCommunityPage() {
        driver.get("https://community.fitbit.com");
    }

    @Override
    public void switchToNewWindow(String title) {
        for (String handle : driver.getWindowHandles()) {
            try {
                driver.switchTo().window(handle);
                String s = driver.getTitle();
                if (s != null && s.equals(title)) {
                    break;
                }
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void clickFbLoginBtn() {
        pages.loginPage.clickLogInWithFacebook();
    }
}
