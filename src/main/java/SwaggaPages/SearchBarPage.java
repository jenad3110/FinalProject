package SwaggaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBarPage extends CommonAPI {


    public SearchBarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(3) > a > i")
    WebElement SearchLogo;
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(1) > ul > li:nth-child(1) > a > i")
    WebElement Menu;
    @FindBy(css = "#slide_search_form > div > input")
    WebElement SearchBar;
    @FindBy(css = "#slide_search_form > div > input")
    WebElement clearTheSearch;
    @FindBy(css = "#slide_search > div.offcanvas-header > button")
    WebElement CloseTheSearchBar;
    @FindBy(css = "#slide_search_form > div")
    WebElement SearchBtnInsideShearchBar;


    public void TypeInSearchBar(String element) {

        click(SearchLogo);
        type(SearchBar, element);
        click(SearchBtnInsideShearchBar);
        waitFor(2);
        //click(clearTheSearch);
        clear(clearTheSearch);
        click(CloseTheSearchBar);

    }











}
