package SwappaWebSite;

import SwappaPages.HomePage;
import SwappaPages.MenuPage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuPageTest extends CommonAPI {



    @Test

    public void AccessForumSectionFromDropDownMenu(){

        MenuPage    menuPage = new MenuPage(getDriver());
        menuPage.AccessForumSection();
        String GetTitle = getPageTitle();
        Assert.assertEquals(GetTitle,"Forums, Community Discussion - Swappa");
        TestPassedLOG();


    }



    @Test
    public void MenuHomePage(){

        HomePage homepage = new HomePage(getDriver());

        homepage.HoverOverMenu(getDriver());
        TestPassedLOG();

    }






}
