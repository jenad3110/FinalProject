package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchesPage extends CommonAPI {

    public WatchesPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    HomePage homePage = new HomePage(getDriver());


    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(5) > ul > li:nth-child(4) > a")
    WebElement AllWearables;

    @FindBy(css = "#section_top > ul > li:nth-child(4) > a")
    WebElement SellWearablebtn;

    @FindBy(css = "#section_top > ul > li:nth-child(3) > a")
    WebElement AndroidWatchesbtn;

    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(5) > ul > li:nth-child(1) > a")
    WebElement AppleWatches;



    public void ClickOnAllWearbles(){click(AllWearables);}
    public void ClickOnSellWearbles(){click(SellWearablebtn);}
    public void ClickOnAndroidbtn(){click(AndroidWatchesbtn);}
    public void CLickOnAppleWatches(){click(AppleWatches);}


}
