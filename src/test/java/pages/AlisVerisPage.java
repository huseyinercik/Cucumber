package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlisVerisPage {
    public AlisVerisPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//img[@alt=\"Uygulama otomasyonu için web sitesi\"]")
    public WebElement logo;

    @FindBy(xpath = "//*[text()='Kayıt Ol Giriş yap']")
    public WebElement girisKaydolButonu;

    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement isimKutusu;
}
