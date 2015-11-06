package com.fitbit.applogic2;

import com.fitbit.pages.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by sergey on 11/5/15.
 */
public class DriverBasedHelper {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected PageManager pages;

    public DriverBasedHelper(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        pages = new PageManager(driver);
    }

}
