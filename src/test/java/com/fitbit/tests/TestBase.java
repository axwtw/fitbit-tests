package com.fitbit.tests;

import com.fitbit.applogic.ApplicationManager;
import com.fitbit.model.User;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

/**
 * Created by sergey on 11/6/15.
 */
public class TestBase {

    public static User simpleUser = new User()
            .setName("TestUser" + System.currentTimeMillis())
            .setEmail("testuserck" + System.currentTimeMillis() + "@yopmail.com")
            .setPassword("qwerty12")
            .setGender("Male")
            .setBirthDay("12")
            .setBirthMonth("2")
            .setBirthYear("1990")
            .setWeight("80")
            .setHeight("180");

    public static User facebookUser = new User()
            .setEmail("goville.acc3@gmail.com")
            .setPassword("samsung12");

    protected ApplicationManager app;

    @BeforeClass
    public void init() { app = new com.fitbit.applogic2.ApplicationManager(); }

//    @AfterSuite
//    public void stop() { app.stop(); }
}
