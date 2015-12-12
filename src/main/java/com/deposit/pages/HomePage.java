package com.deposit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {
    @FindBy(xpath = "//span[@data-tips-id='userMenu']/i[contains(@class,'arrow')]")
    WebElementFacade userMenuArrow;

    @FindBy(xpath = "//ul[@class='menu-tabs']")
    WebElementFacade homeMenuList;

    public boolean ensurePageLoaded(){
        return findBy(".avatar-holder>img").waitUntilVisible().isVisible();
    }

    public boolean isLoggedIn(String login){
        System.out.println("\nExpected login name - " + login);
        System.out.println("\n" + findBy("//span[@class='username']").waitUntilVisible().getText() + "\n");
        return findBy("//span[@class='username']").waitUntilVisible().getText().equalsIgnoreCase(login);
    }

    public boolean isUserMenuDisplayed(){
        return homeMenuList.waitUntilVisible().isVisible();
    }
}
