package pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage.BasePage;

public class Accordian extends BasePage {
    private By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    private By accordianButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[1]");

    private By sectionOneHeading = By.id("section1Heading");
    private By sectionOneContent = By.id("section1Content");
    private By sectionTwoHeading = By.id("section2Heading");
    private By sectionTwoContent = By.id("section2Content");
    private By sectionThreeHeading = By.id("section3Heading");
    private By sectionThreeContent = By.xpath("//*[@id=\"section3Content\"]/p");


    public Accordian(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickOnHeadings(){
        getDriver().findElement(widgets).click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", " ");
        getDriver().findElement(accordianButton).click();
        getDriver().findElement(sectionOneHeading).click();
        Assert.assertTrue(getDriver().findElement(sectionOneContent).getText().contains("Lorem Ipsum is simply dummy"));
        getDriver().findElement(sectionTwoHeading).click();
        Assert.assertTrue(getDriver().findElement(sectionTwoContent).getText().contains("Contrary to popular belief"));
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,350)", " ");
        getDriver().findElement(sectionThreeHeading).click();
    }
    public boolean getHeadingText(){
        return getDriver().findElement(sectionThreeContent).isDisplayed();
    }
}
