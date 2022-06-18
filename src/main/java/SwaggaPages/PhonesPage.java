package SwaggaPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PhonesPage extends CommonAPI {



    public PhonesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement UnlockedPhones;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(2) > a")
    WebElement Phones;
    @FindBy(css = "#section_billboard > div:nth-child(1) > div.text-center > a")
    WebElement MoreUnlockedIphones ;
    @FindBy(css = "#section_billboard > div:nth-child(3) > div.text-center > a")
    WebElement MoreUnlockedSamsung;
    @FindBy(css = "#section_billboard > div:nth-child(2) > div.text-center > a")
    WebElement MoreUnlockedGoogle;
    @FindBy(css = "")
    WebElement UnlockedMotorola;
    @FindBy(css = "#section_billboard > div:nth-child(4) > div.text-center > a")
    WebElement MoreUnlockedOnePlus;
    @FindBy(css = "#section_billboard > div:nth-child(3) > div.row.row-cols-1.row-cols-md-2.row-cols-lg-3.row-cols-xl-4.justify-content-center > div:nth-child(2) > div > div.card-body.text-center > div > div:nth-child(1) > a > img")
    WebElement UnlockedLG;


    public void ScrollToView(WebElement element,WebDriver driver) {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }



    public void SelectUnlockedPhones(WebDriver driver){

        hoverOver(driver,Phones);
        waitFor(2);
        click(UnlockedPhones);
        waitFor(3);

    }

    public void SelectUnlockedIPhones(WebDriver driver){

        SelectUnlockedPhones(driver);
        click(MoreUnlockedIphones);

    }

    public void ScrollDownAndSelectUnlockedSamsung(WebDriver driver){
        SelectUnlockedPhones(driver);
        ScrollToView(MoreUnlockedSamsung,driver);
        waitFor(5);
        click(MoreUnlockedSamsung);
    }

    public void ScrollDownAndSelectUnlockedGoogle(WebDriver driver){

       SelectUnlockedPhones(driver);
        ScrollToView(MoreUnlockedGoogle,driver);
        waitFor(5);
        click(MoreUnlockedGoogle);

    }

    public void ScrollDownAndSelectUnlockedMotorola(WebDriver driver){

        SelectUnlockedPhones(driver);
        ScrollToView(UnlockedMotorola,driver);
        waitFor(5);
        //click(UnlockedMotorola);

    }

    public void ScrollDownAndSelectUnlockedOnePlus(WebDriver driver){

       SelectUnlockedPhones(driver);
        ScrollToView(MoreUnlockedOnePlus,driver);
        waitFor(5);
        click(MoreUnlockedOnePlus);

    }
    public void ScrollDownAndSelectUnlockedLG(WebDriver driver){

        SelectUnlockedPhones(driver);
        ScrollToView(UnlockedLG,driver);
        waitFor(5);
        //click(UnlockedLG);

    }
}
