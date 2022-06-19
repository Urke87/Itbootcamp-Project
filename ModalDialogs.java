package pages.AlertsFramesWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage.BasePage;

public class ModalDialogs extends BasePage {
    private By alertsFrameWindowsButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    private By modalDialogs = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[5]");
    private By smallModalButton = By.id("showSmallModal");
    private By largeModalButton = By.id("showLargeModal");
    private By smallModalText = By.id("example-modal-sizes-title-sm");
    private By smallModalClose = By.id("closeSmallModal");
    private By largeModalText = By.id("example-modal-sizes-title-lg");
    private By largeModalClose= By.id("closeLargeModal");

    public ModalDialogs(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void smallLargeModal(){
        getDriver().findElement(alertsFrameWindowsButton).click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", " ");
        getDriver().findElement(modalDialogs).click();
        getDriver().findElement(smallModalButton).click();
        Assert.assertEquals(getDriver().findElement(smallModalText).getText(), "Small Modal");
        getDriver().findElement(smallModalClose).click();
        getDriver().findElement(largeModalButton).click();

    }
    public String getLargeModalText(){
        return getDriver().findElement(largeModalText).getText();
    }
}
