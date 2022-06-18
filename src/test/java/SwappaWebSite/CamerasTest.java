package SwappaWebSite;

import SwaggaPages.CamerasPage;
import SwaggaPages.HomePage;
import base.CommonAPI;
import javafx.scene.Camera;
import org.testng.annotations.Test;

public class CamerasTest extends CommonAPI {



    @Test
    public void HoverOverCameraAndClickOnAllCameras(){

        CamerasPage camerasPage = new CamerasPage(getDriver());
        waitFor(2);
        camerasPage.HoverOverCamerasButton(getDriver());
        waitFor(2);
        camerasPage.ClickOnAllCamerasButton();



    }



    @Test
    public void ClickOnCamerasThenAllCamerasThenSellBtn(){

        CamerasPage camerasPage = new CamerasPage(getDriver());

        camerasPage.ClickOnCamerasButton();
        waitFor(2);
        camerasPage.ClickOnAllCamerasButton();
        camerasPage.ClickOnSellBtnInCamerasPage();


    }


    @Test
    public void HoverOverMultipleItemsInCamerasPage()  {

        CamerasPage camerasPage = new CamerasPage(getDriver());

        camerasPage.HoverOverCamerasThenCLickOnAllCameras(getDriver());
        camerasPage.ScrollToViewActionCameras(getDriver());

        waitFor(3);
        camerasPage.HoverOverActionCameras(getDriver());
        camerasPage.ScrollToViewShopDSLR(getDriver());

        waitFor(3);
        camerasPage.HoverOverShopDSLR(getDriver());
        camerasPage.ScrollToViewShopMirrorLessCameras(getDriver());

        camerasPage.HoverOverShopMirrorLessCameras(getDriver());
        waitFor(3);
        camerasPage.ScrollToViewShopMoreLenses(getDriver());
        camerasPage.HoverOverShopMoreLenses(getDriver());

        waitFor(3);
        camerasPage.ScrollToViewAllCamerasAndBrands(getDriver());
        waitFor(3);
        camerasPage.HoverOverAllCamerasAndBrands(getDriver());
        waitFor(3);


    }



    @Test
    public void ClickOnMultipleButtonsInCamerasPage(){

        CamerasPage camerasPage = new CamerasPage(getDriver());

        camerasPage.ClickOnCamerasButton();
        waitFor(2);
        camerasPage.ClickOnActionCameras();
        camerasPage.GoBackToCamerasPage(getDriver());
        camerasPage.ScrollToViewShopDSLR(getDriver());
        waitFor(3);
        camerasPage.ClickOnMirrorlessBtn();
        camerasPage.GoBackToCamerasPage(getDriver());
        camerasPage.ScrollToViewShopMirrorLessCameras(getDriver());
        waitFor(3);
        camerasPage.ClickOnLensesBtn();
        camerasPage.GoBackToCamerasPage(getDriver());
        camerasPage.ScrollToViewShopMoreLenses(getDriver());
        waitFor(3);
        camerasPage.ClickOnFixedLensBtn();
        camerasPage.GoBackToCamerasPage(getDriver());
        camerasPage.ScrollToViewShopMoreLenses(getDriver());
        waitFor(3);
        camerasPage.ClickOnCamerasBrandButton();
        camerasPage.GoBackToCamerasPage(getDriver());
        waitFor(3);






    }


    @Test
    public void HoverOverMultipleLogosInCamerasSection(){

        CamerasPage camerasPage = new CamerasPage(getDriver());

        camerasPage.ClickOnCamerasButton();

        camerasPage.HoverOverSony(getDriver());
        waitFor(2);
        camerasPage.HoverOverPanasonic(getDriver());
        waitFor(2);
        camerasPage.HoverOverNikon(getDriver());
        waitFor(2);
        camerasPage.HoverOverGoPro(getDriver());
        waitFor(2);
        camerasPage.HoverOverFujiFilm(getDriver());
        waitFor(2);
        camerasPage.HoverOverCanon(getDriver());
        waitFor(2);






    }


}
