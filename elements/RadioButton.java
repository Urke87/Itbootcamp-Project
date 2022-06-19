package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage.BasePage;

public class RadioButton extends BasePage {
    private By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By radioButton = By.id("item-2");
    private By yesButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By impressiveButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
    private By selectedYesImpressive = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span");


    public RadioButton(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void radioButtonYes(){
        getDriver().findElement(elements).click();
        getDriver().findElement(radioButton).click();
        getDriver().findElement(yesButton).click();

    }
    public void radioButtonImpressive(){
        getDriver().findElement(elements).click();
        getDriver().findElement(radioButton).click();
        getDriver().findElement(impressiveButton).click();
    }
    public String radioButtonMessage(){
        return getDriver().findElement(selectedYesImpressive).getText();
    }
}
