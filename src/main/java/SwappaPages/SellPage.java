package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SellPage extends CommonAPI {



    public SellPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(SellPage.class);

    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(1) > ul > li:nth-child(3) > a > i")
    WebElement Sell;

    @FindBy(css = "#slide_sell > div.offcanvas-body > div:nth-child(4) > ul > li:nth-child(1) > a")
    WebElement HowToSellBtn;

    @FindBy(css = "#slide_sell > div.offcanvas-body > div:nth-child(4) > ul > li:nth-child(1) > a")
    WebElement FairFees;

    @FindBy(css = "#slide_sell > div.offcanvas-body > div:nth-child(4) > ul > li:nth-child(3) > a")
    WebElement SellerFAQ;

    @FindBy(css = "#slide_sell > div.offcanvas-body > div.slide_menu > a:nth-child(1)")
    WebElement SellMyIphoneBtn;
    @FindBy(css = "#slide_sell > div.offcanvas-body > div.slide_menu > a:nth-child(2)")
    WebElement SellMyPhoneBtn;
    @FindBy(css = "#slide_sell > div.offcanvas-body > div.slide_menu > a:nth-child(3)")
    WebElement SellMyMacBookBtn;
    @FindBy(css = "#slide_sell > div.offcanvas-body > div.slide_menu > a:nth-child(4)")
    WebElement SellMyComputerBtn;
    @FindBy(css = "#slide_sell > div.offcanvas-body > div.slide_menu > a:nth-child(5)")
    WebElement SellMyWatchOrWearableBtn;
    @FindBy(css = "#slide_sell > div.offcanvas-body > div.slide_menu > a:nth-child(6)")
    WebElement SellMyTabletOrIpad;
    @FindBy(css = "#slide_sell > div.offcanvas-body > div.slide_menu > a:nth-child(7)")
    WebElement SellMyVideoGameConsole;
    @FindBy(css = "#slide_sell > div.offcanvas-body > div.slide_menu > a:nth-child(8)")
    WebElement SellMyHomeTech;

    @FindBy(css = "#slide_sell > div.offcanvas-body > div.slide_menu > a:nth-child(9)")
    WebElement SellMyCameraOrLens;

    @FindBy(css = "#slide_sell > div.offcanvas-body > p > a")
    WebElement StartSellingBtn;
    @FindBy(css = "#slide_sell > div.offcanvas-header > button")
    WebElement CloseSellBar;
    @FindBy(css = "#sell_search")
    WebElement SellSearchBar;
    @FindBy(css = "#sell_search_btn")
    WebElement SellSearchBtn;



    public void HoverOverAndClickOnSellBtn(WebDriver driver){


    hoverOver(driver, Sell);LOG.info("Hover Over Sell Button Performed");
        click(Sell);LOG.info("Click On Sell Button Performed");
    }

    public void ClickOnSTartSellingBtn(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        click(StartSellingBtn);LOG.info("Click Start Selling Button Performed");

    }

    public void ClickOnCloseSellBar(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        click(CloseSellBar);LOG.info("Click Close Sell Bar Button Performed");

    }

    public void ClickOnHowToSell(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);

        click(HowToSellBtn);LOG.info("Click How To Sell Button Performed");

    }
    public void ClickOnFairFees(WebDriver driver){


       HoverOverAndClickOnSellBtn(driver);
        click(FairFees); LOG.info("Click Fair Fees Button Performed");
    }

    public void ClickOnSellFaQ(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        click(SellerFAQ);LOG.info("Click Seller FAQ Button Performed");


    }

    public void ClickOnSellMyThenIphoneUnderSellSection(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        click(SellMyIphoneBtn);LOG.info("Click Sell My Iphone Button Performed");


    }

    public void ClickOnSellMyThenPhoneUnderSellSection(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        click(SellMyPhoneBtn);LOG.info("Click Sell MyPhone Button Performed");

    }

    public void ClickOnSellMyThenComputerUnderSellSection(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        click(SellMyComputerBtn);LOG.info("Click Sell My Computer Button Performed");

    }
    public void ClickOnSellMyThenMacBookUnderSellSection(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        click(SellMyMacBookBtn);LOG.info("Click Sell My MacBook Button Performed");

    }


    public void ClickOnSellMyThenWatchOrWearable(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        click(SellMyWatchOrWearableBtn);LOG.info("Click Sell My Watch OR Wearable Button Performed");

    }

    public void ClickOnSellMyThenTabletOrIpad(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        click(SellMyTabletOrIpad); LOG.info("Click Sell My Tablet Or Ipad Button Performed");

    }

    public void ClickOnSellMyVideoGameConsole(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        click(SellMyVideoGameConsole);LOG.info("Click Sell My VideoGame Console Button Performed");

    }
    public void ClickOnSellMyHomeTech(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        click(SellMyHomeTech);LOG.info("Click Sell My HomeTech Button Performed");

    }
    public void ScrollToViewAndClickOnSellMyCameraOrLens(WebDriver driver){

        HoverOverAndClickOnSellBtn(driver);
        ScrollToView(SellMyCameraOrLens,driver);LOG.info("Scroll To view  Sell My Camera Or Lens Button Performed");
        click(SellMyCameraOrLens);LOG.info("Click Sell My Camera Or Lens Button Performed");

    }

    //create a method to scroll
    public void ScrollToView2(WebElement element,WebDriver driver) {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void ScrollTotheBottomOnSellFrame(WebDriver driver){
        HoverOverAndClickOnSellBtn(driver);
        ScrollToView(SellMyCameraOrLens,driver);LOG.info("Scroll To View My Camera Or Lens Button Performed");
    }

    public void HoverOverStartSellingBtn(WebDriver driver){
        HoverOverAndClickOnSellBtn(driver);
        hoverOver(driver,StartSellingBtn);LOG.info("Hover Over Start Selling Button Performed");

    }

    public void TypeInSellSearchBar(String text){

        type(SellSearchBar,text);LOG.info("Type "+text+" in sell SearchBar Performed");

    }

    public void ClickOnSearchBtn(){

        click(SellSearchBtn);LOG.info("Click Sell in Search Bar Button Performed");



    }









}
