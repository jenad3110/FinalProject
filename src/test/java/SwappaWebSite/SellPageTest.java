package SwappaWebSite;

import SwaggaPages.SellPage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class SellPageTest extends CommonAPI {



   @Test

    public void TestSELLBtn(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellBtn(getDriver());


    }

    @Test
    public void ClickOnStartSelling(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSTartSellingBtn(getDriver());
    }

    @Test
    public void SelectOnCloseSellBar(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnCloseSellBar(getDriver());
    }





    @Test

    public void HowToSellFunctionTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnHowToSell(getDriver());

    }

    @Test

    public void ClickOnfairFeesBtnTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnFairFees(getDriver());



    }

    @Test
    public void FAQInSellSectionTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellFaQ(getDriver());

    }

    @Test
    public void SellMyThenIphoneTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenIphoneUnderSellSection(getDriver());

    }

    @Test
    public void SelectSellMyThenPhoneTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenPhoneUnderSellSection(getDriver());
    }

    @Test
    public void SelectSellMyThenMacBookTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenMacBookUnderSellSection(getDriver());
    }

    @Test
    public void SelectSellMyThenMyComputerTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenComputerUnderSellSection(getDriver());
    }


    @Test
    public void SelectSellMyThenMyTabletOrIpadTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenTabletOrIpad(getDriver());
    }

    @Test
    public void SelectSellMyThenMyWatchOrWearable(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenWatchOrWearable(getDriver());
    }

    @Test
    public void SelectSellMyVideoGameConsole(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyVideoGameConsole(getDriver());
    }
    @Test
    public void SelectSellMyHomeTech(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyVideoGameConsole(getDriver());
    }

   @Test
    public void SelectSellMyCameraOrLens(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyCameraOrLens(getDriver());
    }

    @Test
    public void ScrollToTheBottomOfSellingFrame(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ScrollTotheBottomOnSellFrame(getDriver());
    }

    @Test
    public void HoverOverStartSelling(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.HoverOverStartSellingBtn(getDriver());
    }

    @Test
    public void AccessSellMyIphoneTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenIphoneUnderSellSection(getDriver());
        sellPage.TypeInSellSearchBar("Iphone 13 Pro");
        sellPage.ClickOnSearchBtn();
    }

    @Test
    public void AccessSellMyphoneTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenPhoneUnderSellSection(getDriver());
        sellPage.TypeInSellSearchBar("samsung galaxy s30");
        sellPage.ClickOnSearchBtn();
    }

    @Test
    public void AccessSellMyMacBookTest(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenMacBookUnderSellSection(getDriver());
        sellPage.TypeInSellSearchBar("MacBook Pro 10");
        sellPage.ClickOnSearchBtn();
    }

    @Test
    public void SearchingForPhonesInMacBookSection(){

        SellPage sellPage = new SellPage(getDriver());
        sellPage.ClickOnSellMyThenMacBookUnderSellSection(getDriver());
        sellPage.TypeInSellSearchBar("samsung s22");
        sellPage.ClickOnSearchBtn();
        waitFor(5);
    }







}
