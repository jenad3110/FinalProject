package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WatchesPage extends CommonAPI {

    public WatchesPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    private final Logger LOG = LoggerFactory.getLogger(TabletsPage.class);



    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(5) > ul > li:nth-child(4) > a")
    WebElement AllWearables;

    @FindBy(css = "#section_top > ul > li:nth-child(4) > a")
    WebElement SellWearablebtn;

    @FindBy(css = "#section_top > ul > li:nth-child(3) > a")
    WebElement AndroidWatchesbtn;

    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(5) > ul > li:nth-child(1) > a")
    WebElement AppleWatches;



    public void ClickOnAllWearbles(){click(AllWearables);LOG.info("Click All Wearables Performed");}
    public void ClickOnSellWearbles(){click(SellWearablebtn); LOG.info("Click On Sell All Wearables Performed");}
    public void ClickOnAndroidbtn(){click(AndroidWatchesbtn);LOG.info("Click Android Watches button Performed");}
    public void CLickOnAppleWatches(){click(AppleWatches);LOG.info("Click Apple Watches Performed");}


}
