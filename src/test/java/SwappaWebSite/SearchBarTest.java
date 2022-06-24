package SwappaWebSite;

import SwappaPages.SearchBarPage;
import base.CommonAPI;
import org.testng.annotations.Test;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class SearchBarTest extends CommonAPI {

    @Test

    public void SearchBarTesting(){

        SearchBarPage searchBarPage = new SearchBarPage(getDriver());

        searchBarPage.ClickSearchLogo();
        searchBarPage.TypeInSearchBar("iphone 11");
        searchBarPage.ClearSearchBar();
        searchBarPage.TypeInSearchBar("PlayStation 5");
        searchBarPage.ClearSearchBar();
        searchBarPage.TypeInSearchBar("samsung galaxy s21");
        searchBarPage.ClearSearchBar();
        searchBarPage.TypeInSearchBar("$$$$$$$$$$$$$$$$$$$");

    }






   // @Test
    public  void EnterItemsFromExcel(){

        SearchBarPage searchBarPage = new SearchBarPage(getDriver());
        searchBarPage.ClickSearchLogo();

        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"/data/TestData.xlsx");
        List<String> items = excelReader.getEntireColumnForGivenHeader("Sheet1", "item");

        for (String item: items) {
            searchBarPage.ClearSearchBar();
            searchBarPage.SearchElementAndEnter(item);



        }


        }










}
