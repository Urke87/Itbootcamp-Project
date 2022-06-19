package pages.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage.BasePage;

public class HomePageElements extends BasePage {
    private By elementsButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By formsButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]");
    private By alertsFrameWindowsButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    private By widgetsButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    private By interactionsButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]");
    private By bookStoreApplicationButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]");
    private By homePageButton = By.xpath("//*[@id=\"app\"]/header/a");

    public HomePageElements(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public String homeButtonsCheck(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,150)", " ");
        getDriver().findElement(elementsButton).click();
        getDriver().findElement(homePageButton).click();
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,150)", " ");
        //getDriver().navigate().back();
        getDriver().findElement(formsButton).click();
        getDriver().findElement(homePageButton).click();
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,150)", " ");
        getDriver().findElement(alertsFrameWindowsButton).click();
        getDriver().findElement(homePageButton).click();
        JavascriptExecutor js3 = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,150)", " ");
        getDriver().findElement(widgetsButton).click();
        getDriver().findElement(homePageButton).click();
        JavascriptExecutor js4 = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,150)", " ");
        getDriver().findElement(interactionsButton).click();
        getDriver().findElement(homePageButton).click();
        JavascriptExecutor js5 = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,150)", " ");
        getDriver().findElement(bookStoreApplicationButton).click();
        getDriver().findElement(homePageButton).click();
        return getDriver().getCurrentUrl();
    }
}
