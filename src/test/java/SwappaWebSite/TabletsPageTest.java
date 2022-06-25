package SwappaWebSite;

import SwappaPages.HomePage;
import SwappaPages.TabletsPage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TabletsPageTest extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(TabletsPageTest.class);

    @Test
    public void AccessIpadFromTabletmenu(){

        TabletsPage tabletspage = new TabletsPage(getDriver());
        tabletspage.ClickOnIpad(getDriver());
        String ExpectedText= "iPads";
        Assert.assertEquals(tabletspage.AssertTextInIpadPage(),ExpectedText);



    }

    @Test
    public void AccessSamsungFromTabletMenu() {

        TabletsPage tabletspage = new TabletsPage(getDriver());
        tabletspage.ClickOnSamsung(getDriver());
        String ExpectedText= "Samsung Tablets";
       Assert.assertEquals(tabletspage.AssertTextInSamsungPage(),ExpectedText);

        LOG.info("Test completed");
    }

    @Test
    public void AccessAmazonKindleFromTabletMenu() {

        TabletsPage tabletspage = new TabletsPage(getDriver());
        tabletspage.ClickOnTabletInMenu();
        tabletspage.ClickOnAmazonKindle(getDriver());
        String ExpectedPageTitle = "Used Amazon Tablets - Swappa";
        Assert.assertEquals(getPageTitle(), ExpectedPageTitle);

        LOG.info("Test completed");
    }


    @Test
    public void AccessWindowsTabletsFromTabletMenu() {

        TabletsPage tabletspage = new TabletsPage(getDriver());

        tabletspage.ClickOnWindows(getDriver());
        String ExpectedPageTitle = "Used Tablets with Windows Mobile - Swappa";
        Assert.assertEquals(getPageTitle(), ExpectedPageTitle);
        GoBackToPreviousPage();
        LOG.info("Test completed");
    }
    @Test
    public void AccessAllTabletsFromTabletmenu() {

        TabletsPage tabletspage = new TabletsPage(getDriver());
        tabletspage.ClickOnAllTablets(getDriver());
        String ExpectedPageTitle = "Tablets For Sale - Swappa";
        Assert.assertEquals(getPageTitle(), ExpectedPageTitle);
        GoBackToPreviousPage();
        LOG.info("Test completed");
    }

    @Test
    public void SelectFromDropDownMenuInAmazonKindleSection() {

        TabletsPage tabletspage = new TabletsPage(getDriver());

        tabletspage.ClickOnAmazonKindle(getDriver());
        tabletspage.SelectFromDropDownAmazon("Apple");
        tabletspage.SelectFromDropDownFilterPlatform("Amazon Alexa");
        tabletspage.SelectFromDropDownSortBy("Reviews");
        String ExpectedPageTitle = "Used Apple Tablets with Amazon Alexa - Swappa";
        Assert.assertEquals(getPageTitle(), ExpectedPageTitle);

        LOG.info("Test completed");
    }


    @Test
    public void SelectFromDropDownMenuInAmazonKindleSectionSecondExample() {

        TabletsPage tabletspage = new TabletsPage(getDriver());

        tabletspage.ClickOnAmazonKindle(getDriver());
        tabletspage.SelectFromDropDownAmazon("Samsung");
        tabletspage.SelectFromDropDownFilterPlatform("Blackberry");
        tabletspage.SelectFromDropDownSortBy("Reviews");
        String ExpectedText = "No products match this criteria.";
        Assert.assertEquals(tabletspage.AssertTextForSearchBar(), ExpectedText);

        LOG.info("Test completed");
    }

    @Test
    public void SelectFromDropDownMenuInAmazonKindleSectionThirdExample() {

        TabletsPage tabletspage = new TabletsPage(getDriver());

        tabletspage.ClickOnAmazonKindle(getDriver());
        tabletspage.SelectFromDropDownAmazon("Apple");
        tabletspage.SelectFromDropDownFilterPlatform("iOS");
        tabletspage.SelectFromDropDownSortBy("Price (Low)");
        String ExpectedPageTitle = "Used Apple Tablets with iOS - Swappa";
        Assert.assertEquals(getPageTitle(), ExpectedPageTitle);

        LOG.info("Test completed");
    }





}
