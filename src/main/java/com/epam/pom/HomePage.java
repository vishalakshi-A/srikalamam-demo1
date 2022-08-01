package com.epam.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private By documentation = By.linkText("Documentation");
    private By downloads = By.linkText("downloads");
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public Documentation clickOnDocumentationLink() {
        driver.findElement(documentation).click();
        return new Documentation(driver);
    }
}
