package SwappaPages;
import base.CommonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HomePage extends CommonAPI {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    private final Logger LOG = LoggerFactory.getLogger(AddToCartPage.class);


    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(1) > ul > li:nth-child(2) > a > i")
    WebElement Help;
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(1) > ul > li:nth-child(3) > a > i")
    WebElement Sell;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(1) > a")
    WebElement Iphones;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(2) > a")
    WebElement Phones;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(3) > a")
    WebElement Macbooks;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(4) > a")
    WebElement Computers;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(5) > a")
    WebElement Watches;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(6) > a")
    WebElement Tablets;
    @FindBy(css = "#secondaryNav > nav > div > ul > li.nav-item.d-sm-none.d-md-none.d-lg-block.dropdown > a")
    WebElement VideoGames;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(8) > a")
    WebElement HomeTech;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(9) > a")
    WebElement Cameras;


    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-5.justify-content-center.carrier_pics > div:nth-child(1) > a > img")
    WebElement ATT;
    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-5.justify-content-center.carrier_pics > div:nth-child(2) > a > img")
    WebElement TMobile;
    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-5.justify-content-center.carrier_pics > div:nth-child(3) > a > img")
    WebElement Verizon;
    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-5.justify-content-center.carrier_pics > div:nth-child(4) > a > img")
    WebElement Unlocked;



    @FindBy(css = "#section_billboard > h2")
    WebElement ShopPhonesByCarrier;

    @FindBy(css = "#section_billboard > div.row.justify-content-center.gy-3.mt-1 > div:nth-child(1) > a")
    WebElement SellWithSwappaBtn;
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(3) > a > i")
    WebElement SearchLogo;

    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-3.row-cols-lg-5.row-cols-xl-5.row-cols-xxl-6.justify-content-center > div:nth-child(2) > div > a.image.bgg-green-100 > img")
    WebElement PhonesImage;
    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-3.row-cols-lg-5.row-cols-xl-5.row-cols-xxl-6.justify-content-center > div:nth-child(1) > div > a.image.bgg-blue-100")
    WebElement IphonesImage;
    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-3.row-cols-lg-5.row-cols-xl-5.row-cols-xxl-6.justify-content-center > div:nth-child(3) > div > a.image.bgg-pink-100 > img")
    WebElement LaptopsImage;
    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-3.row-cols-lg-5.row-cols-xl-5.row-cols-xxl-6.justify-content-center > div:nth-child(4) > div > a.image.bgg-orange-100 > img")
    WebElement ComputersImage;
    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-3.row-cols-lg-5.row-cols-xl-5.row-cols-xxl-6.justify-content-center > div:nth-child(5) > div > a.image.bgg-indigo-100 > img")
    WebElement WatchesImage;
    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-3.row-cols-lg-5.row-cols-xl-5.row-cols-xxl-6.justify-content-center > div:nth-child(6) > div > a.image.bgg-red-100 > img")
    WebElement TabletsImage;
    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-3.row-cols-lg-5.row-cols-xl-5.row-cols-xxl-6.justify-content-center > div:nth-child(7) > div > a.image.bgg-yellow-100 > img")
    WebElement VideoGamesImage;
    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-3.row-cols-lg-5.row-cols-xl-5.row-cols-xxl-6.justify-content-center > div:nth-child(8) > div > a.image.bgg-purple-100 > img")
    WebElement HomeTechImage;
    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-3.row-cols-lg-5.row-cols-xl-5.row-cols-xxl-6.justify-content-center > div:nth-child(9) > div > a.image.bgg-cyan-100 > img")
    WebElement CamerasImage;





    @FindBy(css = "#section_top > div > div.row > div.col-12.col-lg-4 > a")
    WebElement SwappaLocalBtn;

    @FindBy(css = "#section_main > div:nth-child(1) > h2")
    WebElement FeaturedProducts;

    @FindBy(css = "#section_main > div:nth-child(1) > div > div:nth-child(1) > div > div > div.clearfix > a")
    WebElement AppleWatch;

    @FindBy(css = "#section_main > div:nth-child(1) > div > div:nth-child(2) > div > div > div.clearfix > a")
    WebElement GooglePixel;
    @FindBy(css = "#section_main > div:nth-child(1) > div > div:nth-child(3) > div > div > div.clearfix > a")
    WebElement AppleIphoneX;
    @FindBy(css = "#section_main > div:nth-child(1) > div > div:nth-child(4) > div > div > div.clearfix > a")
    WebElement One7Plus;
    @FindBy(css = "#section_main > div:nth-child(1) > div > div:nth-child(5) > div > div > div.clearfix > a")
    WebElement SamsungGalaxyS10;
    @FindBy(css = "#section_main > div:nth-child(1) > div > div:nth-child(6) > div > div > div.clearfix > a")
    WebElement NintendoSwitch;

    //-------------------------------------bottom of the menu Locators---------------------

    @FindBy(css = "#press_row > div > div:nth-child(5) > a > img")
    WebElement CNETLogo;

    @FindBy(css = "#press_row > div > div:nth-child(4) > a > img")
    WebElement LifeHacker;

    @FindBy(xpath = "//*[@id=\"press_row\"]/div/div[3]/a")
    WebElement TomSGuide;

    @FindBy(css = "#press_row > div > div:nth-child(2) > a > img")
    WebElement Fortune;

    @FindBy(css = "#press_row > div > div:nth-child(1) > a > img")
    WebElement WSJ;

    @FindBy(css = "#section_more > h2:nth-child(20)")
    WebElement SwappaReviews;

    @FindBy(css = "#section_more > div:nth-child(2) > h2")
    WebElement RecognizedForValueAndSafetyText;

    @FindBy(css = "body > footer > div > div.row.row-cols-2.row-cols-sm-3.row-cols-lg-6.mb-3.ms-sm-3.ms-md-5.ms-lg-3.ms-xl-5 > div:nth-child(5) > ul > li:nth-child(3) > a")
    WebElement B2BExchangebtn;

    @FindBy(css = "#review-arrow-right > div > div")
    WebElement RightButtonCarroussel;

    @FindBy(css = "#review-arrow-left > div > div > div > svg")
    WebElement LeftButtonCarroussel;

    @FindBy(css = "#footer_logo")
    WebElement BottomLogo;

    @FindBy(css = "body > footer > div > div.row.row-cols-1.row-cols-md-3 > div.col.py-1.social_links.d-flex.justify-content-center.align-items-center > a:nth-child(1) > i")
    WebElement FacebookLogo;


    //----------------------------------------------------------------------------------------------------------------------------------//
    public void BottomLogo(){click(BottomLogo);}




    //reusable method




    public void HoverOverCameras(WebDriver driver){hoverOver(driver,Cameras);}
    public void HoverOverVideoGames(WebDriver driver){hoverOver(driver,VideoGames);}
    public void HoverOvertablets(WebDriver driver){hoverOver(driver,Tablets);}
    public void HoverOverWatches(WebDriver driver){hoverOver(driver,Watches);}
    public void HoverOverComputers(WebDriver driver){hoverOver(driver,Computers);}
    public void HoverOverMacbooks(WebDriver driver){hoverOver(driver,Macbooks);}
    public void HoverOverPhones(WebDriver driver){hoverOver(driver,Phones);}
    public void HoverOverIphones(WebDriver driver){hoverOver(driver,Iphones);}


    public void HoverOverMenu(WebDriver driver) {

        hoverOver(driver, Cameras);
        hoverOver(driver, VideoGames);
        hoverOver(driver, Tablets);
        hoverOver(driver, Watches);
        hoverOver(driver, Computers);
        hoverOver(driver, Macbooks);
        hoverOver(driver, Phones);
        hoverOver(driver, Iphones);


    }







    public void ClickOnSwappaLocal() {

        click(SwappaLocalBtn);

    }





    //call the method to scroll
    public void ScrollToViewShopPhonesByCarrier(WebDriver driver) {

        ScrollToView(ShopPhonesByCarrier, driver);


    }







    public void BottomMenu(WebDriver driver) {

        ScrollToView(RecognizedForValueAndSafetyText, driver);
        click(CNETLogo);
        LOG.info("CNET logo CLicked");
        ScrollToView(CNETLogo,driver);
        click(LifeHacker);
        LOG.info("Life Hacker logo CLicked");
        clickWithJS(TomSGuide,driver);
        LOG.info("TomS Guide logo CLicked With Java Script function");
        click(Fortune);
        LOG.info("Fortune logo CLicked");
        click(WSJ);
        LOG.info("WSJ logo CLicked");



    }



    public void AccessTrustPilotSection(WebDriver driver) {
        int count = 0;

        ScrollToView(B2BExchangebtn, driver);
        LOG.info("Scroll to view trust Pilot frame");
        driver.switchTo().frame(0);
        LOG.info("Switched to new frame , index 0");
        waitForAnElementTobeClickable(RightButtonCarroussel,driver);
        do {
            count++;
            click(RightButtonCarroussel);
            LOG.info("Right button of the slider click performed "+count+" time(es)");

        } while (count < 2);

        {
            click(LeftButtonCarroussel);
            LOG.info("Left button of the slider click performed");


        }


    }

    public boolean TrustPilotElementIsVisible(){

        return isPresent(RightButtonCarroussel);
    }


    public void ClickOnSwappaLogoAtTheBottomOfThePage(WebDriver driver) {

        ScrollToView(BottomLogo, driver);
        click(BottomLogo);
        waitForAnElementTobeVisible(BottomLogo,driver);


    }
    public boolean  LogoAtTheBottomOfThePageIsPresent(){
        return isPresent(BottomLogo);
    }

    public void ClickOnFacebookLogo(WebDriver driver) {
        ScrollToView(BottomLogo, driver);
        waitForAnElementTobeVisible(BottomLogo,driver);
        click(FacebookLogo);
        LOG.info("Facebook Logo Click Performed");

    }

    public boolean  FacebookLogoIsPresent(){
       return isPresent(FacebookLogo);
    }




    public void ClickOnB2BExchange(WebDriver driver) {

        ScrollToView(BottomLogo,driver);
        waitForAnElementTobeVisible(BottomLogo,driver);
        LOG.info("Scroll to view B2B Exchange Btn");

        waitForAnElementTobeClickable(B2BExchangebtn,driver);
        click(B2BExchangebtn);

        LOG.info("B2B Exchange Btn clicked");
    }







}










