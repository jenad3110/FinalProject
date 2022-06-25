package SwappaWebSite;

import SwappaPages.CamerasPage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CamerasTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CamerasTest.class);


    @Test
    public void HoverOverCameraAndClickOnAllCameras() {

        LOG.info("Test HoverOverCameraAndClickOnAllCameras in process");
        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.HoverOverCamerasButton(getDriver());
        camerasPage.ClickOnAllCamerasButton();
        String ExpectedPagetitle ="Used Cameras and Lenses - Swappa";
        Assert.assertEquals(getPageTitle(),ExpectedPagetitle);
        LOG.info("Test Passed");

    }

   @Test
    public void HoverOverAndClickOnActionCamerasUnderCamerasMenu () {

       LOG.info("Test HoverOverAndClickOnActionCamerasUnderCamerasMenu in process");
        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.HoverOverCamerasButton(getDriver());
        camerasPage.HoverOverActionCamerasUnderCamerasMenu(getDriver());
        camerasPage.ClickOnActionCamerasUnderCamerasMenu();
        String ExpectedPagetitle ="Used Action Camera deals - Swappa";
        Assert.assertEquals(getPageTitle(),ExpectedPagetitle);
        LOG.info("Test Passed");
    }
    @Test
    public void HoverOverAndClickOnCanonUnderCamerasMenu () {

        LOG.info("Test HoverOverAndClickOnCanonUnderCamerasMenu in process");
        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.HoverOverCamerasButton(getDriver());
        camerasPage.HoverOverCanonUnderCamerasMenu(getDriver());
        camerasPage.ClickOnCanonUnderCamerasMenu();
        String ExpectedPagetitle ="Canon, used cameras and lenses - Swappa";
        Assert.assertEquals(getPageTitle(),ExpectedPagetitle);
        LOG.info("Test Passed");
    }

   @Test
    public void HoverOverAndClickOnDSLRCamerasUnderCamerasMenu () {

       LOG.info("Test HoverOverAndClickOnDSLRCamerasUnderCamerasMenu in process");
        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.HoverOverCamerasButton(getDriver());
        camerasPage.HoverOverDSLRCameraUnderCamerasMenu(getDriver());
        camerasPage.ClickOnDSLRUnderCamerasMenu();
        String ExpectedPagetitle ="DSLR cameras and lenses - Swappa";
        Assert.assertEquals(getPageTitle(),ExpectedPagetitle);
        LOG.info("Test Passed");
    }
   @Test
    public void HoverOverAndClickOnLensesUnderCamerasMenu () {

       LOG.info("Test HoverOverAndClickOnLensesUnderCamerasMenu in process");
        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.HoverOverCamerasButton(getDriver());
        camerasPage.HoverOverLensesUnderCamerasMenu(getDriver());
        camerasPage.ClickOnlensesUnderCamerasMenu();
       String ExpectedPagetitle ="Used Lens deals - Swappa";
       Assert.assertEquals(getPageTitle(),ExpectedPagetitle);
       LOG.info("Test Passed");
    }

    @Test
    public void HoverOverAndClickOnMirrorLessCamerasUnderCamerasMenu () {

        LOG.info("Test HoverOverAndClickOnActionCamerasUnderCamerasMenu in process");
        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.HoverOverCamerasButton(getDriver());
        camerasPage.HoverOverMirrorLessCamerasUnderCamerasMenu(getDriver());
        camerasPage.ClickOnMirrorLessCamerasUnderCamerasMenu();
        String ExpectedPagetitle ="Mirrorless cameras and lenses - Swappa";
        Assert.assertEquals(getPageTitle(),ExpectedPagetitle);
        LOG.info("Test Passed");
    }

    @Test
    public void HoverOverAndClickOnNikonUnderCamerasMenu () {

        LOG.info("Test HoverOverAndClickOnActionCamerasUnderCamerasMenu in process");
        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.HoverOverCamerasButton(getDriver());
        camerasPage.HoverOverNikonUnderCamerasMenu(getDriver());
        camerasPage.ClickOnNikonUnderCamerasMenu();
        String ExpectedPagetitle ="Nikon, used cameras and lenses - Swappa";
        Assert.assertEquals(getPageTitle(),ExpectedPagetitle);
        LOG.info("Test Passed");
    }

    @Test
    public void HoverOverAndClickOnAllCamerasUnderCamerasMenu () {

        LOG.info("Test HoverOverAndClickOnActionCamerasUnderCamerasMenu in process");
        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.HoverOverCamerasButton(getDriver());
        camerasPage.HoverOverAllCamerasButton(getDriver());
        camerasPage.ClickOnAllCamerasButton();
        String ExpectedPagetitle ="Used Cameras and Lenses - Swappa";
        Assert.assertEquals(getPageTitle(),ExpectedPagetitle);
        LOG.info("Test Passed");
    }

    @Test
    public void ClickOnCamerasThenAllCamerasThenSellBtn() {

        LOG.info("Test ClickOnCamerasThenAllCamerasThenSellBtn in process");

        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.HoverOverCamerasThenCLickOnAllCameras(getDriver());
        camerasPage.ClickOnSellBtnInCamerasPage();
        String ExpectedPagetitle ="Sell Cameras - Swappa";
        Assert.assertEquals(getPageTitle(),ExpectedPagetitle);
        LOG.info("Test Passed");
    }

   @Test
    public void HoverOverShopDSLR() {

       LOG.info("Test HoverOverShopDSLR in process");

        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.ClickOnCamerasButton();
        camerasPage.ScrollToViewShopDSLR(getDriver());
        camerasPage.HoverOverShopDSLR(getDriver());
        String ExpectedText= "More DSLR Lenses";
        Assert.assertEquals(camerasPage.AssertShopDSLRText(),ExpectedText);
         LOG.info("Test Passed");


    }

    @Test
    public void HoverOverShopMirrorLessCameras() {

        LOG.info("Test HoverOverShopMirrorLess Cameras in process");
        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.ClickOnCamerasButton();
        camerasPage.ScrollToViewShopMirrorLessCameras(getDriver());
        camerasPage.HoverOverShopMirrorLessCameras(getDriver());
        String ExpectedText= "Shop Mirrorless cameras";
        Assert.assertEquals(camerasPage.AssertShopMirrorLessCamerasText(),ExpectedText);
        LOG.info("Test Passed");
    }

    @Test
    public void HoverOverShopMoreLenses() {

        LOG.info("Test HoverOverShopMoreLenses in process");

        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.ClickOnCamerasButton();
        camerasPage.ScrollToViewShopMoreLenses(getDriver());
        camerasPage.HoverOverShopMoreLenses(getDriver());
        String ExpectedText= "Shop more Lenses";
        Assert.assertEquals(camerasPage.AssertShopLensesText(),ExpectedText);
        LOG.info("Test Passed");

    }

    @Test
    public void HoverOverAllCamerasAndBrands() {

        LOG.info("Test HoverOverAllCamerasAndBrands in process");
        CamerasPage camerasPage = new CamerasPage(getDriver());
        camerasPage.ClickOnCamerasButton();
        camerasPage.ScrollToViewAllCamerasAndBrands(getDriver());
        camerasPage.HoverOverAllCamerasAndBrands(getDriver());
        String ExpectedText= "All Cameras and brands";
        Assert.assertEquals(camerasPage.AssertShopAllCamerasAndBrandsText(),ExpectedText);
        LOG.info("Test Passed");

    }
@Test
public void HoverOverMultipleLogosInCamerasSection(){

    CamerasPage camerasPage = new CamerasPage(getDriver());

    camerasPage.ClickOnCamerasButton();


    camerasPage.HoverOverSony(getDriver());
    Assert.assertTrue(camerasPage.SonyLogoIsInteractable());

    camerasPage.HoverOverPanasonic(getDriver());
    Assert.assertTrue(camerasPage.PanasonicLogoIsInteractable());

    camerasPage.HoverOverNikon(getDriver());
    Assert.assertTrue(camerasPage.NikonLogoIsInteractable());

    camerasPage.HoverOverGoPro(getDriver());
    Assert.assertTrue(camerasPage.GoProLogoIsInteractable());

    camerasPage.HoverOverFujiFilm(getDriver());
    Assert.assertTrue(camerasPage.FujiFilmLogoIsInteractable());

    camerasPage.HoverOverCanon(getDriver());
    Assert.assertTrue(camerasPage.CanonLogoIsInteractable());


}

//   @Test
//    public void ClickOnMultipleButtonsInCamerasPage(){
//
//        CamerasPage camerasPage = new CamerasPage(getDriver());
//
//        //camerasPage.ClickOnCamerasButton();
//       camerasPage.HoverOverCamerasButton(getDriver());
//        camerasPage.ClickOnActionCamerasUnderCamerasMenu();
//        GoBackToPreviousPage();
//        camerasPage.ScrollToViewShopDSLR(getDriver());
//        camerasPage.ClickOnMirrorlessBtn();
//        GoBackToPreviousPage();
//        camerasPage.ScrollToViewShopMirrorLessCameras(getDriver());
//        camerasPage.ClickOnLensesBtn();
//        GoBackToPreviousPage();
//        camerasPage.ScrollToViewShopMoreLenses(getDriver());
//        camerasPage.ClickOnFixedLensBtn();
//        GoBackToPreviousPage();
//        camerasPage.ScrollToViewShopMoreLenses(getDriver());
//        camerasPage.ClickOnCamerasBrandButton();
//        GoBackToPreviousPage();
//
//
//
//
//
//
//    }


}
