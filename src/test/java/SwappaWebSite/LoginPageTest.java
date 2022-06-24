package SwappaWebSite;

import SwappaPages.LoginPage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LoginPageTest.class);

       // @Test
        public void TestingLoginUsingPasswordWithOnly3Characters(){

            LOG.info("     Testing Login Functionality With Only 3 Characters In Password is Processing");

            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.ClickOnLoginLoGoInHomePage();
            loginPage.EnterEmailAndPassword("jenad.mo@gmail.com","ddd");
            loginPage.ClickOnLogin();
            String ExpectedText = "Please enter at least 4 characters.";
            Assert.assertEquals(loginPage.GetErrorLogintext(),ExpectedText);
            TestPassedLOG();


        }



        //@Test
        public void LoginUsingEmptyValueInPassword(){

            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.ClickOnLoginLoGoInHomePage();
            loginPage.EnterEmailAndPassword("mo@gmail.com","");
            loginPage.ClickOnLogin();
            String ExpectedText = "This field is required.";
            Assert.assertEquals(loginPage.GetErrorLogintext(),ExpectedText);

            LOG.info("Testing Login Functionality is Processing");

            TestPassedLOG();




        }
      //  @Test
        public void LoginUsingInvalidPassword(){
            LOG.info("Testing Login Functionality is Processing");

            LoginPage login = new LoginPage(getDriver());
            login.ClickOnLoginLoGoInHomePage();
            login.EnterEmailAndPassword("sr@gmail.com","ggsgsgss");
            login.ClickOnLogin();
            //new window opened
            login.SwitchToLoginPage(getDriver());
            login.ExplicitlyWaitForNewPageToLoad(getDriver());
            String ExpectedText = "Login - Swappa";
            Assert.assertEquals(getPageTitle(),ExpectedText);



            TestPassedLOG();


        }

       // @Test
        public void LoginUsing$$$InPassword(){

            LoginPage login = new LoginPage(getDriver());
            login.ClickOnLoginLoGoInHomePage();
            login.EnterEmailAndPassword("sr@gmail.com","$$$$$$$$$$$$$");
            login.ClickOnLogin();
            login.SwitchToLoginPage(getDriver());
            login.ExplicitlyWaitForNewPageToLoad(getDriver());
            String ExpectedText = "Login to buy & sell used tech";
            Assert.assertEquals(login.AssertInLoginPage(),ExpectedText);


            TestPassedLOG();


        }



       // @Test
        public void hoverOverLoginWithGoogleLogo(){


            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.HoverOverGoogleLogo(getDriver());
            Assert.assertTrue(loginPage.GoogleLoGoButtonTest());
            TestPassedLOG();

        }

        //@Test
        public void clickOnLoginPageBtnAtTheBottomOfTheLoginPage() {
            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.ClickOnLoginPAgeAtBottomOfThePage();
            loginPage.SwitchToLoginPage(getDriver());
            String ExpectedTitle = "Login - Swappa";
            Assert.assertEquals(getPageTitle(), ExpectedTitle);
            TestGetPageTitleForLOG();

            TestPassedLOG();


        }

        @Test
            public void clickOnForgotPasswordBtn(){
                LoginPage loginPage = new LoginPage(getDriver());
                loginPage.ClickOnForgotPasswordbtn();
                String ExpectedTitle = "Password Reset - Swappa";
                Assert.assertEquals(getPageTitle(), ExpectedTitle);
                TestGetPageTitleForLOG();
                TestPassedLOG();


            }

        //@Test
            public void ClickLoginFromDropDownMenu(){

            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.ClickLoginBtnDropDownMenu();
            LOG.info("Test Passed");

            }



















}
