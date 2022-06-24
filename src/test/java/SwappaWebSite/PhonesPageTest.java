package SwappaWebSite;

import base.CommonAPI;
import SwappaPages.PhonesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhonesPageTest extends CommonAPI {


  //@Test
    public void HoverOverPhones() {

        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        Assert.assertTrue(phonesPage.PhonesIsInteractable());


    }

    //@Test
    public void SelectUnlockedPhonesInSubMenu() {

        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnUnlockedSubMenu();
        Assert.assertEquals(getPageTitle(),"Unlocked Cell Phones - Swappa");

    }

    //@Test
    public void SelectIphoneInSubMenu() {

        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnAppleSubMenuBtn();
        Assert.assertEquals(getPageTitle(),"iPhones For Sale - Swappa");

    }


    //@Test
    public void SelectGoogleInSubMenu() {

        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnGoogleSubMenu();

        Assert.assertEquals(getPageTitle(),"Google Pixel Phones - Swappa");

    }


   // @Test
    public void SelectSamsungInSubMenu() {

        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnSamsungSubMenu();
        Assert.assertEquals(getPageTitle(),"Samsung Galaxy - Swappa");

    }


   // @Test
    public void SelectAllUnlockedPhonesInUnlockedSubMenu(){



        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnUnlockedSubMenu();
        phonesPage.ScrollToViewAllUnlockPhones(getDriver());
        phonesPage.ClickOnAllUnlockedPhonesBtn();
        Assert.assertEquals(getPageTitle(),"Unlocked - Swappa");


    }


    //@Test
    public void ScrollToViewAndClickOnUnlockedApple(){


        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnUnlockedSubMenu();
        phonesPage.ScrollToViewMoreUnlockedApple(getDriver());
        phonesPage.ClickOnMoreUnlockedApple();
        Assert.assertEquals(getPageTitle(),"Unlocked iPhones - Swappa");

    }

    //@Test
    public void ScrollDownToUnlockedGoogle(){


        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnUnlockedSubMenu();

        phonesPage.ScrollToViewUnlockedGoogle(getDriver());
        Assert.assertEquals(getPageTitle(),"Unlocked Cell Phones - Swappa");
    }


    //@Test
    public void ScrollDownToUnlockedOnePlus(){


        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnUnlockedSubMenu();
        phonesPage.ScrollToViewUnlockedOnePlus(getDriver());
        Assert.assertEquals(getPageTitle(),"Unlocked Cell Phones - Swappa");

    }

    //@Test
    public void ScrollDownToUnlockedSamsung(){


        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnUnlockedSubMenu();
        phonesPage.ScrollToViewUnlockedSamsung(getDriver());
        Assert.assertEquals(getPageTitle(),"Unlocked Cell Phones - Swappa");

    }


   // @Test
    public void ScrollDownAndClickOnMoreUnlockedOnePlus(){


        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnUnlockedSubMenu();
        phonesPage.ScrollToViewUnlockedOnePlus(getDriver());
        phonesPage.ClickOnMoreUnlockedOnePLus();
        Assert.assertEquals(getPageTitle(),"Unlocked OnePlus Phones - Swappa");
    }


    //@Test
    public void ScrollDownAndClickOnMoreUnlockedSamsung(){


        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnUnlockedSubMenu();
        phonesPage.ScrollToViewUnlockedSamsung(getDriver());
        phonesPage.ClickOnMoreUnlockedSamsung();
        Assert.assertEquals(getPageTitle(),"Unlocked Samsung Phones - Swappa");
    }



   // @Test
    public void ScrollDownAndClickOnMoreUnlockedGoogle(){


        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnUnlockedSubMenu();
        phonesPage.ScrollToViewUnlockedGoogle(getDriver());
        phonesPage.ClickOnMoreUnlockedGoogleBtn();
        Assert.assertEquals(getPageTitle(),"Unlocked Google Phones - Swappa");
    }


    @Test
    public void ScrollDownAndClickOnAllUnlockedPhones(){


        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnUnlockedSubMenu();
        phonesPage.ScrollToViewAllUnlockPhones(getDriver());
        phonesPage.ClickOnAllUnlockedPhonesBtn();
        Assert.assertEquals(getPageTitle(),"Unlocked - Swappa");

    }











   // @Test
    public void SelectUnlockedLG(){

        PhonesPage phonesPage = new PhonesPage(getDriver());
        phonesPage.HoverOverPhones(getDriver());
        phonesPage.ClickOnUnlockedSubMenu();

     //   phonesPage.ScrollDownAndSelectUnlockedLG(getDriver());

    }









}
