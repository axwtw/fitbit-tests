package com.fitbit.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by sergey on 11/5/15.
 */
public class RegistrationPage extends AnyPage {

    public RegistrationPage(PageManager pages) {
        super(pages);
    }

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(id = "termsPrivacyConnected")
    private WebElement termsCheckbox;

    @FindBy(id = "emailSubscribeConnected")
    private WebElement keppMeUpdatedCheckbox;

    @FindBy(xpath = "//*[@class='common-btn common-btn-submit wide track-Auth-SignUp-ClickFitbit']")
    private WebElement continueBtn;

    @FindBy(id = "fullname")
    private WebElement nameField;

    @FindBy(id = "gender-button")
    private WebElement genderSelect;

    @FindBy(name = "birthDayOfMonth")
    private WebElement birthDayOfMonthField;

    @FindBy(name = "birthMonth")
    private WebElement birthfMonthField;

    @FindBy(name = "birthYear")
    private WebElement birthYearField;

    @FindBy(xpath = "//*[@id='fitbitSelect_1']/div")
    private WebElement heightSwitcher;

    @FindBy(id = "heightCM")
    private WebElement centimetersSelect;

    @FindBy(id = "heightFeet")
    private WebElement feetSelect;

    @FindBy(id = "heightInches")
    private WebElement inchesSelect;

    @FindBy(xpath = "//*[@id='fitbitSelect_2']/div")
    private WebElement weightSwitcher;

    @FindBy(id = "field-weight-stone")
    private WebElement stSelect;

    @FindBy(id = "field-weight-stonelbs")
    private WebElement stoneLbsSelect;

    @FindBy(id = "field-weight-kg")
    private WebElement kgSelect;

    @FindBy(id = "field-weight-lbs")
    private WebElement poundsLbsSelect;

    @FindBy(id = "complete-profile-submit")
    private WebElement saveProfileBtn;

    @FindBy(xpath = "//*[@class='errorList']/li[1]")
    private WebElement validNameAlert;

    @FindBy(xpath = "//*[@class='errorList']/li[2]")
    private WebElement validGenderAlert;

    @FindBy(xpath = "//*[@class='errorList']/li[3]")
    private WebElement validDayOfMonthAlert;

    @FindBy(xpath = "//*[@class='errorList']/li[4]")
    private WebElement validBirthMonthAlert;

    @FindBy(xpath = "//*[@class='errorList']/li[5]")
    private WebElement validYearAlert;

    @FindBy(xpath = "//*[@class='errorList']/li[6]")
    private WebElement validWeightAlert;

    @FindBy(xpath = "//*[@class='errorList']/li[7]")
    private WebElement validHeightAlert;

    @FindBy(xpath = "//*[@class='errorList']/li[8]")
    private WebElement validInchesAlert;

    @FindBy(xpath = "//*[@class='ui-corner-bottom']")
    private WebElement male;

    public WebElement getValidNameAlert() {
        return validNameAlert;
    }

    public WebElement getValidGenderAlert() {
        return validGenderAlert;
    }

    public WebElement getValidDayOfMonthAlert() {
        return validDayOfMonthAlert;
    }

    public WebElement getValidBirthMonthAlert() {
        return validBirthMonthAlert;
    }

    public WebElement getValidYearAlert() {
        return validYearAlert;
    }

    public WebElement getValidWeightAlert() {
        return validWeightAlert;
    }

    public WebElement getValidHeightAlert() {
        return validHeightAlert;
    }

    public WebElement getValidInchesAlert() {
        return validInchesAlert;
    }





    public RegistrationPage setEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public RegistrationPage setPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public RegistrationPage clickTermsCheckbox() {
        termsCheckbox.click();
        return this;
    }

    public RegistrationPage clickKeepMeCheckbox() {
        keppMeUpdatedCheckbox.click();
        return this;
    }

    public RegistrationPage ensureElementsAreLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//input[@class='field email']")));
        return this;
    }

    public RegistrationPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//button[@class='common-btn common-btn-submit track-Auth-Login-ClickFitbit']")));
        return this;
    }

    public RegistrationPage ensurePersonalInfoPopupIsLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions
                .elementToBeClickable(By.id("fullname")));
        return this;
    }

//    public RegistrationPage ensure

    public RegistrationPage clickContinueBtn() {
        continueBtn.click();
        return this;
    }

    /**
     * Personal Information Popup actions
     */

    public RegistrationPage setName(String name) {
        nameField.clear();
        nameField.sendKeys(name);
        return this;
    }

    public RegistrationPage switchWeightType() {
        weightSwitcher.click();
        return this;
    }

    public RegistrationPage switchHeightType() {
        heightSwitcher.click();
        return this;
    }

    public RegistrationPage selectGender() {
        genderSelect.click();
        return this;
    }

    public RegistrationPage selectMaleGender() {
        male.click();
        return this;
    }

    public RegistrationPage setBirthDay(String day) {
        birthDayOfMonthField.clear();
        birthDayOfMonthField.sendKeys(day);
        return this;
    }

    public RegistrationPage setBirthMonth(String month) {
        birthfMonthField.clear();
        birthfMonthField.sendKeys(month);
        return this;
    }

    public RegistrationPage setBirthYear(String year) {
        birthYearField.clear();
        birthYearField.sendKeys(year);
        return this;
    }

    public RegistrationPage setHeightCentimeters(String centimetersValue) {
        centimetersSelect.clear();
        centimetersSelect.sendKeys(centimetersValue);
        return this;
    }

    public RegistrationPage setHeightFeet(String feetValue) {
        feetSelect.clear();
        feetSelect.sendKeys(feetValue);
        return this;
    }

    public RegistrationPage setHeightInches(String inchesValue) {
        inchesSelect.clear();
        inchesSelect.sendKeys(inchesValue);
        return this;
    }

    public RegistrationPage setWeightPoundsLbs(String poundsLbsValue) {
        poundsLbsSelect.clear();
        poundsLbsSelect.sendKeys(poundsLbsValue);
        return this;
    }

    public RegistrationPage setWeightKilograms(String poundsKgValue) {
        kgSelect.clear();
        kgSelect.sendKeys(poundsKgValue);
        return this;
    }

    public RegistrationPage setWeightStoneSt(String poundsLbsValue) {
        stSelect.clear();
        stSelect.sendKeys(poundsLbsValue);
        return this;
    }

    public RegistrationPage setWeightStoneLbs(String poundsLbsValue) {
        stoneLbsSelect.clear();
        stoneLbsSelect.sendKeys(poundsLbsValue);
        return this;
    }

    public DashboardPage saveProfile() {
        saveProfileBtn.click();
        return pages.dashboardPage;
    }

}
