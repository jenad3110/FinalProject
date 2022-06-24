package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utility.ExcelReader;

import java.util.List;

public class SearchBarPage extends CommonAPI {


    public SearchBarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    private final Logger LOG = LoggerFactory.getLogger(SearchBarPage.class);

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


    public void ClickSearchLogo(){click(SearchLogo);LOG.info("Click search logo Performed");}
    public void TypeInSearchBar(String element) {type(SearchBar, element);LOG.info("type search  Performed");}
    public void ClearSearchBar(){clear(SearchBar);LOG.info("Clear search Performed");}
    public void CloseSearch(){clear(CloseTheSearchBar);LOG.info("Click search logo Performed");}



    public void SearchElementAndEnter(String item){
        typeAndEnter(SearchBar, item);
        LOG.info("type "+item+" in search field and enter success");
    }



























    public void ExcelRead(){
        String path = "C:\\Users\\sron4\\Downloads\\FinalFramework\\TestExcelSheet.xlsx";
        ExcelReader excelReader = new ExcelReader(path);
        List<String> items = excelReader.getEntireColumnForGivenHeader("Sheet1", "id");
        String item = excelReader.getValueForGivenHeaderAndKey("Sheet1", "id", "id004");
       // for (String item: items) {
        // searchBarPage.SearchElementAndEnter(item);}
        System.out.println(items);
    }











    }





