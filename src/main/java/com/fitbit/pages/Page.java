package com.fitbit.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by sergey on 11/5/15.
 */
public class Page {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected PageManager pages;

    /*
     * Constructor injecting the WebDriver interface
     *
     * @param webDriver
     */
    public Page(PageManager pages) {
        this.pages = pages;
        driver = pages.getWebDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public Page ensurePageLoaded() {
        return this;
    }

    public Page ensurePopupIsLoaded() {
        return this;
    }

    public boolean waitPageLoaded() {
        try {
            ensurePageLoaded();
            return true;
        } catch (TimeoutException to) {
            return false;
        }
    }


}
