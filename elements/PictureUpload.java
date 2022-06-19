package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage.BasePage;

import java.io.File;

public class PictureUpload extends BasePage {
    private By clickOnElements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By uploadDownloadButton = By.id("item-7");
    private By chooseFileButton = By.id("uploadFile");
    private By uploadFilePath = By.id("uploadedFilePath");


    public PictureUpload(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void pictureUpload(){
        getDriver().findElement(clickOnElements).click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", " ");
        getDriver().findElement(uploadDownloadButton).click();
        File picture = new File("D:\\GIT3\\project_20.05\\itBootCampProject\\sampleFile.jpeg");
        WebElement upload = getDriver().findElement(chooseFileButton);
        upload.sendKeys(picture.getAbsolutePath());
    }

    public String filePath(){
       return getDriver().findElement(uploadFilePath).getText();
    }
}
