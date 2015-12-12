package com.deposit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://depositphotos.com")
public class AnyPage extends PageObject{

    public boolean ensurePageLoaded(){
        return find(By.cssSelector(".livechat-link")).waitUntilVisible().isVisible();
    }
}
