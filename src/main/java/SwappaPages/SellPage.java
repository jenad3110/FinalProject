package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellPage extends CommonAPI {



    public SellPage(WebDriver driver) {PageFactory.initElements(driver, this);}

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



    public void ClickOnSellBtn(WebDriver driver){


        hoverOver(driver, Sell);
        click(Sell);
    }

    public void ClickOnSTartSellingBtn(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(StartSellingBtn);

    }

    public void ClickOnCloseSellBar(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(CloseSellBar);

    }

    public void ClickOnHowToSell(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(HowToSellBtn);

    }
    public void ClickOnFairFees(WebDriver driver){


       ClickOnSellBtn(driver);
       waitFor(3);
        click(FairFees);
    }

    public void ClickOnSellFaQ(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(SellerFAQ);


    }

    public void ClickOnSellMyThenIphoneUnderSellSection(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(SellMyIphoneBtn);


    }

    public void ClickOnSellMyThenPhoneUnderSellSection(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(SellMyPhoneBtn);

    }

    public void ClickOnSellMyThenComputerUnderSellSection(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(SellMyComputerBtn);

    }
    public void ClickOnSellMyThenMacBookUnderSellSection(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(SellMyMacBookBtn);

    }


    public void ClickOnSellMyThenWatchOrWearable(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(SellMyWatchOrWearableBtn);

    }

    public void ClickOnSellMyThenTabletOrIpad(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(SellMyTabletOrIpad);

    }

    public void ClickOnSellMyVideoGameConsole(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(SellMyVideoGameConsole);

    }
    public void ClickOnSellMyHomeTech(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(SellMyHomeTech);

    }
    public void ClickOnSellMyCameraOrLens(WebDriver driver){

        ClickOnSellBtn(driver);
        waitFor(3);
        click(SellMyCameraOrLens);

    }

    //create a method to scroll
    public void ScrollToView(WebElement element,WebDriver driver) {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void ScrollTotheBottomOnSellFrame(WebDriver driver){
        ClickOnSellBtn(driver);
        waitFor(2);
        ScrollToView(SellMyCameraOrLens,driver);
        waitFor(2);
    }

    public void HoverOverStartSellingBtn(WebDriver driver){
        ClickOnSellBtn(driver);
        waitFor(3);
        hoverOver(driver,StartSellingBtn);

    }

    public void TypeInSellSearchBar(String text){

        type(SellSearchBar,text);

    }

    public void ClickOnSearchBtn(){

        click(SellSearchBtn);



    }









}
