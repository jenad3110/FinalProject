package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelpSectionPage extends CommonAPI {

    public HelpSectionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    private final Logger LOG = LoggerFactory.getLogger(AddToCartPage.class);


    @FindBy(css = "#slide_help > div.offcanvas-body > a.btn.btn-outline-help")
    WebElement SubmitHelpRequestBtn;
    @FindBy(css = "#slide_help > div.offcanvas-body > a.btn.btn-outline-primary")
    WebElement EmailHelpSwappaBtn;
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(1) > ul > li:nth-child(2) > a > i")
    WebElement Help;
    @FindBy(css = "#id_email")
    WebElement EmailBtnInContactSupport;
    @FindBy(css = "#id_message")
    WebElement MessageForSupport;
    @FindBy(css = "#id_subject")
    WebElement SubjectForSupportDropDown;


    public void SubmitHelpRequestInHelpSection(WebDriver driver) {

        click(Help);
        LOG.info("Help Clicked");
        waitForAnElementTobeVisible(SubmitHelpRequestBtn,driver);
        click(SubmitHelpRequestBtn);
        LOG.info(" Submit Help Request Clicked");


    }

    public void SubmitEmailHelpSwappa(WebDriver driver) {

        click(Help);
        LOG.info("Help Clicked");
        waitForAnElementTobeVisible(EmailHelpSwappaBtn,driver);
        click(EmailHelpSwappaBtn);
        LOG.info("Email Help Clicked");


    }

    public void EnterYourEmailForSupport(String Email) { type(EmailBtnInContactSupport, Email);LOG.info("Email Entered");}
    public void WaitForEmailToBEVisible(WebDriver driver){waitForAnElementTobeVisible(EmailBtnInContactSupport,driver);LOG.info("Email is Visible");}
    public void SelectFromDropDown(String Option) {   selectFromDropdown(SubjectForSupportDropDown, Option);LOG.info("Option From DropDown Selected");}
    public void TypeYourMessage(String EnterYourMessage) {    type(MessageForSupport, EnterYourMessage);LOG.info("Message For Support Selected");}



    public boolean Helpswappaisclickable() {
        return isInteractable(SubmitHelpRequestBtn);

    }

    public boolean SendEmailisInteractable() {
        return isInteractable(EmailHelpSwappaBtn);
    }

    public String  ContactSupport() {
        return getElementText(GEtTExtFRomCOntactSupport);
    }

    @FindBy(css = "#section_main > div > div.col-12.col-md-8 > h2")
    WebElement GEtTExtFRomCOntactSupport;

}
