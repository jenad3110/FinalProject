package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PhonesPage extends CommonAPI {

    HomePage homePage = new HomePage(getDriver());

    public PhonesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    private final Logger LOG = LoggerFactory.getLogger(PhonesPage.class);






    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement UnlockedPhones;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(2) > a")
    WebElement Phones;
    @FindBy(css = "#section_billboard > div:nth-child(1) > div.text-center > a")
    WebElement MoreUnlockedApple;

    @FindBy(css = "#section_billboard > div:nth-child(2) > div.text-center > a")
    WebElement MoreUnlockedGoogle;


    @FindBy(css = "#section_billboard > div.text-center > a")
    WebElement AllUnlockedPhonesBtn;
    @FindBy(css = "#section_billboard > div:nth-child(3) > div.text-center > a")
    WebElement MoreUnlockedOnePlusBtn;
    @FindBy(css = "#section_billboard > div:nth-child(2) > div.text-center > a")
    WebElement MoreUnlockedGoogleBtn;
    @FindBy(css = "#section_billboard > div:nth-child(4) > div.text-center > a")
    WebElement MoreUnlockedSamsungBtn;



    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement AppleSubMenuBtn;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement SamsungSubMenuBtn;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement GoogleSubMenuBtn;
    @FindBy(css = "#section_billboard > div:nth-child(1) > div.d-flex.align-items-baseline.my-3 > h2")
    WebElement UnlockedIphonesTitle;
    @FindBy(css = "#section_billboard > div:nth-child(3) > div.d-flex.align-items-baseline.my-3 > h2")
    WebElement UnlockedOnePlusTitle;
    @FindBy(css = "#section_billboard > div:nth-child(4) > div.d-flex.align-items-baseline.my-3 > h2")
    WebElement UnlockedSamusngTitle;

    public void HoverOverPhones(WebDriver driver){hoverOver(driver,Phones);LOG.info("Hover over Phones Performed");}
    public boolean  PhonesIsInteractable(){ return isInteractable(Phones);}

    public void ClickOnAppleSubMenuBtn(){ click(AppleSubMenuBtn);LOG.info("Click on Apple in dropdown menu Performed");}
    public void ClickOnSamsungSubMenu(){click(SamsungSubMenuBtn);LOG.info("Click on  Samsung in dropdown menu Performed");}
    public void ClickOnGoogleSubMenu(){click(GoogleSubMenuBtn);LOG.info("Click on google in dropdown Performed");}
    public void ClickOnUnlockedSubMenu(){click(UnlockedPhones);LOG.info("Click on unlocked in dropdown Performed");}
    public void ScrollToViewAllUnlockPhones(WebDriver driver){ScrollToView(AllUnlockedPhonesBtn,driver);LOG.info("Scroll to view all unlocked Phones Performed");}

    public void ScrollToViewMoreUnlockedApple(WebDriver driver){ScrollToView(UnlockedIphonesTitle,driver);LOG.info("Scroll to view More Unlocked Apple Performed");}
    public void ScrollToViewUnlockedOnePlus(WebDriver driver){ScrollToView(UnlockedOnePlusTitle,driver); LOG.info("Scroll to view More Unlocked One Plus Performed");}
    public void ScrollToViewUnlockedGoogle(WebDriver driver){ScrollToView(MoreUnlockedApple,driver);LOG.info("Scroll to view More Unlocked Google Performed");}
    public void ScrollToViewUnlockedSamsung(WebDriver driver){ScrollToView(UnlockedSamusngTitle,driver);LOG.info("Scroll to view More Unlocked Samsung Performed");}

    public void ClickOnMoreUnlockedOnePLus(){click(MoreUnlockedOnePlusBtn);LOG.info("Click on more unlocked  one plus Performed");}
    public void ClickOnMoreUnlockedGoogleBtn(){click(MoreUnlockedGoogleBtn);LOG.info("Click on more Unlocked google button Performed");}
    public void ClickOnMoreUnlockedSamsung(){click(MoreUnlockedSamsungBtn);LOG.info("Click on more unlocked samsung Performed");}
    public void ClickOnAllUnlockedPhonesBtn(){click(AllUnlockedPhonesBtn);LOG.info("Click on all unlocked phones button Performed");}
    public void ClickOnMoreUnlockedApple(){click(MoreUnlockedApple);LOG.info("Click on more unlocked apple Performed");}















}
