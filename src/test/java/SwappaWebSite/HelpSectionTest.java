package SwappaWebSite;

import SwappaPages.AddToCartPage;
import SwappaPages.HelpSectionPage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpSectionTest extends CommonAPI {


    private final Logger LOG = LoggerFactory.getLogger(AddToCartPage.class);


    @Test
    public void SubmitHelpRequest(){

        LOG.info("Submit Help Request Test Is Processing");
        HelpSectionPage helpSectionPage = new HelpSectionPage(getDriver());
        helpSectionPage.SubmitHelpRequestInHelpSection(getDriver());
        Assert.assertTrue(helpSectionPage.Helpswappaisclickable());
        LOG.info("Test Passed");

    }


   @Test
    public void EmailHelpSwappa(){

        LOG.info("Email Help Swappa Test Is Processing");

        HelpSectionPage helpSectionPage = new HelpSectionPage(getDriver());
        helpSectionPage.SubmitEmailHelpSwappa(getDriver());
        Assert.assertTrue(helpSectionPage.SendEmailisInteractable());
        LOG.info("Assertion Passed");
        LOG.info("Test Passed");


    }


    @Test
    public void SendSupportTicket(){

        LOG.info("Send Support Ticket Test Is Processing");

        HelpSectionPage helpSectionPage = new HelpSectionPage(getDriver());

        helpSectionPage.SubmitHelpRequestInHelpSection(getDriver());
        helpSectionPage.WaitForEmailToBEVisible(getDriver());
        helpSectionPage.EnterYourEmailForSupport("je@gmail.com");
        helpSectionPage.SelectFromDropDown("Selling");
        helpSectionPage.TypeYourMessage("I need some info regarding the shipping fee");
        String ExpectedText="Contact our support team";
        Assert.assertEquals(helpSectionPage.ContactSupport(),ExpectedText);
        LOG.info("Test Passed");
    }













}
