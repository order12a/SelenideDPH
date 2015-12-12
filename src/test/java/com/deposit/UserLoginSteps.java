package com.deposit;

import com.deposit.steps.User;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class UserLoginSteps{

    @Managed
    public WebDriver  driver;

    @Steps
    User user;

    @Given("I am at Main Page")
    public void isMainPageOpen(){
        user.checkMainPageLoaded();
    }

    @Given("I am logged out")
    public void ensureLoggedOut(){
        user.isLoggedOut();
    }

    @When("Fill login field '$login' and password field '$password' and click Login Button")
    public void fillUserDataAndLogin(String login, String password){
        user.login(login, password);
    }

    @Then("I am logged in '$login'. I see user menu and avatar holder")
    public void userIsLoggedIn(String login){
        user.isLoggedIn(login);
        user.userMenuDisplayed();
    }
}
