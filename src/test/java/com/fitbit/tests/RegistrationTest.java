package com.fitbit.tests;

import org.testng.annotations.Test;

/**
 * Created by sergey on 11/6/15.
 */
public class RegistrationTest extends TestBase {

    @Test
    public void registerNewUser() {
        app.getNavigationHelper().gotoLoginPage();
        app.getNavigationHelper().gotoSignUpPage();
        app.getUserHelper().register(simpleUser);
    }

}
