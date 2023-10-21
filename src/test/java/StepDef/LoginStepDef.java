package StepDef;

import Locators.LoginPage;
import Utils.Config;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    Driver driver = new Driver();
    LoginPage page = new LoginPage(driver.getDriver());

    @Given("I Navigate To Login Page")
    public void i_navigate_to_login_page() {

        driver.getDriver().get(Config.getProperty("url"));
    }

    @When("I Enter Username as {string}")
    public void i_enter_username_as(String username) {

        page.enterUsername(username);
    }

    @When("I Enter Password as {string}")
    public void i_enter_password_as(String password) {

        page.password.sendKeys(password);
    }

    @When("I Click Login Button")
    public void i_click_login_button() {

        page.LoginButton.click();
    }

    @Then("I Should Login Successfully")
    public void i_should_login_successfully() {

        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("homePageTitle"));
        driver.closeDriver();
    }



}
