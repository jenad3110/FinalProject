package SwappaWebSite;

import SwappaPages.AddToCartPage;
import base.CommonAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends CommonAPI {

 //   @Test
    public void FindAGoodDealBtnInCartSectionTest(){

        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
        addToCartPage.ClickOnFindAGoodDealInBottomOfCartPage();
        String ExpectedText = "Trending Searches";
        Assert.assertEquals(addToCartPage.AssertSearchText(),ExpectedText);

    }

    @Test
    public void OpeningAndClosingCartPage(){

        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
        addToCartPage.ClosingCartPage();
        Assert.assertFalse(addToCartPage.ClosingButtonIsClickable());
        Assert.assertEquals(getPageTitle(),"iPhones For Sale - Swappa");


    }




}
