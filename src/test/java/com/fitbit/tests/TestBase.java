package com.fitbit.tests;

import com.fitbit.model.User;

/**
 * Created by sergey on 11/6/15.
 */
public class TestBase {

    public static User simpleUser = new User()
            .setName("TestUser" + System.currentTimeMillis())
            .setEmail("testuserck" + System.currentTimeMillis() + "yopmail.com")
            .setPassword("qwerty12")
            .setGender("Male")
            .setBirthDay("12")
            .setBirthMonth("2")
            .setBirthYear("1990")
            .setWeight("80")
            .setHeight("180");
}
