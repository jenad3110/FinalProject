package SwappaWebSite;

import SwappaPages.*;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runtest extends CommonAPI {

    @Test
    public void HoverOverAndClickOnLensesUnderCamerasMenu () {

        RunPage runPage = new RunPage(getDriver());
        runPage.ClickONBlueButton();
        //Assert.assertTrue(runPage.ButtonIsClickable());

    }






















//
//    @Test
//    public void HoverOverPhones() {
//
//        PhonesPage phonesPage = new PhonesPage(getDriver());
//        phonesPage.HoverOverPhones(getDriver());
//
//    }




    //@Test
    public void GoToBottomOfThePage() {


        HomePage homePage = new HomePage(getDriver());
        WatchesPage watches = new WatchesPage(getDriver());
        homePage.HoverOverWatches(getDriver());
        watches.ClickOnAllWearbles();
        homePage.ClickOnSwappaLogoAtTheBottomOfThePage(getDriver());

        waitFor(5);

    }



}


//
//    @Test
//    public  void ScrolldownAndHoverOverItemsOnFeaturedProductsttttt() {
//
//        HomePage homePage = new HomePage(getDriver());
//
//        homePage.ScrollToViewItemsInFeaturedProducts(getDriver());
//    }
//
//
//
//
//
//
//
//
//
//    @Test
//    public  void ScrolldownAndClickOnTMobileLogo(){
//
//        HomePage homePage = new HomePage(getDriver());
//
//        homePage.ScrollToViewShopPhonesByCarrier(getDriver());
//
//        waitFor(5);
//
//    }
//
//    @Test
//    public  void ScrolldownAndHoverOverCarriers(){
//
//        HomePage homePage = new HomePage(getDriver());
//
//        homePage.ScrollToViewShopPhonesByCarrier(getDriver());
//        homePage.HoverOverElementInShopPhonesByCarriers(getDriver());
//
//        waitFor(5);
//
//    }
//
//    @Test
//    public  void ScrolldownAndHoverOverItemsOnFeaturedProducts(){
//
//        HomePage homePage = new HomePage(getDriver());
//
//        homePage.ScrollToViewItemsInFeaturedProducts(getDriver());
//        homePage.HoverOverItemsOnFeaturedProducts(getDriver());
//
//        waitFor(5);
//
//    }
//
//    @Test
//    public  void ClickOnItemsOnFeaturedProducts(){
//
//        HomePage homePage = new HomePage(getDriver());
//        homePage.ScrollToViewItemsInFeaturedProducts(getDriver());
//        homePage.ClickOnEachItemOnFeaturedProducts(getDriver());
//
//
//    }









