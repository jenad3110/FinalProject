package SwappaWebSite;
import base.CommonAPI;
import SwaggaPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {







    @Test

    public void SelectItemsByImages(){

        HomePage homepage = new HomePage(getDriver());
        homepage.ClickOnImage(getDriver());
    }




   @Test
    public void SwappaLocalBtnTest(){

        HomePage homePage = new HomePage(getDriver());

        homePage.ClickOnSwappaLocal();

    }

   @Test
    public  void ScrolldownAndClickOnTMobileLogo(){

        HomePage homePage = new HomePage(getDriver());

        homePage.ScrollToViewShopPhonesByCarrier(getDriver());

        waitFor(5);

    }

   @Test
    public  void ScrolldownAndHoverOverCarriers(){

        HomePage homePage = new HomePage(getDriver());

        homePage.ScrollToViewShopPhonesByCarrier(getDriver());
        homePage.HoverOverElementInShopPhonesByCarriers(getDriver());

        waitFor(5);

    }

   @Test
    public  void ScrolldownAndHoverOverItemsOnFeaturedProducts(){

        HomePage homePage = new HomePage(getDriver());

        homePage.ScrollToViewItemsInFeaturedProducts(getDriver());
        homePage.HoverOverItemsOnFeaturedProducts(getDriver());

        waitFor(5);

    }

   @Test
    public  void ClickOnItemsOnFeaturedProducts(){

        HomePage homePage = new HomePage(getDriver());
        homePage.ScrollToViewItemsInFeaturedProducts(getDriver());
        homePage.ClickOnEachItemOnFeaturedProducts(getDriver());


    }




   @Test

    public void BottomMenuFunctionsTest(){

        HomePage homePage = new HomePage(getDriver());

        homePage.BottomMenu(getDriver());
       // String GetTitle = getPageTitle();
        //Assert.assertEquals("Forums, Community Discussion - Swappa",GetTitle);


    }

    @Test

    public void BottomMenuFunctions2Test(){

        HomePage homePage = new HomePage(getDriver());

        homePage.BottomMenu2(getDriver());




    }
    @Test
    public void CarrousselReviewTest(){

        HomePage homePage = new HomePage(getDriver());

        homePage.TrustPilotSEction(getDriver());


    }

    @Test
    public void BottomLogoTest(){

        HomePage homePage = new HomePage(getDriver());

        homePage.ClickOnSwappaLogoAtTheBottomOfThePage(getDriver());


    }

    @Test
    public void FacebookLogoTest(){

        HomePage homePage = new HomePage(getDriver());

        homePage.ClickOnFacebookLogo(getDriver());


    }

    @Test
    public void B2BExchange(){

        HomePage homePage = new HomePage(getDriver());

        homePage.ClickOnB2BExchange(getDriver());


    }














}
