package SwappaWebSite;

import SwaggaPages.HomePage;
import SwaggaPages.TopMenuHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class TopMenuHomePageTest extends CommonAPI {

    @Test
    public void TopMenuInRightHomePage() {

        TopMenuHomePage topMenuHomePage = new TopMenuHomePage(getDriver());

        topMenuHomePage.HoverOverTopRightMenu(getDriver());
        waitFor(2);
    }


    @Test
    public void TopMenuLeftInHomePage() {

        HomePage homepage = new HomePage(getDriver());

        homepage.HoverOverTopLeftMenu(getDriver());
        waitFor(2);


    }

}
