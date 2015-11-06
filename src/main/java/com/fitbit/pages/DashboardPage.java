package com.fitbit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sergey on 11/6/15.
 */
public class DashboardPage extends AnyPage {

    public DashboardPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//*[@class='selected']")
    private WebElement dashBoardBtn;
}
