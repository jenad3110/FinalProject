package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CamerasPage extends CommonAPI {

        public CamerasPage(WebDriver driver) {
                PageFactory.initElements(driver, this);
        }

        private final Logger LOG = LoggerFactory.getLogger(CamerasPage.class);

        @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(9) > a")
        WebElement Cameras;
        @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(9) > ul > li:nth-child(7) > a")
        WebElement AllCameras;
        @FindBy(css = "#filters > h3")
        WebElement SortByText;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(16) > div > div.col-xs-3.col-md-2 > a")
        WebElement CameraBrandbtn;
        @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(9) > ul > li:nth-child(1) > a")
        WebElement ActionCamerasSubMenu;
        @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(9) > ul > li:nth-child(3) > a")
        WebElement DSLRCameraSubMenu;
        @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(9) > ul > li:nth-child(2) > a")
        WebElement CanonSubMenu;
        @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(9) > ul > li:nth-child(6) > a")
        WebElement NikonSubMenu;
        @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(9) > ul > li:nth-child(4) > a")
        WebElement LensesInSubMenu;

        @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(9) > ul > li:nth-child(5) > a")
        WebElement MirrorLessCameraInSubMenu;


        public void ClickOnAllCamerasButton() {
                click(AllCameras);
                LOG.info("clicked All Cameras Success");
        }

        public void HoverOverCamerasButton(WebDriver driver) {
                hoverOver(driver, Cameras);
                LOG.info("Hover Over All Cameras Success");
        }

        public void ClickOnActionCamerasUnderCamerasMenu() {
                click(ActionCamerasSubMenu);
                LOG.info("clicked Action Cameras Success");
        }

        public void HoverOverActionCamerasUnderCamerasMenu(WebDriver driver) {
                hoverOver(driver, ActionCamerasSubMenu);
                LOG.info("Hover over Action Cameras Success");
        }

        public void ClickOnCanonUnderCamerasMenu() {
                click(CanonSubMenu);
                LOG.info("clicked Canon Success");
        }

        public void HoverOverCanonUnderCamerasMenu(WebDriver driver) {
                hoverOver(driver, CanonSubMenu);
                LOG.info("Hover Over Canon Success");
        }

        public void ClickOnCamerasButton() {
                click(Cameras);
                LOG.info("clicked Cameras Success");
        }

        public void HoverOverDSLRCameraUnderCamerasMenu(WebDriver driver) {
                hoverOver(driver, DSLRCameraSubMenu);
                LOG.info("Hover over DSLR Cameras Success");
        }

        public void ClickOnDSLRUnderCamerasMenu() {
                click(DSLRCameraSubMenu);
                LOG.info("clicked DSLR Cameras Success");
        }

        public void HoverOverLensesUnderCamerasMenu(WebDriver driver) {
                hoverOver(driver, LensesInSubMenu);

                LOG.info("Hover over Lenses Success");
        }

        public void ClickOnlensesUnderCamerasMenu() {
                click(LensesInSubMenu);
                LOG.info("clicked Lenses Success");
        }

        public void HoverOverMirrorLessCamerasUnderCamerasMenu(WebDriver driver) {
                hoverOver(driver, MirrorLessCameraInSubMenu);
                LOG.info("Hover over MirrorLess camera Success");
        }

        public void ClickOnMirrorLessCamerasUnderCamerasMenu() {
                click(MirrorLessCameraInSubMenu);
                LOG.info("clicked MirrorLess Success");
        }

        public void HoverOverNikonUnderCamerasMenu(WebDriver driver) {
                hoverOver(driver, NikonSubMenu);
                LOG.info("Hover over Nikon Success");
        }

        public void ClickOnNikonUnderCamerasMenu() {
                click(NikonSubMenu);
                LOG.info("clicked Nikon Success");
        }

        public void HoverOverAllCamerasButton(WebDriver driver) {
                hoverOver(driver, AllCameras);
                LOG.info("clicked All Cameras Success");
        }


        //--------------------------------------Under All Cameras------------------------------------------------------//

        @FindBy(css = "#main_container > section.section_main > div:nth-child(1) > div > div.col-xs-3.col-md-2 > a")
        WebElement ActionCameraBtn;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(13) > div > div.col-xs-3.col-md-2 > a")
        WebElement FixedLensBtn;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(10) > div > div.col-xs-3.col-md-2 > a")
        WebElement LensesBtn;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(7) > div > div.col-xs-3.col-md-2 > a")
        WebElement Mirrorless;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(4) > div > div.col-xs-3.col-md-2 > a")
        WebElement DSLCamerasAndLenses;
        @FindBy(css = "#section_top > div > div.col-xs-3 > a")
        WebElement SellBtnInCamerasPage;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(3) > div > a")
        WebElement ShopActionsCamerasBtn;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(6) > div > a")
        WebElement ShopDSLR;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(9) > div > a")
        WebElement ShopMirrorLessCamerasBtn;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(12) > div > a")
        WebElement ShopMoreLensesBtn;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(18) > div > a")
        WebElement AllCamerasAndBrands;
        @FindBy(css = "#section_main > div.well > h2")
        WebElement TextOnSellCamerasPage;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(4) > div > div.col-xs-9.col-md-10 > h2")
        WebElement DSlRBtnSV;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(7) > div > div.col-xs-9.col-md-10 > h2")
        WebElement MirrorLessSV;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(10) > div > div.col-xs-9.col-md-10 > h2")
        WebElement LensesSV;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(13) > div > div.col-xs-9.col-md-10 > h2")
        WebElement FixedLensCamerasSV;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(16) > div > div.col-xs-9.col-md-10 > h2")
        WebElement CamerasbrandsSV;

        @FindBy(css = "#brand_buttons > div:nth-child(6) > a > img")
        WebElement SonyLogo;
        @FindBy(css = "#brand_buttons > div:nth-child(5) > a > img")
        WebElement PanasonicLogo;
        @FindBy(css = "#brand_buttons > div:nth-child(4) > a > img")
        WebElement NikonLogo;
        @FindBy(css = "#brand_buttons > div:nth-child(3) > a > img")
        WebElement GoProLogo;
        @FindBy(css = "#brand_buttons > div:nth-child(2) > a > img")
        WebElement FujiFilmLogo;
        @FindBy(css = "#brand_buttons > div:nth-child(1) > a > img")
        WebElement CanonLogo;



        public void ClickOnSellBtnInCamerasPage() {
                click(SellBtnInCamerasPage);
                LOG.info("clicked Sell Button Success");
        }

        public void HoverOverActionCameras(WebDriver driver) {
                hoverOver(driver, ActionCameraBtn);
                LOG.info("Hover Over Actions Cameras Success");
        }

        public void ClickActionCameras() {
                click(ActionCameraBtn);
                LOG.info("clicked Action Cameras Success");
        }

        public void HoverOverShopDSLR(WebDriver driver) {


                click(ShopDSLR);
                LOG.info("Hover Over Shop DSLR Cameras Success");
        }

        public String AssertShopDSLRText() {
                return getElementText(ShopDSLR);
        }

        public void HoverOverShopMirrorLessCameras(WebDriver driver) {
                hoverOver(driver, ShopMirrorLessCamerasBtn);
                LOG.info("Hover Over Shop MirrorLess Cameras Success");
        }

        public String AssertShopMirrorLessCamerasText() {
                return getElementText(ShopMirrorLessCamerasBtn);
        }

        public void HoverOverShopMoreLenses(WebDriver driver) {
                hoverOver(driver, ShopMoreLensesBtn);
                LOG.info("Hover Over Shop More Lenses Success");
        }

        public String AssertShopLensesText() {
                return getElementText(ShopMoreLensesBtn);
        }

        public void HoverOverAllCamerasAndBrands(WebDriver driver) {
                hoverOver(driver, AllCamerasAndBrands);
                LOG.info("Hover Over All Cameras Success");
        }

        public String AssertShopAllCamerasAndBrandsText() {
                return getElementText(AllCamerasAndBrands);
        }

        public void ScrollToViewShopDSLR(WebDriver driver) {
                ScrollToView(DSlRBtnSV, driver);

                LOG.info("Scroll to view DSLR cameras Success");
        }

        public void ScrollToViewShopMirrorLessCameras(WebDriver driver) {
                ScrollToView(MirrorLessSV, driver);

                LOG.info("Scroll to View MirrorLess cameras Success");
        }

        public void ScrollToViewShopMoreLenses(WebDriver driver) {
                ScrollToView(LensesSV, driver);
                LOG.info("Scroll To view Lenses Success");
        }

        public void ScrollToViewAllCamerasAndBrands(WebDriver driver) {
                ScrollToView(CamerasbrandsSV, driver);
                LOG.info("Scroll To view All Cameras and Brands Success");
        }

        //----------------------------------------------------------------------------------------------------------//


        public void ClickOnCamerasBrandButton(){click(CameraBrandbtn);}

        public void ClickOnFixedLensBtn() {click(FixedLensBtn);}

        public void ClickOnLensesBtn() {click(LensesBtn);}

        public void ClickOnMirrorlessBtn() {click(Mirrorless);}


        public void HoverOverSony(WebDriver driver) {
                hoverOver(driver, SonyLogo);
        }
        public boolean SonyLogoIsInteractable(){ return isInteractable(SonyLogo);}

        public void HoverOverPanasonic(WebDriver driver) {
                hoverOver(driver, PanasonicLogo);
        }
        public boolean PanasonicLogoIsInteractable(){ return isInteractable(PanasonicLogo);}

        public void HoverOverNikon(WebDriver driver) {
                hoverOver(driver, NikonLogo);
        }
        public boolean NikonLogoIsInteractable(){ return isInteractable(NikonLogo);}

        public void HoverOverGoPro(WebDriver driver) {
                hoverOver(driver, GoProLogo);
        }
        public boolean GoProLogoIsInteractable(){ return isInteractable(GoProLogo);}

        public void HoverOverFujiFilm(WebDriver driver) {
                hoverOver(driver, FujiFilmLogo);
        }
        public boolean FujiFilmLogoIsInteractable(){ return isInteractable(FujiFilmLogo);}

        public void HoverOverCanon(WebDriver driver) {
                hoverOver(driver, CanonLogo);
        }
        public boolean CanonLogoIsInteractable(){ return isInteractable(CanonLogo);}


        public void CLickOnAllCamerasAndbrands() {
                click(AllCamerasAndBrands);
                LOG.info("Radio Button ");
        }


        public void HoverOverActionCamerasBtnInAllCamerasSection(WebDriver driver) {
                HoverOverCamerasThenCLickOnAllCameras(driver);
                HoverOverActionCameras(driver);
                click(ActionCameraBtn);
                LOG.info("Clicked Action Camera button Success");


        }

        public void HoverOverCamerasThenCLickOnAllCameras(WebDriver driver) {
                HoverOverCamerasButton(driver);
                ClickOnAllCamerasButton();
                LOG.info("Access All Cameras Success");
        }






}










