package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuHomePage extends CommonAPI {

    public TopMenuHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }





    @FindBy(css = "#slide_cart > div.offcanvas-header > button")
    WebElement CloseShoppingCart;
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(2) > a > i")
    WebElement ShoppingCart;


    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(3) > a > i")
    WebElement SearchLogo;
    @FindBy(css = "#slide_search > div.offcanvas-header > button")
    WebElement CloseSearchBtn;

    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(1) > a > i")
    WebElement Loginbtn;
    @FindBy(css = "#slide_login > div.offcanvas-header > button")
    WebElement CloseLogin;


    public void ClickCloseShoppingCart() {click(CloseShoppingCart);}
    public void HoverOverShoppingCart(WebDriver driver) {hoverOver(driver, ShoppingCart);}
    public void ClickShoppingCart() {click(ShoppingCart);}






    public void HoverOverSearch(WebDriver driver) {hoverOver(driver, SearchLogo);}
    public void ClickCloseSearchButton(){click(CloseSearchBtn);}
    public void ClickSearchButton(){click(SearchLogo);}



    public void HoverOverLogin(WebDriver driver) {hoverOver(driver, Loginbtn);}
    public void ClickLogin() {click(Loginbtn);}
    public void ClickCloseLoginButton(){click(CloseLogin);}




//---------------------------------------------------------Assertion---------------------------------------------------------------------------//

    @FindBy(css = "#slide_search > div.position-relative > div > h4")
    WebElement TrendingSearchText;
    public String AssertSearchText(){return getElementText(TrendingSearchText);}

    @FindBy(css = "#slide_login_label")
    WebElement LoginForDealsText;
    public String AssertLoginText(){return getElementText(LoginForDealsText);}

    @FindBy(css = "#slide_cart_title")
    WebElement AddToCartText;
    public String AssertAddToCartText(){return getElementText(AddToCartText);}


//------------------------------------------------Explicite Wait-------------------------------------------------------//


    public void WaitForTextInLoginMenuToBeVisible(WebDriver driver){

        waitForAnElementTobeVisible(LoginForDealsText,driver);
    }

    public void WaitForAddToCartToBeVisible(WebDriver driver){

        waitForAnElementTobeVisible(AddToCartText,driver);
    }


}