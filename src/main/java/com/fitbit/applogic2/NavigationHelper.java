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
        return 0;
    }

    @Override
    public void gotoLoginPage() {
        pages.loginPage.clickLoginBtn();
    }


}
