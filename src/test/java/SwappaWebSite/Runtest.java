package SwappaWebSite;

import SwaggaPages.CamerasPage;
import SwaggaPages.HomePage;
import SwaggaPages.LoginPage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class Runtest extends CommonAPI {
    @Test
    public  void ClickOnItemsOnFeaturedProducts(){

        HomePage homePage = new HomePage(getDriver());
        homePage.ScrollToViewItemsInFeaturedProducts(getDriver());
        homePage.ClickOnEachItemOnFeaturedProducts(getDriver());


    }







   // @Test
    public void ClickOnCamerasThenAllCamerasThenSellBtn(){

        CamerasPage camerasPage = new CamerasPage(getDriver());

        camerasPage.ClickOnCamerasButton();
        waitFor(2);
       // camerasPage.ClickOnAllCamerasButton();
       // camerasPage.ClickOnSellBtnInCamerasPage();


    }





}
