package com.deposit.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Page extends PageObject {

    WebDriver driver;

    public Page(){
        driver = getDriver();
        setImplicitTimeout(15, TimeUnit.SECONDS);
        withTimeoutOf(15, TimeUnit.SECONDS);
    }
}
