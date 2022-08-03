package com.epam.pom;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class WebDriverElement {

    public void seleniumTakeScreenshot(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String fileName= "./image.png"+System.currentTimeMillis();
        FileUtils.copyFile(scrFile, new File(fileName));
    }
}
