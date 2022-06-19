package pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage.BasePage;

public class Slider extends BasePage {
    private By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    private By sliderButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[4]");
    private By slider =  By.id("sliderContainer");
    private By sliderValue = By.id("sliderValue");

    public Slider(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void sliderMove(){
        getDriver().findElement(widgets).click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,350)", " ");
        getDriver().findElement(sliderButton).click();
        Actions sliderMovement = new Actions(getDriver());
        WebElement sliderLocation = getDriver().findElement(slider);
        sliderMovement.dragAndDropBy(sliderLocation, 50, 255 ).build().perform();
    }

    public String sliderValue(){
        return getDriver().findElement(By.id("sliderValue")).getAttribute("value");
    }
}
