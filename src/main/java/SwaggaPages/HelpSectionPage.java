package SwaggaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpSectionPage extends CommonAPI {

    public HelpSectionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }






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

    public void SubmitHelpRequestInHelpSection() {

        click(Help);
        click(SubmitHelpRequestBtn);
        waitFor(3);


    }

    public void SubmitEmailHelpSwappa() {

        click(Help);
        click(EmailHelpSwappaBtn);
        waitFor(3);

    }

    public void EnterYourEmailForSupport(String Email) {  SubmitHelpRequestInHelpSection();type(EmailBtnInContactSupport, Email);}

    public void SelectFromDropDown(String Option) {   selectFromDropdown(SubjectForSupportDropDown, Option);}

    public void TypeYourMessage(String EnterYourMessage) {    type(MessageForSupport, EnterYourMessage);}







}
