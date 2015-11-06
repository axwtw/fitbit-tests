package com.fitbit.model;

/**
 * Created by sergey on 11/5/15.
 */
public class User {

    private String name;
    private String password;
    private String email;
    private String gender;
    private String height;
    private String weight;
    private String birthDay;
    private String birthMonth;
    private String birthYear;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public User setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public User setHeight(String height) {
        this.height = height;
        return this;
    }

    public String getWeight() {
        return weight;
    }

    public User setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public User setBirthDay(String birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public User setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public User setBirthYear(String birthYear) {
        this.birthYear = birthYear;
        return this;
    }

}
