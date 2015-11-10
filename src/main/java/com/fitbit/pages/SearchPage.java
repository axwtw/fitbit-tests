package com.fitbit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by sergey on 11/10/15.
 */
public class SearchPage extends AnyPage {
    public SearchPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//*[@class='lia-quilt-row lia-quilt-row-standard']")
    private List<WebElement> searchResults;

    public int getResultsSize() {
        return searchResults.size();
    }
}
