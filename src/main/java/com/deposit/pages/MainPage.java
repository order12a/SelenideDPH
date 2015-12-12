package com.deposit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://depositphotos.com")
public class MainPage extends PageObject{

    @FindBy(css = ".button.xl.white.d_html_tips")
    WebElementFacade loginTipButton;

    @FindBy(css = ".top-logo>img")
    WebElementFacade depositLogo;

    public boolean ensurePageLoaded(){
        depositLogo.waitUntilVisible();
        return depositLogo.isVisible();
    }

    public boolean isLoggedOut(){
        return loginTipButton.waitUntilVisible().isVisible();
    }

    public void openLoginTip(){
        loginTipButton.waitUntilClickable();
        loginTipButton.click();
    }

}
