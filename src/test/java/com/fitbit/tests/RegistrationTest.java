package com.fitbit.tests;

import com.fitbit.pages.PageManager;
import org.testng.Assert;
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
        Assert.assertEquals(app.getUserHelper().getMessage(), "Please follow the instructions in the verification email to finish creating your Fitbit account. Resend email");
    }

}
