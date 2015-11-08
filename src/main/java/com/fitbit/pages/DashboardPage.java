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

    @FindBy(xpath = "//span[@class='message']")
    private WebElement message;

    @FindBy(xpath = "//*[@class='confirmButton confirm']")
    private WebElement weightPopupSetGoalBtn;

    @FindBy(xpath = "//*[@class='confirmButton start-food-plan-link']")
    private WebElement foodPlanStartNowBtn;

    @FindBy(xpath = "//*[@class='goal']")
    private WebElement caloriesBurnedPopup;

    @FindBy(xpath = "//*[@class='status js_status UNDER']")
    private WebElement caloriesInvsOutPopup;

    @FindBy(xpath = "//*[@class='modal-title']")
    private WebElement goalPopupTitle;

    @FindBy(xpath = "//*[@class='largeTileTitle']")
    private WebElement caloriesBurnedPopupTitle;

    @FindBy(xpath = "//*[@class='hdr clearfix']/h2")
    private WebElement foodPlanPopupTitle;

    @FindBy(xpath = "//*[@class='largeTileTitle']")
    private WebElement underPopupTitle;

    public String getMessage() {
        return message.getText();
    }

    public String getGoalPopupTitleText() { return  goalPopupTitle.getText(); }

    public String getCaloriesBurnedPopupTitleText() { return caloriesBurnedPopupTitle.getText(); }

    public String getFoodPlanPopupTitle() { return foodPlanPopupTitle.getText(); }

    public String getUnderPopupTitle() { return underPopupTitle.getText(); }

    public DashboardPage openWeightGoalPopup() {
        weightPopupSetGoalBtn.click();
        return this;
    }

    public DashboardPage openCaloriesBurnedPopup() {
        caloriesBurnedPopup.click();
        return this;
    }

    public DashboardPage openFoodPlanPopup() {
        foodPlanStartNowBtn.click();
        return this;
    }

    public DashboardPage openUnderPopup() {
        caloriesInvsOutPopup.click();
        return this;
    }
}
