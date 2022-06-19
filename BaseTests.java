package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.NijeZavrseno.*;
import pages.AlertsFramesWindows.ModalDialogs;
import pages.HomePage.HomePageElements;
import pages.Widgets.Accordian;
import pages.Widgets.ProgressBar;
import pages.Widgets.Slider;
import pages.elements.*;


import java.time.Duration;

public class BaseTests {
    private WebDriver driver;
    private WebDriverWait driverWait;

    private Elements elements;
    private PictureUpload pictureUpload;
    private Buttons buttons;

    private TextBox textBox;
    private CheckBox checkBox;
    private RadioButton radioButton;

    private Slider slider;
    private ProgressBar progressBar;

    private HomePageElements homePageElements;
    private ModalDialogs modalDialogs;
    private Accordian accordian;

    // private BookStoreRegistration bookStoreRegistration;
    // private Forms forms;
    // private Alerts alerts;
    // private WebTables webTables;
    // private AutoComplete autoComplete;
    //private Links links;


    @BeforeClass

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/");
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        elements = new Elements(driver, driverWait);
        pictureUpload = new PictureUpload(driver, driverWait);
        buttons = new Buttons(driver, driverWait);
        textBox = new TextBox(driver, driverWait);
        checkBox = new CheckBox(driver, driverWait);
        radioButton = new RadioButton(driver, driverWait);
        slider = new Slider(driver, driverWait);
        progressBar = new ProgressBar(driver, driverWait);
        homePageElements = new HomePageElements(driver, driverWait);
        modalDialogs = new ModalDialogs(driver, driverWait);
        accordian = new Accordian(driver, driverWait);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //forms = new Forms(driver, driverWait);
        //alerts = new Alerts(driver, driverWait);
        //bookStoreRegistration = new BookStoreRegistration(driver, driverWait);
        //webTables = new WebTables(driver, driverWait);
        //autoComplete = new AutoComplete(driver, driverWait);
        //links = new Links(driver,driverWait);
    }
    public Elements getElements() {
        return elements;
    }

    public PictureUpload getPictureUpload() {
        return pictureUpload;
    }
    public Buttons getButtons() {
        return buttons;
    }

    public TextBox getTextBox() {
        return textBox;
    }
    public CheckBox getCheckBox(){
        return checkBox;
    }
    public RadioButton getRadioButton(){
        return radioButton;
    }

    public Slider getSlider() {
        return slider;
    }

    public ProgressBar getProgressBar() {
        return progressBar;
    }



    public HomePageElements getHomePageElements() {
        return homePageElements;
    }

    public ModalDialogs getModalDialogs() {
        return modalDialogs;
    }

    public Accordian getAccordian() {
        return accordian;
    }

     /* public BookStoreRegistration getBookStoreRegistration() {
        return bookStoreRegistration;
    }*/
    /*public Forms getForms() {
        return forms;
    }*/
     /*public Alerts getAlerts() {
        return alerts;
    }*/
    /*public WebTables getWebTables() {
        return webTables;
    }*/
    /* public AutoComplete getAutoComplete() {
        return autoComplete;
    }*/
    /* public Links getLinks() {
         return links;
     }*/



    @AfterClass
    public void close(){
        driver.close();
    }
}

