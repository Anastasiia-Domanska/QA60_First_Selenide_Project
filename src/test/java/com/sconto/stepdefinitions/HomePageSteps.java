package com.sconto.stepdefinitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.sconto.pages.HomePage.baseUrl;

public class HomePageSteps {
    HomePage home;
    LoginPage login;

    @Given("user is on the home page")
    public void user_is_on_the_home_page(){
        home = open(baseUrl, HomePage.class);
        getWebDriver().manage().window().maximize();
        home.acceptCookies();
    }

    @When("user clicks on the login icon")
    public void user_clicks_on_the_login_icon(){
        home.clickOnLoginIcon();
    }

    @Then("user verifies login form is displayed")
    public void verify_login_form_is_displayed(){
        login = Selenide.page(LoginPage.class);
        login.verifyLoginTitle();
    }
}
