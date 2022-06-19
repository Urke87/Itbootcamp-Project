package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage.BasePage;

public class TextBox extends BasePage {
    private By clickOnElements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By textBoxButton = By.id("item-0");
    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By output = By.id("output");


    public TextBox(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void textBoxInformation(String fullName, String email, String currentAddress, String permanentAddres){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", " ");
        getDriver().findElement(clickOnElements).click();
        getDriver().findElement(textBoxButton).click();
        getDriver().findElement(this.fullName).sendKeys(fullName);
        getDriver().findElement(this.email).sendKeys(email);
        getDriver().findElement(this.currentAddress).sendKeys(currentAddress);
        getDriver().findElement(this.permanentAddress).sendKeys(permanentAddres);
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
        jss.executeScript("window.scrollBy(0,350)", " ");
        getDriver().findElement(submitButton).click();
    }
    public String getText(){
       return getDriver().findElement(output).getText();
    }
    public boolean isOutputVisible(){
       return getDriver().findElement(output).isDisplayed();
    }
}
