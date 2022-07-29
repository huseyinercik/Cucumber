package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuPage;

import java.util.Random;

public class HomeWorkStepDefinitions {
    HerokuPage herokuPage = new HerokuPage();
    int rast = (int) (Math.random()*100);
    @Then("add element butonuna {int} kere basar")
    public void addElementButonunaKereBasar(int tıkSayısı) {
        for (int i = 0; i < tıkSayısı; i++) {
            herokuPage.addElement.click();
        }
    }
    @Then("random sayı kadar delete tıkla")
    public void randomSayıKadarDeleteTıkla() {
        System.out.println("rastgele secilen sayi: " + rast);
        for (int i = 0; i < rast; i++) {
            herokuPage.delete.click();
        }
    }
    @Then("kalan delete sayisini dogrula")
    public void kalanDeleteSayisiniDogrula() {
        System.out.println(herokuPage.deleteListesi.size());
        int actual = herokuPage.deleteListesi.size();
        int expected = 100-rast;
        Assert.assertTrue(actual==expected);
    }
}
