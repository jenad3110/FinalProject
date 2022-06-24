package SwappaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RunPage extends CommonAPI {

    public RunPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    //private final Logger LOG = LoggerFactory.getLogger(AddToCartPage.class);



    @FindBy(className = "btn-primary btn-test")
    WebElement BlueButton;





    public  void ClickONBlueButton(){
        click(BlueButton);

    }

    public boolean ButtonIsClickable() {
        return isPresent(BlueButton);
    }





    }













