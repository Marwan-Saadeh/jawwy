package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SampleTestingPageObject extends PageBase {

    public SampleTestingPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.header__btn-lang-2 > span.hide-resp")private WebElement languageLink;
    private WebElement getLanguageLink(){
        return languageLink;
    }

    @FindBy(css = "a.rw-words.rw-words-1.header__subscribe.stick-to-top")private WebElement freeSubscribeLink;
    private WebElement getFreeSubscribeLink(){
        return freeSubscribeLink;
    }

    @FindBy(id = "email")private WebElement emailfield;
    private WebElement getEmailfield(){
        return emailfield;
    }

    @FindBy(id = "password")private WebElement passwordfield;
    private WebElement getPasswordfield(){
        return passwordfield;
    }

    @FindBy(css = "p.signup-form__terms > a")private WebElement termsConditionsLink;
    private WebElement getTermsConditionsLink(){
        return termsConditionsLink;
    }

    @FindBy(css = "p.login-form__terms > a")private WebElement clickHereLink;
    private WebElement getClickHereLink(){
        return clickHereLink;
    }

    @FindBy(id = "sub_form")private WebElement continueButton;
    private WebElement getContinueButton(){
        return continueButton;
    }

    @FindBy(css = "select.signup-form__input")private WebElement countryDropDownList;
    private WebElement getCountryDropDownList(){
        return countryDropDownList;
    }

    @FindBy(className = "signup-form__back")private WebElement backButton;
    private WebElement getBackButton(){
        return backButton;
    }

    @FindBy(id = "not_user_subscribe")private WebElement subscribeLink;
    private WebElement getSubscribeLink(){
        return subscribeLink;
    }

    @FindBy(className = "signup-form-terms__title")private WebElement sectionTitle;
    private WebElement getSectionTitle(){
        return sectionTitle;
    }

    public SampleTestingPageObject navigateToJawwytvSite(){
        driver.navigate().to("http://www.jawwy.tv/ ");
        return new SampleTestingPageObject(driver);
    }

    public SampleTestingPageObject changeSiteLanguage(){
        waitElement(getLanguageLink()).click();
        return new SampleTestingPageObject(driver);
    }

    public SampleTestingPageObject navigateToFreeSubscribePage(){
        waitElement(getFreeSubscribeLink()).click();
        return new SampleTestingPageObject(driver);
    }

    public SampleTestingPageObject enterEmailID(String email){
        sendKeyCharByChar(waitElement(getEmailfield()),email);
        return new SampleTestingPageObject(driver);
    }

    public SampleTestingPageObject enterPassword(String password){
        sendKeyCharByChar(waitElement(getPasswordfield()),password);
        return new SampleTestingPageObject(driver);
    }

    public SampleTestingPageObject clickOnContinueButton(){
        waitElement(getContinueButton()).click();
        return new SampleTestingPageObject(driver);
    }

    public boolean isBackButtonDisplayed(){
        waitElement(getCountryDropDownList());
        return getBackButton().isDisplayed();
    }

    public SampleTestingPageObject selectCountry(String country){
        Select ddl = new Select(waitElement(getCountryDropDownList()));
        ddl.selectByVisibleText(country);
        return new SampleTestingPageObject(driver);
    }

    public int paymentMethodsListSize() throws Throwable{
        Thread.sleep(2000);
        List<WebElement> paymentMethods = driver.findElements(By.cssSelector("ul.selectProviders-list > li"));
        return paymentMethods.size();
    }

    public SampleTestingPageObject clickOnClickHereLink(){
        waitElement(getClickHereLink()).click();
        return new SampleTestingPageObject(driver);
    }

    public SampleTestingPageObject clickOnSubscribeLink(){
        waitElement(getSubscribeLink()).click();
        return new SampleTestingPageObject(driver);
    }

    public SampleTestingPageObject clickOnTermsConditionsLink(){
        waitElement(getTermsConditionsLink()).click();
        return new SampleTestingPageObject(driver);
    }

    public boolean isEmailFieldDisplayed(){
        return getEmailfield().isDisplayed();
    }

    public String getPageTitle(){
        return getSectionTitle().getText();
    }

}
