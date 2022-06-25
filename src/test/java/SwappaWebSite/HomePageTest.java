package SwappaWebSite;
import base.CommonAPI;
import SwappaPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HomePageTest.class);


   @Test

    public void AccessArticlesMentionningSwappaAtBottomOfThePageTest(){

       LOG.info("Access Articles Mentioning Swappa Test is Processing");

        HomePage homePage = new HomePage(getDriver());

        homePage.BottomMenu(getDriver());

        Assert.assertEquals(getPageTitle(),"Swappa Press - Swappa");
        LOG.info("Test Passed");


    }


    @Test
    public void TrustPilotSliderTest(){

        LOG.info("Access TrustPilot Frame Test is Processing");

        HomePage homePage = new HomePage(getDriver());

        homePage.AccessTrustPilotSection(getDriver());

        Assert.assertTrue(homePage.TrustPilotElementIsVisible());
        LOG.info("Test Passed");
    }

    @Test
    public void BottomSwappaLogoTest(){

        LOG.info("Access Swappa Log At The Bottom Of The Page is Processing");

        HomePage homePage = new HomePage(getDriver());

        homePage.ClickOnSwappaLogoAtTheBottomOfThePage(getDriver());

        Assert.assertTrue(homePage.LogoAtTheBottomOfThePageIsPresent());
        LOG.info("Test Passed");

    }

    @Test
    public void FacebookLogoTest(){

        LOG.info("Access Facebook Logo Test is Processing");
        HomePage homePage = new HomePage(getDriver());

        homePage.ClickOnFacebookLogo(getDriver());

        Assert.assertTrue(homePage.FacebookLogoIsPresent());
        LOG.info("Test Passed");

    }

    @Test
    public void ClickOnB2BExchange(){

        LOG.info("Click On B2B Exchange Test is Processing");

        HomePage homePage = new HomePage(getDriver());

        homePage.ClickOnB2BExchange(getDriver());
        Assert.assertEquals(getPageTitle(),"Exchange - B2B Wholesale Marketplace - Swappa");
        LOG.info("Test Passed");


    }








}
