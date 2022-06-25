package SwappaWebSite;

import SwappaPages.SellPage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SellPageTest extends CommonAPI {


   @Test

    public void TestSELLBtn(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.HoverOverAndClickOnSellBtn(getDriver());
        Assert.assertEquals(getPageTitle(),"Buy and Sell Used Phones, Laptops and More - Swappa");


    }

    @Test
    public void ClickOnStartSelling(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSTartSellingBtn(getDriver());
        Assert.assertEquals(getPageTitle(),"Sell on Swappa - Swappa");
    }

    @Test
    public void SelectOnCloseSellBar(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnCloseSellBar(getDriver());
        Assert.assertEquals(getPageTitle(),"Buy and Sell Used Phones, Laptops and More - Swappa");

    }





    @Test

    public void HowToSellFunctionTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnHowToSell(getDriver());
        Assert.assertEquals(getPageTitle(),"How to Sell - Swappa");

    }

   @Test

    public void ClickOnfairFeesBtnTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnFairFees(getDriver());
        Assert.assertEquals(getPageTitle(),"How to Sell - Swappa");


    }

    @Test
    public void FAQInSellSectionTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellFaQ(getDriver());
        Assert.assertEquals(getPageTitle(),"FAQ: Selling - Swappa");

    }

    @Test
    public void SellMyThenIphoneTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenIphoneUnderSellSection(getDriver());
        Assert.assertEquals(getPageTitle(),"Sell My iPhone - Swappa");


    }

   @Test
    public void SelectSellMyThenPhoneTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenPhoneUnderSellSection(getDriver());
       Assert.assertEquals(getPageTitle(),"Sell My Phone - Swappa");
    }

    @Test
    public void SelectSellMyThenMacBookTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenMacBookUnderSellSection(getDriver());
        Assert.assertEquals(getPageTitle(),"Sell MacBook - Swappa");
    }

    @Test
    public void SelectSellMyThenMyComputerTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenComputerUnderSellSection(getDriver());
        Assert.assertEquals(getPageTitle(),"Sell Laptop - MacBook, Chromebook, and Windows - Swappa");
    }


    @Test
    public void SelectSellMyThenMyTabletOrIpadTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenTabletOrIpad(getDriver());
         Assert.assertEquals(getPageTitle(),"Sell Tablets | Sell Your Tablet For Cash - Swappa");

    }

    @Test
    public void SelectSellMyThenMyWatchOrWearable(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenWatchOrWearable(getDriver());
        Assert.assertEquals(getPageTitle(),"Sell Wearables - Swappa");
    }

    @Test
    public void SelectSellMyVideoGameConsole(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyVideoGameConsole(getDriver());
        Assert.assertEquals(getPageTitle(),"Sell Video Games and Consoles - Swappa");
    }
    @Test
    public void SelectSellMyHomeTech(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyVideoGameConsole(getDriver());
        Assert.assertEquals(getPageTitle(),"Sell Video Games and Consoles - Swappa");
    }

    @Test
    public void ScrolltoViewAndSelectSellMyCameraOrLens(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ScrollToViewAndClickOnSellMyCameraOrLens(getDriver());
       Assert.assertEquals(getPageTitle(),"Sell Cameras - Swappa");
    }

    @Test
    public void ScrollToTheBottomOfSellingFrame(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ScrollTotheBottomOnSellFrame(getDriver());
        Assert.assertEquals(getPageTitle(),"Buy and Sell Used Phones, Laptops and More - Swappa");
    }

    @Test
    public void HoverOverStartSelling(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.HoverOverStartSellingBtn(getDriver());
        Assert.assertEquals(getPageTitle(),"Buy and Sell Used Phones, Laptops and More - Swappa");
    }

    @Test
    public void AccessSellMyIphoneTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenIphoneUnderSellSection(getDriver());
        sellPage.TypeInSellSearchBar("Iphone 13 Pro");
        sellPage.ClickOnSearchBtn();
        Assert.assertEquals(getPageTitle(),"Sell - Swappa");
    }

    @Test
    public void AccessSellMyphoneTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenPhoneUnderSellSection(getDriver());
        sellPage.TypeInSellSearchBar("samsung galaxy s30");
        sellPage.ClickOnSearchBtn();
        Assert.assertEquals(getPageTitle(),"Sell - Swappa");
    }

    @Test
    public void AccessSellMyMacBookTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenMacBookUnderSellSection(getDriver());
        sellPage.TypeInSellSearchBar("MacBook Pro 10");
        sellPage.ClickOnSearchBtn();
        Assert.assertEquals(getPageTitle(),"Sell - Swappa");
    }

    @Test
    public void SearchingForPhonesInMacBookSection(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenMacBookUnderSellSection(getDriver());
        sellPage.TypeInSellSearchBar("samsung s22");
        sellPage.ClickOnSearchBtn();
        Assert.assertEquals(getPageTitle(),"Sell - Swappa");
    }







}
