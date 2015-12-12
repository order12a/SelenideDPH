package com.deposit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class LoginTip extends PageObject {
    @FindBy(css = ".d_placeholder[name=username]")
    WebElementFacade loginField;

    @FindBy(css = ".d_placeholder[name=password]")
    WebElementFacade passwordField;

    @FindBy(css = ".button[type=submit]")
    WebElementFacade loginButton;

    public boolean ensureTipOpened(){
        return find(By.cssSelector(".d_tips_data.login-form-tips")).waitUntilVisible().isVisible();
    }

    public void login(String login, String password){
        waitFor(loginButton).isVisible();
        loginField.type(login);
        passwordField.type(password);
        loginButton.click();
    }
}
