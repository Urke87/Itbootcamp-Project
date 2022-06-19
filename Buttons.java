package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage.BasePage;

public class Buttons extends BasePage {
    private By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By buttonsOption = By.xpath("//*[@id=\"item-4\"]/span");

    private By doubleClickBtn = By.id("doubleClickBtn");
    private By rightClickMe = By.id("rightClickBtn");
    private By clickMe = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");

    private By doubleClickMessage = By.id("doubleClickMessage");
    private By rightClickMessage = By.id("rightClickMessage");
    private By oneClickMessage = By.id("dynamicClickMessage");



    public Buttons(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void doubleclickMessage() throws InterruptedException {
        getDriver().findElement(elements).click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", " ");
        getDriver().findElement(buttonsOption).click();
        Thread.sleep(10000);
        Actions actions = new Actions(getDriver());
        WebElement doubleClickOnElement = getDriver().findElement(doubleClickBtn);
        actions.doubleClick(doubleClickOnElement).perform();
        //getDriver().findElement(doubleClickMessage).getText();

    }
    public String doubleClickMessageText(){
        return getDriver().findElement(doubleClickMessage).getText();
    }

    public void rightClickMessage() throws InterruptedException {
        Thread.sleep(2000);
        Actions actions = new Actions(getDriver());
        WebElement rightClickOnElement = getDriver().findElement(rightClickMe);
        actions.contextClick(rightClickOnElement).perform();
    }
    public String rightClickMessageText(){
        return getDriver().findElement(rightClickMessage).getText();
    }
    public void leftClickMessage() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(clickMe).click();
    }
    public String leftClickMessageText(){
        return getDriver().findElement(oneClickMessage).getText();
    }
}
