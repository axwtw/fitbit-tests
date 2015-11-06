package com.fitbit.applogic;

/**
 * Created by sergey on 11/5/15.
 */
public interface ApplicationManager {

    UserHelper getUserHelper();
    NavigationHelper getNavigationHelper();
    void stop();

}
