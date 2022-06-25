package SwappaWebSite;

import SwappaPages.HomePage;
import SwappaPages.WatchesPage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WatchesPageTest extends CommonAPI {


      @Test
        public  void AccessWatchesPage(){



        HomePage homePage = new HomePage(getDriver());
        homePage.HoverOverWatches(getDriver());
        String ExpectedTitle= "Buy and Sell Used Phones, Laptops and More - Swappa";
        Assert.assertEquals(getPageTitle(),ExpectedTitle);




        }



       @Test
        public  void ClickOnAllWearables(){



            HomePage homePage = new HomePage(getDriver());
            WatchesPage watches = new WatchesPage(getDriver());
            homePage.HoverOverWatches(getDriver());
            watches.ClickOnAllWearbles();
            String ExpectedTitle= "Wearables and Watches - Swappa";
            Assert.assertEquals(getPageTitle(),ExpectedTitle);

        }
        @Test
        public  void GoToBottomOfThePage(){



            HomePage homePage = new HomePage(getDriver());
            WatchesPage watches = new WatchesPage(getDriver());
            homePage.HoverOverWatches(getDriver());
            watches.ClickOnAllWearbles();
            homePage.ClickOnSwappaLogoAtTheBottomOfThePage(getDriver());
            String ExpectedTitle ="Buy and Sell Used Phones, Laptops and More - Swappa";
            Assert.assertEquals(getPageTitle(),ExpectedTitle);

        }

       @Test
        public  void ClickOnSellWearable(){



            HomePage homePage = new HomePage(getDriver());
            WatchesPage watches = new WatchesPage(getDriver());
            homePage.HoverOverWatches(getDriver());
            watches.ClickOnAllWearbles();
            watches.ClickOnSellWearbles();
            String ExpectedTitle ="Sell Wearables - Swappa";
            Assert.assertEquals(getPageTitle(),ExpectedTitle);


        }

        @Test
        public  void ClickOnAndroidWatches(){



            HomePage homePage = new HomePage(getDriver());
            WatchesPage watches = new WatchesPage(getDriver());
            homePage.HoverOverWatches(getDriver());
            watches.ClickOnAllWearbles();
            watches.ClickOnAndroidbtn();
            String ExpectedTitle ="Smart Watches for Android - Swappa";
            Assert.assertEquals(getPageTitle(),ExpectedTitle);


        }

       @Test
        public  void ClickOnAllwearables() {


            HomePage homePage = new HomePage(getDriver());
            WatchesPage watches = new WatchesPage(getDriver());
            homePage.HoverOverWatches(getDriver());
            watches.CLickOnAppleWatches();
           String ExpectedTitle ="Apple Watches - Swappa";
           Assert.assertEquals(getPageTitle(),ExpectedTitle);


        }









    }
