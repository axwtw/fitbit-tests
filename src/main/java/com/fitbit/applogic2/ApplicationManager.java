package com.fitbit.applogic2;

import com.fitbit.util.Browser;
import com.fitbit.util.PropertyLoader;
import com.fitbit.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;

/**
 * Created by sergey on 11/5/15.
 */
public class ApplicationManager implements com.fitbit.applogic.ApplicationManager {


    private UserHelper userHelper;
    private NavigationHelper navHelper;

    private WebDriver driver;
    private String baseUrl;

    public ApplicationManager() {
//        baseUrl = PropertyLoader.loadProperty("site.url");
        baseUrl = "http//beta.appshed.com/";
        String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

        Browser browser = new Browser();
        browser.setName(PropertyLoader.loadProperty("browser.name"));
        browser.setVersion(PropertyLoader.loadProperty("browser.version"));
        browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));

        String username = PropertyLoader.loadProperty("user.username");
        String password = PropertyLoader.loadProperty("user.password");

        driver = WebDriverFactory.getInstance(gridHubUrl, browser, username, password);

        userHelper = new com.fitbit.applogic2.UserHelper(this);
        navHelper = new com.fitbit.applogic2.NavigationHelper(this);

        getNavigationHelper().openMainPage();
    }

    protected WebDriver getWebDriver() { return driver; }
    protected String getBaseUrl() { return baseUrl; }

    @Override
    public UserHelper getUserHelper() {
        return userHelper;
    }

    @Override
    public NavigationHelper getNavigationHelper() {
        return navHelper;
    }

    @Override
    public void stop() {
        if (driver != null) {
            driver.quit();
        }
    }

}
