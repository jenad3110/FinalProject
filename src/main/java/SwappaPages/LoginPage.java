package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class LoginPage extends CommonAPI {


    public LoginPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    private final Logger LOG = LoggerFactory.getLogger(LoginPage.class);


    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(1) > a > i")
    WebElement loginLogoInHomePage;

    @FindBy(css = "#id_username_oc")
    WebElement username;

    @FindBy(css = "#id_password_oc")
    WebElement Password;

    @FindBy(css = "#offcanvasFormLogin > button")
    WebElement Login;

    @FindBy(css = "#slide_login > div.offcanvas-body > div.mt-3 > a > span")
    WebElement GoogleLogo;


    @FindBy(css = "#slide_login > div.offcanvas-body > div.row.row-cols-2.mt-5 > div:nth-child(1) > a")
    WebElement ForgotPasswordBtn;

    @FindBy(css = "#slide_login > div.offcanvas-body > div.text-center.mt-4 > a")
    WebElement LoginPageBtn;

    @FindBy(css = "#slide_login > div.offcanvas-header > button")
    WebElement CloseTheLoginpage;
    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(1) > ul > li:nth-child(1) > a > i")
    WebElement Menu;
    @FindBy(css = "#id_username_oc")
    WebElement EmailAdress;
    @FindBy(css = "#id_password_oc")
    WebElement Pass;

    @FindBy(css = "#slide_menu > div.offcanvas-body > div.row.row-cols-2.mb-3 > div:nth-child(1) > a")
    WebElement LoginBtnFromMenuDropDown;
    @FindBy(css = "#id_password_oc-error")
    WebElement ErrorUsernameOfPass;

    @FindBy(css = "#section_main > h2")
    WebElement LoginForAssertInNewPage;


    public void ClickLoginBtnDropDownMenu() {

        click(Menu);
        LOG.info("Click Menu Performed");
        click(LoginBtnFromMenuDropDown);
        LOG.info("Click Login Button From Drop Down Menu Performed");

    }


    public void ClickOnLoginLoGoInHomePage() {click(loginLogoInHomePage);LOG.info("Click On Login Logo In Home Page Performed");}

    public void EnterEmailAndPassword(String Email,String Pass){

    type(username,Email);
    type(Password,Pass);
    LOG.info("Email And Password Entered");

    }

    public void ClickOnLogin(){
        click(Login);
        LOG.info("Click Login Performed");
    }

    public String GetErrorLogintext(){return getElementText(ErrorUsernameOfPass);}


    public void HoverOverGoogleLogo(WebDriver driver)

    {
        ClickOnLoginLoGoInHomePage();
        waitForAnElementTobeVisible(GoogleLogo,driver);
        hoverOver(driver,GoogleLogo);
        LOG.info("Hover Over Google Logo Performed");

    }

    public boolean GoogleLoGoButtonTest(){
       return isInteractable(GoogleLogo);
    }

    public void ClickOnLoginPAgeAtBottomOfThePage(){

        ClickOnLoginLoGoInHomePage();
        click(LoginPageBtn);
        LOG.info("Click On Login Page Performed");



    }


    public void ClickOnForgotPasswordbtn(){

        ClickOnLoginLoGoInHomePage();
        click(ForgotPasswordBtn);
        LOG.info("Click On Forgot Password Performed");


    }
    public void SwitchToLoginPage(WebDriver driver){
        driver.getWindowHandle();
        LOG.info("New Window Opened");
    }

    public String AssertInLoginPage(){
        return getElementText(LoginForAssertInNewPage);
    }

    public void ExplicitlyWaitForNewPageToLoad(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Login - Swappa"));
    }


































}
