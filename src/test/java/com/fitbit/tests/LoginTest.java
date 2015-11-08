package com.fitbit.tests;

import org.testng.annotations.Test;

/**
 * Created by сергий on 08.11.2015.
 */
public class LoginTest extends TestBase {

    @Test
    public void logInByFacebook() {
        app.getNavigationHelper().gotoLoginPage();
        app.getNavigationHelper().signInByFacebook();
        app.getUserHelper().loginWithFacebook(facebookUser);
    }


}
