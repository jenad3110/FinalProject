package SwappaWebSite;

import SwaggaPages.HomePage;
import SwaggaPages.LoginPage;
import SwaggaPages.SellPage;
import base.CommonAPI;
import org.apache.commons.logging.Log;
import org.testng.annotations.Test;

public class LoginPageTest extends CommonAPI {


        @Test
        public void TestingLoginFunctionality2(){

            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.ClickOnLoginLoGoInHomePage();
            loginPage.EnterEmailAndPassword("jenad.mo@gmail.com","dddjdjdjdjd");


        }



        @Test
        public void LoginUsingEmptyValueInPassword(){

            LoginPage login = new LoginPage(getDriver());
            login.ClickOnLoginLoGoInHomePage();
            login.EnterEmailAndPassword("mo@gmail.com","");
            waitFor(2);



        }
        @Test
        public void LoginUsingInvalidPassword(){

            LoginPage login = new LoginPage(getDriver());
            login.ClickOnLoginLoGoInHomePage();
            login.EnterEmailAndPassword("sr@gmail.com","ggsgsgss");
            waitFor(10);


        }

        @Test
        public void LoginUsing$$$InPassword(){

            LoginPage login = new LoginPage(getDriver());
            login.ClickOnLoginLoGoInHomePage();
            login.EnterEmailAndPassword("sr@gmail.com","$$$$$$$$$$$$$");

            waitFor(5);



        }




        @Test
        public void AccessLoginPageTest(){

            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.ClickOnLoginLoGoInHomePage();


        }


        @Test
        public void hoverOverLoginWithGoogleLogo(){


            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.HoverOverGoogleLogo(getDriver());
        }

        @Test
        public void clickOnLoginPageAtTheBottomofTheLoginPage() {
            LoginPage loginPage = new LoginPage(getDriver());

            loginPage.ClickOnLoginPAgeOnBottomOfThePage();

        }

        @Test
            public void clickOnForgotPasswordBtn(){
                LoginPage loginPage = new LoginPage(getDriver());
                loginPage.ClickOnForgotPasswordbtn();
            }

        @Test
            public void ClickLoginFromDropDownMenu(){

            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.ClickloginFromDropDownMenu();
        }



















}
