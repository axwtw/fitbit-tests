package com.fitbit.applogic;

/**
 * Created by sergey on 11/5/15.
 */
public interface NavigationHelper {

    void openMainPage();
    void openRelativeUrl(String url);
    void acceptAlert();
    int getSizeOfElements();
    void gotoLoginPage();
    void gotoSignUpPage();
    void switchToNewWindow(String title);
    void clickFbLoginBtn();
    void signInByFacebook();
    void switchToMainWindowHandle();
    String getTitleOfPage();
    void openCommunityPage();

}
