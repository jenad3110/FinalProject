package SwaggaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends CommonAPI {

    public MenuPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#primaryNav > nav > div > div > div:nth-child(1) > ul > li:nth-child(1) > a > i")
    WebElement Menu;
    @FindBy(css = "#slide_menu > div.offcanvas-body > div:nth-child(2) > a:nth-child(6)")
    WebElement ForumsSection;




    public void AccessForumSection() {

        click(Menu);
        click(ForumsSection);

    }








}
