package com.fitbit.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by sergey on 11/5/15.
 */
public abstract class AnyPage  extends Page {

    public AnyPage(PageManager pages) {
        super(pages);
    }

}
