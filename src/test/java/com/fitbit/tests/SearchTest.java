package com.fitbit.tests;

import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Created by sergey on 11/10/15.
 */
public class SearchTest extends TestBase {

    @Test
    public void searchTest() {
        app.getNavigationHelper().gotoLoginPage();
        app.getNavigationHelper().signInByFacebook();
        app.getUserHelper().loginWithFacebook(facebookUser);
        app.getNavigationHelper().switchToMainWindowHandle();
        app.getNavigationHelper().openCommunityPage();
        app.getUserHelper().search("Surge");
        Assert.assertTrue(app.getNavigationHelper().getSizeOfElements() > 0);
    }

}
