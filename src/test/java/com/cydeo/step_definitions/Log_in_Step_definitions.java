package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Log_in_Step_definitions extends LoginPage {

    LoginPage loginPage=new LoginPage();

    @Given("user is on login page of BleuCRM")
    public void user_is_on_login_page_of_bleu_crm() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
    loginPage.userName.sendKeys(string);


    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
    loginPage.password.sendKeys(string);

    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.btn.click();

    }

    @Then("user should be on the homepage")
    public void user_should_be_on_the_homepage() {
       Assert.assertTrue(loginPage.profile.isDisplayed());
    }


    @Then("user gets the message of incorrect login or password")
    public void user_gets_the_message_of_incorrect_login_or_password() {
       String expectedResult="Incorrect login or password";
       String actual=loginPage.error_message.getText();
       Assert.assertEquals(expectedResult, actual);
    }

    @When("user leaves the field of username empty")
    public void user_leaves_the_field_of_username_empty() {
      loginPage.userName.sendKeys("");
    }
    @When("user leaves the field of password empty")
    public void user_leaves_the_field_of_password_empty() {
      loginPage.password.sendKeys("");
    }
    @Then("user sees the message of Please fill out this field")
    public void user_sees_the_message_of_please_fill_out_this_field() {
        String expected0="Please fill out this field";
        Assert.assertEquals(expected0,loginPage.error_message.getText());
    }

    @When("user click on button of Forgot your password")
    public void user_click_on_button_of_forgot_your_password() {
          loginPage.forgot_btn.click();
    }


    @Then("user lands on the page where get your password is written.")
    public void user_lands_on_the_page_where_get_your_password_is_written() {
        String actual=loginPage.getPassword_btn.getText();
        String expected="Get Password";
        Assert.assertEquals(expected,actual);
    }

    @When("user sees remember me link")
    public void user_sees_remember_me_link() {
        loginPage.remember_btn.isEnabled();

    }
    @Then("user can click this link on the login page")
    public void user_can_click_this_link_on_the_login_page() {
       loginPage.remember_btn.click();
       Assert.assertTrue(loginPage.remember_btn.isSelected());

    }

    @Then("user should see the password is encrypted")
    public void user_should_see_the_password_is_encrypted() {
       String actualPassword=loginPage.bullet_sign.getAttribute("type");
       String expectedPassword="password";
       Assert.assertEquals(expectedPassword, actualPassword);
       System.out.println("actualPassword = " + actualPassword);
    }

    @When("user press the enter button")
    public void user_press_the_enter_button() {

        BrowserUtils.sleep(4);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();

    }@Then("user should see their own {string}")
    public void user_should_see_their_own(String profilName) {
       Assert.assertTrue(loginPage.profile.getText().contains(profilName));
    }



}
