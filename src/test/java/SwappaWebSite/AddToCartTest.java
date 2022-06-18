package SwappaWebSite;

import SwaggaPages.AddToCartPage;
import SwaggaPages.HomePage;
import base.CommonAPI;
import com.sun.org.apache.bcel.internal.generic.FADD;
import org.testng.annotations.Test;

public class AddToCartTest extends CommonAPI {

    @Test
    public void FindAGoodDealBtnInCartSectionTest(){

        AddToCartPage addToCartPage = new AddToCartPage(getDriver());

        addToCartPage.ClickOnFindAGoodDealInBottomOfCartPage();


    }

    @Test
    public void OpeningAndClosingCartPage(){

        AddToCartPage addToCartPage = new AddToCartPage(getDriver());

        addToCartPage.ClosingCartPage();


    }




}
