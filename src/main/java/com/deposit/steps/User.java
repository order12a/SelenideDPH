package com.deposit.steps;

import com.deposit.pages.AnyPage;
import com.deposit.pages.HomePage;
import com.deposit.pages.LoginTip;
import com.deposit.pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;

public class User extends ScenarioSteps{

    AnyPage anyPage;
    MainPage mainPage;
    LoginTip loginTip;
    HomePage homePage;

    @Step
    public void checkMainPageLoaded() {
        anyPage.open();
        anyPage.ensurePageLoaded();
        mainPage.ensurePageLoaded();
    }

    @Step
    public void isLoggedOut() {
        assertThat("User should be logged out.", mainPage.isLoggedOut());
    }

    @Step
    public void login(String login, String password) {
        mainPage.openLoginTip();
        loginTip.login(login, password);
    }

    @Step
    public void isLoggedIn(String login) {
        homePage.ensurePageLoaded();
        assertThat("User should be logged in.", homePage.isLoggedIn(login));
    }

    @Step
    public void userMenuDisplayed() {
        assertThat("User should see menu.", homePage.isUserMenuDisplayed());
    }
}
