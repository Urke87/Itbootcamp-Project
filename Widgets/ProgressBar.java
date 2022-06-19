package pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage.BasePage;

public class ProgressBar extends BasePage {
    private By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    private By progressBarButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[5]");

    private By startStopButton = By.id("startStopButton");
    private By progressBar = By.id("progressBar");
    private By resetButton = By.id("resetButton");

    public ProgressBar(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void progressBarValue(){
        getDriver().findElement(widgets).click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,350)", " ");
        getDriver().findElement(progressBarButton).click();
        getDriver().findElement(startStopButton).click();
    }
    /*public String getValue(){
        getDriverWait().until(ExpectedConditions.attributeContains(By.id("progressBar"),"aria-valuenow", "100"));
        return getDriver().findElement(progressBar).getAttribute("aria-valuenow=");
    }*/
    public boolean isResetButtonAvailable(){
       return getDriver().findElement(resetButton).isDisplayed();
    }
}
