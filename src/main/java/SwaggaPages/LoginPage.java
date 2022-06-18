package SwaggaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {


    public LoginPage(WebDriver driver) {PageFactory.initElements(driver, this);}


   // @FindBy(css = "#slide_menu > div.offcanvas-body > div.row.row-cols-2.mb-3 > div:nth-child(1) > a")
    //WebElement loginInMenuBtn;
    //#primaryNav > nav > div > div > div:nth-child(3) > ul > li:nth-child(1) > a > i

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

    public void ClickloginFromDropDownMenu() {

        click(Menu);
        click(LoginBtnFromMenuDropDown);
       waitFor(2);


    }


    //-----------------------------------------------------------------------------------------------//

    public void ClickOnLoginLoGoInHomePage() {click(loginLogoInHomePage);}


    public void EnterEmailAndPassword(String Email,String Pass){

    type(username,Email);
    type(Password,Pass);
    waitFor(2);
    click(Login);

    }

    public void HoverOver(WebDriver driver) {

        click(Login);
    }

    public void HoverOverGoogleLogo(WebDriver driver)

    {
        ClickOnLoginLoGoInHomePage();
        waitFor(2);
        hoverOver(driver,GoogleLogo);
        waitFor(3);
    }

    public void ClickOnLoginPAgeOnBottomOfThePage(){

        ClickOnLoginLoGoInHomePage();
        waitFor(2);
        click(LoginPageBtn);
        waitFor(2);


    }


    public void ClickOnForgotPasswordbtn(){

        ClickOnLoginLoGoInHomePage();
        waitFor(2);
        click(ForgotPasswordBtn);
        waitFor(2);


    }

    public void TestLoginFunctionnality(){

        ClickOnLoginLoGoInHomePage();
        waitFor(2);




    }

































}
