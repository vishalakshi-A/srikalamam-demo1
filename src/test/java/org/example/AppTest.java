package org.example;

import com.epam.pom.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//WebDriver driver;
/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    WebDriver driver;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Vishalakshi_A\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void testWithoutPOM()
    {
        //driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        //step-1
        WebElement documentation= driver .findElement(By.linkText("Documentation"));
        documentation.click();
        //step-2
        WebElement downloads= driver.findElement(By.linkText("Downloads"));
        downloads.click();
        //step-3
        WebElement webDriverElement=driver.findElement(By.xpath("//a[text()='WebDriver']"));
        webDriverElement.click();
    }
    @Test
    public void testWithPOM()
    {
       String actualValue=  new HomePage(driver).clickOnDocumentationLink().verifyThatWeAreOnDocumentationPage();
        Assert.assertEquals(actualValue,"Documentation");

    }

}
