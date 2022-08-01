package com.epam.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Documentation {
    WebDriver driver;
    private By doc= By.xpath("//a[text()='Documentation']");

    public Documentation(WebDriver driver){
        this.driver=driver;
    }

public String verifyThatWeAreOnDocumentationPage()
        {
       return driver.findElement(doc).getText();
    }
}

