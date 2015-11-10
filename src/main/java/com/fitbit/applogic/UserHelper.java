package com.fitbit.applogic;

import com.fitbit.model.User;

/**
 * Created by sergey on 11/5/15.
 */
public interface UserHelper {

    void loginAs(User user);
    void loginWithFacebook(User user);
    void loginWithGoogle(User user);
    void register(User user);
    void logout();
    boolean isLoggedIn();
    boolean isLoggedInAs(User user);
    boolean isNotLoggedIn();
    String getMessage();
    void search(String query);


}
