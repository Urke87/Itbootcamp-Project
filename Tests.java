package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class Tests extends BaseTests {

    @Test(priority = 1)
    public void modalDialogs(){
        getModalDialogs().smallLargeModal();
        Assert.assertEquals(getModalDialogs().getLargeModalText(), "Large Modal");
    }

    @Test(priority = 2)
    public void clickMessages() throws InterruptedException {
        getButtons().doubleclickMessage();
        Assert.assertEquals(getButtons().doubleClickMessageText(), "You have done a double click");
        getButtons().rightClickMessage();
        Assert.assertEquals(getButtons().rightClickMessageText(), "You have done a right click");
        getButtons().leftClickMessage();
        Assert.assertEquals(getButtons().leftClickMessageText(), "You have done a dynamic click");
    }

    @Test(priority = 3)
    public void checkBox() {
        getCheckBox().checkBoxCheck();
        Assert.assertTrue(getCheckBox().isResultPresented());
    }


    @Test(priority = 4)
    public void clickOnElements() {
        getElements().clickOnElement();
        Assert.assertEquals(getElements().getDriver().getCurrentUrl(), "https://demoqa.com/elements");
        Assert.assertEquals(getElements().numberOfElements(), 9);

    }


    @Test(priority = 5)
    public void pictureUpload() {
        getPictureUpload().pictureUpload();
        Assert.assertTrue(getPictureUpload().filePath().contains("C:\\fakepath\\sampleFile.jpeg"));
    }

    @Test(priority = 6)
    public void radioButton() {
        getRadioButton().radioButtonYes();
        Assert.assertEquals(getRadioButton().radioButtonMessage(), "Yes");
        getRadioButton().radioButtonImpressive();
        Assert.assertEquals(getRadioButton().radioButtonMessage(), "Impressive");
    }


    @Test(priority = 7)
    public void textBoxInformation() {
        getTextBox().textBoxInformation("Uros Popovic", "popovic87@gmail.com", "Vinogradarska 10", "Beogradska 11");
        Assert.assertTrue(getTextBox().isOutputVisible());

    }

    @Test(priority = 8)
    public void homePageElementsClick(){
        getHomePageElements().homeButtonsCheck();
        Assert.assertEquals(getHomePageElements().getDriver().getCurrentUrl(), "https://demoqa.com/");
    }

    @Test(priority = 9)
    public void accordianMessage(){
        getAccordian().clickOnHeadings();
        Assert.assertTrue(getAccordian().getHeadingText());
    }

    @Test(priority = 10)
    public void progressBar(){
        getProgressBar().progressBarValue();
        Assert.assertTrue(getProgressBar().isResetButtonAvailable());
    }


    @Test(priority = 11)
    public void slider() throws InterruptedException {
        getSlider().sliderMove();
        Assert.assertEquals(getSlider().sliderValue(), "78");

    }









}