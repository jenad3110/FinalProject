package SwaggaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends CommonAPI {


    public AddToCartPage(WebDriver driver) {PageFactory.initElements(driver, this);}


    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(2) > a > i")
    WebElement ShoppingCart;
    @FindBy(css = "#slide_cart > div.offcanvas-footer.bgc-indigo.text-light.p-3 > div > div:nth-child(2) > a.btn.btn-primary.d-block.search-deal-btn")
    WebElement FindAGoodDealbtn;
    @FindBy(css = "#slide_cart > div.offcanvas-header > button")
    WebElement ClosingCartPage;


    public void ClickOnFindAGoodDealInBottomOfCartPage() {

        click(ShoppingCart);
        click(FindAGoodDealbtn);

    }

    public void ClosingCartPage() {

        click(ShoppingCart);
        click(ClosingCartPage);

    }
}
