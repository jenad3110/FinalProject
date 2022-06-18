package SwaggaPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CamerasPage extends CommonAPI {

        public CamerasPage(WebDriver driver) {PageFactory.initElements(driver, this);}


        @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(9) > a")
        WebElement Cameras;
        @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(9) > ul > li:nth-child(7) > a")
        WebElement AllCameras;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(18) > div > a")
        WebElement AllCamerasAndBrands;
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








        public void ScrollToView(WebElement element, WebDriver driver) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);

        }


        public void ClickOnCamerasButton(){click(Cameras);}
        public void HoverOverCamerasButton(WebDriver driver){hoverOver(driver,Cameras);}
        public void ClickOnAllCamerasButton(){click(AllCameras);}
        public void ClickOnSellBtnInCamerasPage(){click(SellBtnInCamerasPage);}
        public void HoverOverActionCameras(WebDriver driver){hoverOver(driver,ShopActionsCamerasBtn);}
        public void HoverOverShopDSLR(WebDriver driver){hoverOver(driver,ShopDSLR);}
        public void HoverOverShopMirrorLessCameras(WebDriver driver){hoverOver(driver,ShopMirrorLessCamerasBtn);}
        public void HoverOverShopMoreLenses(WebDriver driver){hoverOver(driver,ShopMoreLensesBtn);}
        public void HoverOverAllCamerasAndBrands(WebDriver driver){ hoverOver(driver,AllCamerasAndBrands);}
        public void ScrollToViewActionCameras(WebDriver driver){ ScrollToView(ShopActionsCamerasBtn,driver);}
        public void ScrollToViewShopDSLR(WebDriver driver){ ScrollToView(ShopDSLR,driver);}
        public void ScrollToViewShopMirrorLessCameras(WebDriver driver){ ScrollToView(ShopMirrorLessCamerasBtn,driver);}
        public void ScrollToViewShopMoreLenses(WebDriver driver){ ScrollToView(ShopMoreLensesBtn,driver);}
        public void ScrollToViewAllCamerasAndBrands(WebDriver driver){ ScrollToView(AllCamerasAndBrands,driver);}
        @FindBy(css = "#main_container > section.section_main > div:nth-child(16) > div > div.col-xs-3.col-md-2 > a")
        WebElement CameraBrandbtn;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(13) > div > div.col-xs-3.col-md-2 > a")
        WebElement FixedLensBtn;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(10) > div > div.col-xs-3.col-md-2 > a")
        WebElement LensesBtn;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(7) > div > div.col-xs-3.col-md-2 > a")
        WebElement Mirrorless;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(1) > div > div.col-xs-3.col-md-2 > a")
        WebElement ActionCameras;
        @FindBy(css = "#main_container > section.section_main > div:nth-child(4) > div > div.col-xs-3.col-md-2 > a")
        WebElement DSLCamerasAndLenses;
        public void ClickOnCamerasBrandButton(){click(CameraBrandbtn);}
        public void ClickOnFixedLensBtn(){click(FixedLensBtn);}
        public void ClickOnLensesBtn(){click(LensesBtn);}
        public void ClickOnMirrorlessBtn(){click(Mirrorless);}
        public void ClickOnActionCameras(){click(ActionCameras);}
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
        public void HoverOverSony(WebDriver driver){hoverOver(driver,SonyLogo);}
        public void HoverOverPanasonic(WebDriver driver){hoverOver(driver,PanasonicLogo);}
        public void HoverOverNikon(WebDriver driver){hoverOver(driver,NikonLogo);}
        public void HoverOverGoPro(WebDriver driver){hoverOver(driver,GoProLogo);}
        public void HoverOverFujiFilm(WebDriver driver){ hoverOver(driver,FujiFilmLogo);}
        public void HoverOverCanon(WebDriver driver){ hoverOver(driver,CanonLogo);}








        public void HoverOverCamerasThenCLickOnAllCameras(WebDriver driver){

            HoverOverCamerasButton(driver);
            ClickOnAllCamerasButton();
        }

        public void GoBackToCamerasPage(WebDriver driver){

                driver.navigate().back();
                waitFor(3);
        }




}
