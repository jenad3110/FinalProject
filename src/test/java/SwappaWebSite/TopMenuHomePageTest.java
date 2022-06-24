package SwappaWebSite;

import SwappaPages.TopMenuHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuHomePageTest extends CommonAPI {

  //  @Test
    public void HoverOverClickAndCloseSearchButton() {

        TopMenuHomePage topMenuHomePage = new TopMenuHomePage(getDriver());
        topMenuHomePage.HoverOverSearch(getDriver());
        topMenuHomePage.ClickSearchButton();
        String ExpectedText= "Trending Searches";
        Assert.assertEquals(topMenuHomePage.AssertSearchText(),ExpectedText);
        topMenuHomePage.ClickCloseSearchButton();



    }



   @Test
    public void HoverOverClickAndCloseLoginButton() {
       TopMenuHomePage topMenuHomePage = new TopMenuHomePage(getDriver());
       topMenuHomePage.HoverOverLogin(getDriver());
       topMenuHomePage.ClickLogin();
       String ExpectedText= "Login for Deals";
       topMenuHomePage.WaitForTextInLoginMenuToBeVisible(getDriver());
       Assert.assertEquals(topMenuHomePage.AssertLoginText(),ExpectedText);
       topMenuHomePage.WaitForTextInLoginMenuToBeVisible(getDriver());
       topMenuHomePage.ClickCloseLoginButton();



    }

    @Test
    public void HoverOverClickAndCloseAddToCartButton() {
        TopMenuHomePage topMenuHomePage = new TopMenuHomePage(getDriver());
        topMenuHomePage.HoverOverShoppingCart(getDriver());
        topMenuHomePage.ClickShoppingCart();
        String ExpectedText= "Cart, Full of Deals";
        //topMenuHomePage.WaitForAddToCartElementToBeVisible(getDriver());
        topMenuHomePage.WaitForAddToCartToBeVisible(getDriver());
        Assert.assertEquals(topMenuHomePage.AssertAddToCartText(),ExpectedText);
        topMenuHomePage.ClickCloseShoppingCart();



    }




}
