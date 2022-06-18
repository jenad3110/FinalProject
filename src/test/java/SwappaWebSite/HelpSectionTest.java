package SwappaWebSite;

import SwaggaPages.HelpSectionPage;
import SwaggaPages.HomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class HelpSectionTest extends CommonAPI {



    @Test
    public void SubmitHelpRequest(){

        HelpSectionPage helpSectionPage = new HelpSectionPage(getDriver());
        helpSectionPage.SubmitHelpRequestInHelpSection();


    }


    @Test
    public void EmailHelpSwappa(){

        HelpSectionPage helpSectionPage = new HelpSectionPage(getDriver());
        helpSectionPage.SubmitEmailHelpSwappa();


    }


    @Test
    public void SendSupportTicket(){

        HelpSectionPage helpSectionPage = new HelpSectionPage(getDriver());
        helpSectionPage.EnterYourEmailForSupport("je@gmail.com");
        helpSectionPage.SelectFromDropDown("Selling");
        helpSectionPage.TypeYourMessage("I need some info regarding the shipping fee");
        waitFor(2);


    }













}
