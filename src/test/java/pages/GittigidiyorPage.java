package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GittigidiyorPage {
    public GittigidiyorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "////a[@class=\"tyj39b-5 lfsBU\"]")
    public WebElement cookies;

    @FindBy(xpath = "////input[@placeholder=\"Keşfetmeye Bak\"]")
    public WebElement aramaKutusu;



}
