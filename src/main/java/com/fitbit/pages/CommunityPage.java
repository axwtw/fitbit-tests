package com.fitbit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sergey on 11/10/15.
 */
public class CommunityPage extends AnyPage {
    public CommunityPage(PageManager pages) {
        super(pages);
    }

    @FindBy(name = "messageSearchField")
    private WebElement searchField;

    @FindBy(name = "submitContext")
    private WebElement submitSearch;

    public CommunityPage setSearchQuery(String query) {
        searchField.clear();
        searchField.sendKeys(query);
        return this;
    }

    public SearchPage submitSearch() {
        submitSearch.click();
        return pages.searchPage;
    }


}
