package SwaggaPages;
import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends CommonAPI {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(2) > a > i")
    WebElement ShoppingCart;
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(1) > ul > li:nth-child(1) > a > i")
    WebElement Menu;
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


    @FindBy(css = "#section_billboard > div.row.row-cols-2.row-cols-md-5.justify-content-center.carrier_pics > div:nth-child(1) > a > img")
    WebElement Scrolldown;
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

    //-------------------------------------bottom menu Locators---------------------

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


    //------------------------------------------------------//




    //reusable method



    public void HoverOverTopLeftMenu(WebDriver driver) {

        hoverOver(driver, Sell);
        hoverOver(driver, Help);
        hoverOver(driver, Menu);
    }

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




    public void ClickOnImage(WebDriver driver) {

        click(IphonesImage);
        driver.navigate().back();
        waitFor(5);

        click(PhonesImage);
        driver.navigate().back();
        waitFor(5);

        click(LaptopsImage);
        driver.navigate().back();
        waitFor(2);
        click(ComputersImage);
        driver.navigate().back();
        waitFor(2);
        click(WatchesImage);
        driver.navigate().back();
        waitFor(2);
        click(TabletsImage);
        driver.navigate().back();
        waitFor(2);
        click(VideoGamesImage);
        driver.navigate().back();
        waitFor(2);
        click(HomeTechImage);
        driver.navigate().back();
        waitFor(2);
        click(CamerasImage);
        driver.navigate().back();

    }


    public void ClickOnSwappaLocal() {

        click(SwappaLocalBtn);

    }

    public void ScrollDownToShopBy(WebDriver driver) {
        WebElement element = ShopPhonesByCarrier;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //create a method to scroll
    public void ScrollToView(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    //call the method to scroll
    public void ScrollToViewShopPhonesByCarrier(WebDriver driver) {

        ScrollToView(ShopPhonesByCarrier, driver);
        waitFor(2);


    }

    public void ScrollToViewItemsInFeaturedProducts(WebDriver driver) {

        ScrollToView(FeaturedProducts, driver);
        waitFor(2);


    }


    public void HoverOverElementInShopPhonesByCarriers(WebDriver driver) {

        hoverOver(driver, ATT);
        hoverOver(driver, TMobile);
        hoverOver(driver, Verizon);
        hoverOver(driver, Unlocked);

    }


    public void HoverOverItemsOnFeaturedProducts(WebDriver driver) {

        hoverOver(driver, AppleWatch);
        hoverOver(driver, GooglePixel);
        hoverOver(driver, AppleIphoneX);
        hoverOver(driver, One7Plus);
        hoverOver(driver, SamsungGalaxyS10);
        hoverOver(driver, NintendoSwitch);


    }

    public void ClickOnEachItemOnFeaturedProducts(WebDriver driver) {

        click(AppleWatch);
        driver.navigate().back();
        waitFor(2);

        click(GooglePixel);
        driver.navigate().back();
        waitFor(2);

        click(AppleIphoneX);
        driver.navigate().back();
        waitFor(2);

        click(One7Plus);
        driver.navigate().back();
        waitFor(2);

        click(SamsungGalaxyS10);
        driver.navigate().back();
        waitFor(2);

        click(NintendoSwitch);
        driver.navigate().back();

    }



    public void clickWithJS2(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void BottomMenu(WebDriver driver) {
        ScrollToView(RecognizedForValueAndSafetyText, driver);
        waitFor(3);
       click(CNETLogo);
        ScrollToView(CNETLogo, driver);
        waitFor(3);
        click(LifeHacker);
        click(CNETLogo);
        clickWithJS2(driver, TomSGuide);
        click(Fortune);
        click(WSJ);
        waitFor(3);


    }

    public void BottomMenu2(WebDriver driver) {
        ScrollToView(B2BExchangebtn, driver);
        waitFor(3);
        click(B2BExchangebtn);


    }

    public void TrustPilotSEction(WebDriver driver) {
        int count = 0;

        ScrollToView(B2BExchangebtn, driver);
        waitFor(3);
        driver.switchTo().frame(0);
        waitFor(2);
        do {
            count++;
            click(RightButtonCarroussel);
            waitFor(1);
        } while (count < 4);
        System.out.print("Switched to new Frame and CLick ont the Right button 3 times");

        do {
            count++;
            click(LeftButtonCarroussel);

            waitFor(1);

        } while (count < 4);


    }


    public void ClickOnSwappaLogoAtTheBottomOfThePage(WebDriver driver) {

        ScrollToView(BottomLogo, driver);
        waitFor(2);
        click(BottomLogo);


    }

    public void ClickOnFacebookLogo(WebDriver driver) {
        ScrollToView(BottomLogo, driver);
        waitFor(2);
        click(FacebookLogo);

    }

    public void ClickOnB2BExchange(WebDriver driver) {
        ScrollToView(BottomLogo, driver);
        waitFor(2);
        click(B2BExchangebtn);

    }







}




//        waitFor(2);



//        if(!LeftButtonCarroussel.isEnabled())
//            System.out.print("Click on Left and Right button of the Carroussel is made successfully!");
























//    public void ExpliciteWait(){
//
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        //wait.until(ExpectedConditions.visibilityOfElementLocated());

















        /*
        click(ATT);
        waitFor(2);
                hoverOver(driver,TMobile);
                waitFor(2);
                hoverOver(driver,Verizon);
                waitFor(2);
                hoverOver(driver,Unlocked);
                waitFor(2);
        */










