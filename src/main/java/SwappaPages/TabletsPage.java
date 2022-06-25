package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TabletsPage extends CommonAPI {
    public TabletsPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(TabletsPage.class);


    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(6) > a")
    WebElement TabletsInMenu;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(6) > ul > li:nth-child(1) > a")
    WebElement IpadsInSubMenu;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(6) > ul > li:nth-child(2) > a")
    WebElement SamsungInSubMenu;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(6) > ul > li:nth-child(3) > a")
    WebElement WindowsInSubMenu;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(6) > ul > li:nth-child(4) > a")
    WebElement AmazonKindleInSubMenu;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(6) > ul > li:nth-child(5) > a")
    WebElement AllTabletsInSubMenu;

    //------------------------------------Under All Tablets section ---------------------------------------------------//

    @FindBy(css = "#section_main > div:nth-child(4) > div.text-center > a")
    WebElement MoreAmazonTablets;
    @FindBy(css = "#section_main > div:nth-child(3) > div.text-center > a")
    WebElement MoreWindowsTablets;
    @FindBy(css = "#section_main > div:nth-child(2) > div:nth-child(3) > a")
    WebElement MoreAndroidTablets;
    @FindBy(css = "#section_main > div:nth-child(1) > div.text-center > a")
    WebElement MoreAppleTablets;

    //------------------------------------Under Amazon Tablets section---------------------------------------------------//

    @FindBy(css = "#id_brand")
    WebElement AmazonDropDownMenu;
    @FindBy(css = "#id_platform")
    WebElement FilterPlatform;
    @FindBy(css = "#id_sort")
    WebElement SortBy;



    public void ClickOnTabletInMenu(){click(TabletsInMenu);LOG.info("Click Tablets In Menu Performed");}
    public void HoverOverTabletInmenu(WebDriver driver){hoverOver(driver,TabletsInMenu);LOG.info("Hover Over Tablets In Menu Performed");}
    public void ClickOnIpadInsubMenu(){click(IpadsInSubMenu);LOG.info("Click On Ipad In Menu Performed");}
    public void ClickOnSamsungInSubMenu(){click(SamsungInSubMenu);LOG.info("Click On Samsung In Menu Performed");}
    public void ClickOnWindowsInSubMenu(){click(WindowsInSubMenu);LOG.info("Click Windows In Menu Performed");}
    public void ClickOnAmazonKindleInSubMenu(){click(AmazonKindleInSubMenu);LOG.info("Click Amazon Kindle In Menu Performed");}
    public void ClickOnALlTabletsInSubMenu(){click(AllTabletsInSubMenu);LOG.info("Click All Tablets In Menu Performed");}





    public void SelectFromDropDownAmazon(String Text){ selectFromDropdown(AmazonDropDownMenu,Text);LOG.info("Option "+Text+" Is Selected ");}
    public void SelectFromDropDownFilterPlatform(String Text){ selectFromDropdown(FilterPlatform,Text);LOG.info("Option "+Text+" Is Selected ");}
    public void SelectFromDropDownSortBy(String Text){ selectFromDropdown(SortBy,Text);LOG.info("Option "+Text+" Is Selected ");}


    //-----------------------------------------Reusable methods ---------------------------------------------------//


    public void  ClickOnIpad(WebDriver driver){

        HoverOverTabletInmenu(driver);
        ClickOnIpadInsubMenu();
        LOG.info("Accessed Ipad Section");
    }

    public void  ClickOnWindows(WebDriver driver){

        HoverOverTabletInmenu(driver);
        ClickOnWindowsInSubMenu();
        LOG.info("Accessed Windows Section");
    }

    public void  ClickOnAmazonKindle(WebDriver driver){

        HoverOverTabletInmenu(driver);

        ClickOnAmazonKindleInSubMenu();
        LOG.info("Accessed Amazon Kindle Section");
    }

    public void  ClickOnAllTablets(WebDriver driver){

        HoverOverTabletInmenu(driver);

        ClickOnALlTabletsInSubMenu();
        LOG.info("Accessed All Tablets Section");
    }

    public void ClickOnSamsung(WebDriver driver){
      HoverOverTabletInmenu(driver);

        ClickOnSamsungInSubMenu();
        LOG.info("Accessed Samsung Section");

    }


//--------------------------------------------------Assertion---------------------------------------------------------------//

    @FindBy(css = "#section_top > h1")
    WebElement IpadForAssert;
    @FindBy(css = "#section_top > div > h1")
    WebElement SamsungForAssert;
    @FindBy(css = "#section_main > div")
    WebElement SearchBarAssert;

    public String AssertTextInIpadPage(){return getElementText(IpadForAssert);}
    public String AssertTextInSamsungPage(){return getElementText(SamsungForAssert);}
    public String AssertTextForSearchBar(){return getElementText(SearchBarAssert);}























}
