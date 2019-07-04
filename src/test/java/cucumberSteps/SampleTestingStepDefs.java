package cucumberSteps;

import common.PageFactory;
import cucumber.api.java.en.*;
import org.testng.Assert;

public class SampleTestingStepDefs {

    @Given("^Jawwytv site opens successfully$")
    public void Jawwytv_site_opens_successfully() throws Throwable{
        PageFactory.instance().sampleTestingPageObject().navigateToJawwytvSite();
    }

    @When("^User changes language in welcome screen$")
    public void User_changes_language_in_welcome_screen() throws Throwable{
        PageFactory.instance().sampleTestingPageObject().changeSiteLanguage();
    }

    @And("^User clicks on seven days free subscribe now button$")
    public void User_clicks_on_seven_days_free_subscribe_now_button() throws Throwable{
        PageFactory.instance().sampleTestingPageObject().navigateToFreeSubscribePage();
    }

    @Then("^User enters username as (.*)$")
    public void User_enters_username_as(String username) throws Throwable{
        PageFactory.instance().sampleTestingPageObject().enterEmailID(username);
    }

    @And("^User enters password as \"(.*)\"$")
    public void User_enters_password_as(String password) throws Throwable{
        PageFactory.instance().sampleTestingPageObject().enterPassword(password);
    }

    @And("^User clicks on continue button$")
    public void User_clicks_on_continue_button() throws Throwable{
        PageFactory.instance().sampleTestingPageObject().clickOnContinueButton();
    }

    @Then("^User should see back button displayed on payment screen$")
    public void User_should_see_back_button_displayed_on_payment_screen() throws Throwable{
        boolean isBackButtonDisplayed = PageFactory.instance().sampleTestingPageObject().isBackButtonDisplayed();

        Assert.assertTrue(isBackButtonDisplayed, "Back button is not displayed");
    }

    @And("^User should selects (.*) from country dropdown menu$")
    public void User_should_selects_country_from_country_dropdown_menu(String country) throws Throwable{
        PageFactory.instance().sampleTestingPageObject().selectCountry(country);
    }

    @Then("^User should see that only credit card payment method is displayed$")
    public void User_should_see_that_only_credit_card_payment_method_is_displayed() throws Throwable{
        int numberOfPaymentMethods = PageFactory.instance().sampleTestingPageObject().paymentMethodsListSize();

        Assert.assertEquals(numberOfPaymentMethods, 1);
    }


    @Then("^User should see that two payment methods are displayed$")
    public void User_should_see_that_two_payment_methods_are_displayed() throws Throwable{
        int numberOfPaymentMethods = PageFactory.instance().sampleTestingPageObject().paymentMethodsListSize();

        Assert.assertEquals(numberOfPaymentMethods, 2);
    }

    @Then("^User clicks on Click here link in create your account section$")
    public void User_clicks_on_Click_here_link_in_create_your_account_section() throws Throwable{
        PageFactory.instance().sampleTestingPageObject().clickOnClickHereLink();
    }

    @And("^User clicks on Subscribe link in Existing User section$")
    public void User_clicks_on_Subscribe_link_in_Existing_User_section() throws Throwable{
        PageFactory.instance().sampleTestingPageObject().clickOnSubscribeLink();
    }

    @Then("^User should navigate to Create your account section$")
    public void User_should_navigate_to_Create_your_account_section() throws Throwable{
        boolean isEmailFieldDisplayed = PageFactory.instance().sampleTestingPageObject().isEmailFieldDisplayed();

        Assert.assertTrue(isEmailFieldDisplayed, "this section is not Create your account section");
    }

    @Then("^User clicks on Terms and Conditions link in create your account section$")
    public void User_clicks_on_Terms_and_Conditions_link_in_create_your_account_section() throws Throwable{
        PageFactory.instance().sampleTestingPageObject().clickOnTermsConditionsLink();
    }

    @Then("^User should see that Terms and Conditions section is displayed$")
    public void User_should_see_that_Terms_Conditions_section_is_displayed() throws Throwable{
        String sectionTitle = PageFactory.instance().sampleTestingPageObject().getPageTitle();

        Assert.assertEquals(sectionTitle, "Terms & Conditions");
    }

}
