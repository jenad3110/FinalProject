package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.WatchEvent;

public class AddToCartPage extends CommonAPI {


    public AddToCartPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(AddToCartPage.class);


    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(2) > a > i")
    WebElement ShoppingCart;
    @FindBy(css = "#slide_cart > div.offcanvas-footer.bgc-indigo.text-light.p-3 > div > div:nth-child(2) > a.btn.btn-primary.d-block.search-deal-btn")
    WebElement FindAGoodDealbtn;
    @FindBy(css = "#slide_cart > div.offcanvas-header > button")
    WebElement ClosingCartPage;


    public void ClickOnFindAGoodDealInBottomOfCartPage() {

        click(ShoppingCart);
        LOG.info("ShoppingCart selected");
        click(FindAGoodDealbtn);
        LOG.info("Find a good deals selected");
    }

    public void ClosingCartPage() {

        click(ShoppingCart);
        LOG.info("ShoppingCart selected");
        click(ClosingCartPage);
        LOG.info("Closing ShoppingCart selected");

    }


    //----------------------------------------------------------------Assertion------------------------------------------------//

    @FindBy(css = "#slide_search > div.position-relative > div > h4")
    WebElement TrendingSearchText;
    public String AssertSearchText(){return getElementText(TrendingSearchText);}


    public boolean ClosingButtonIsClickable() {
        return isPresent(ClosingCartPage);
    }
}