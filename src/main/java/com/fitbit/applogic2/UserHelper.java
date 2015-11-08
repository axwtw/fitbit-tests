package com.fitbit.applogic2;

import com.fitbit.model.User;

/**
 * Created by sergey on 11/5/15.
 */
public class UserHelper  extends DriverBasedHelper implements com.fitbit.applogic.UserHelper {

    public UserHelper(ApplicationManager manager) { super(manager.getWebDriver()); }

//    @Override
//    public void loginAs(User user) {
//        pages.loginPage.ensurePageLoaded()
//                .setEmailOrUsernameField(user.getEmail())
//                .setPasswordField(user.getPassword())
//                .clickLoginBtn();
//    }

    @Override
    public void loginAs(User user) {
        pages.loginPage.ensurePageLoaded()
                .setEmail(user.getEmail())
                .setPassword(user.getPassword())
                .clickLoginBtn();
    }

    @Override
    public void loginWithFacebook(User user) {
        pages.facebookLoginPage
                .setEmail(user.getEmail())
                .setPass(user.getPassword())
                .clickLogin();
    }

    @Override
    public void loginWithGoogle(User user) {

    }

    @Override
    public void register(User user) {
        pages.registrationPage
                .ensurePageLoaded()
                .ensureElementsAreLoaded()
                .setEmail(user.getEmail())
                .setPassword(user.getPassword())
                .clickTermsCheckbox()
                .clickContinueBtn()
                .ensurePersonalInfoPopupIsLoaded()
                .setName(user.getName())
                .setBirthDay(user.getBirthDay())
                .setBirthMonth(user.getBirthMonth())
                .setBirthYear(user.getBirthYear())
                .selectGender()
                .selectMaleGender()
                .switchHeightType()
                .setHeightCentimeters(user.getHeight())
                .switchWeightType()
                .switchWeightType()
                .setWeightKilograms(user.getWeight())
                .saveProfile();

    }

    @Override
    public void logout() {

    }

    @Override
    public boolean isLoggedIn() {
        return false;
    }

    @Override
    public boolean isLoggedInAs(User user) {
        return false;
    }

    @Override
    public boolean isNotLoggedIn() {
        return false;
    }

    @Override
    public String getMessage() {
        return pages.dashboardPage.getMessage();
    }

}
