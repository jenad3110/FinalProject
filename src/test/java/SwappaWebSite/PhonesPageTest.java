package SwappaWebSite;

import base.CommonAPI;
import SwaggaPages.PhonesPage;
import org.testng.annotations.Test;

public class PhonesPageTest extends CommonAPI {

    @Test
    public void SelectUnlockedIPhone (){

        PhonesPage phonesPage = new PhonesPage(getDriver());

        phonesPage.SelectUnlockedIPhones(getDriver());

    }
   @Test
    public void SelectUnlockedSamsung(){

        PhonesPage phonesPage = new PhonesPage(getDriver());

        phonesPage.ScrollDownAndSelectUnlockedSamsung(getDriver());

    }

    @Test
    public void SelectUnlockedGoogle(){

        PhonesPage phonesPage = new PhonesPage(getDriver());

        phonesPage.ScrollDownAndSelectUnlockedGoogle(getDriver());

    }

  //@Test
    public void SelectUnlockedMotorola(){

        PhonesPage phonesPage = new PhonesPage(getDriver());

        phonesPage.ScrollDownAndSelectUnlockedMotorola(getDriver());

    }
    @Test
    public void SelectUnlockedOnePlus(){

        PhonesPage phonesPage = new PhonesPage(getDriver());

        phonesPage.ScrollDownAndSelectUnlockedOnePlus(getDriver());

    }


   // @Test
    public void SelectUnlockedLG(){

        PhonesPage phonesPage = new PhonesPage(getDriver());

        phonesPage.ScrollDownAndSelectUnlockedLG(getDriver());

    }









}
