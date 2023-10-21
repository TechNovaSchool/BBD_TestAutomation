package StepDef;

import Locators.HomePage;
import Locators.LoginPage;
import Utils.Config;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageStepDef {

    Driver driver = new Driver();
    LoginPage loginPage = new LoginPage(driver.getDriver());
    HomePage homePage = new HomePage(driver.getDriver());

    @Given("I Login Into The TN Bank")
    public void i_login_into_the_tn_bank() {
        driver.getDriver().get(Config.getProperty("url"));
        loginPage.login(Config.getProperty("username"), Config.getProperty("password"));
    }

    @When("I Am On The Home Page")
    public void i_am_on_the_home_page() {

        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("homePageTitle"));
    }

    @Then("I Should See Add Money Button Is Displayed")
    public void i_should_see_add_money_button_is_displayed() {

        Assert.assertTrue(homePage.addMoneyToChecking.isDisplayed());
        driver.closeDriver();
    }
}
