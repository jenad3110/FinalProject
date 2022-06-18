package SwappaWebSite;

import SwaggaPages.SearchBarPage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class SearchBarTest extends CommonAPI {

    @Test

    public void SearchBarTest(){

        SearchBarPage searchBarPage = new SearchBarPage(getDriver());

        searchBarPage.TypeInSearchBar("iphone 11");
        waitFor(2);
        searchBarPage.TypeInSearchBar("PlayStation 5");
        waitFor(2);
        searchBarPage.TypeInSearchBar("samsung galaxy s21");
        waitFor(2);
        searchBarPage.TypeInSearchBar("$$$$$$$$$$$$$$$$$$$");

    }










}
