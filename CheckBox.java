package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage.BasePage;

public class CheckBox extends BasePage {
    private By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By checkBox = By.xpath("//*[@id=\"item-1\"]");
    private By checkBoxSquare = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]");
    private By result = By.xpath("//*[@id=\"result\"]");


    public CheckBox(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void checkBoxCheck(){
        getDriver().findElement(elements).click();
        getDriver().findElement(checkBox).click();
        getDriver().findElement(checkBoxSquare).click();
    }
    public boolean isResultPresented(){
        return getDriver().findElement(result).isDisplayed();
    }
}
