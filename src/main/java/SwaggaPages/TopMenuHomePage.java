package SwaggaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuHomePage extends CommonAPI {

    public TopMenuHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(3) > a > i")
    WebElement SearchLogo;
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(2) > a > i")
    WebElement ShoppingCart;
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(1) > ul > li:nth-child(1) > a > i")
    WebElement Menu;
    @FindBy(css = "#slide_menu > div.offcanvas-body > div.row.row-cols-2.mb-3 > div:nth-child(1) > a")
    WebElement loginBtn;
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(1) > ul > li:nth-child(3) > a > i")
    WebElement Sell;
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(1) > ul > li:nth-child(2) > a > i")
    WebElement Help;
    public void HoverOverShoppingCart(WebDriver driver) {hoverOver(driver, ShoppingCart);}
    public void HoverOverSearch(WebDriver driver) {hoverOver(driver, SearchLogo);}
    public void HoverOverTopRightMenu(WebDriver driver) {hoverOver(driver, Loginbtn);}
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(1) > a > i")
    WebElement Loginbtn;







}
