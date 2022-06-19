package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage.BasePage;

public class Elements extends BasePage {

    private By clickOnElements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");

    public Elements(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickOnElement() {
        getDriver().findElement(clickOnElements).click();
    }

    public int numberOfElements() {
        // List<WebElement> numberOfElements = getDriver().findElement(By.className("element-group")).findElements(By.className("btn-light"));
        int elements = getDriver().findElement(By.className("element-group")).findElements(By.className("btn-light")).size();
      return   elements;
    }
}

