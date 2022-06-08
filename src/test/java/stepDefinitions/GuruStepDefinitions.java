package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage = new GuruPage();

    @Given("kullanici {string}, sutunundaki tum degerleri yazdirir")
    public void kullanici_sutunundaki_tum_degerleri_yazdirir(String istenensutun) {
        List<WebElement> tabloBaslkListesi = guruPage.baslıkListesi;
        //listemiz WebElementlerden olusuyor
        // dolasıyla bu Webelementleden hangisi istenen sutun başlıgını tasıyor bilemeyiz
        int istenenBaslikIndexi = -3; // indextekinin nearif olma ihitmali yok, eger bulduysa -3 değildir.
        for (int i = 0; i < tabloBaslkListesi.size(); i++) {
            if (tabloBaslkListesi.get(i).getText().equals(istenensutun)) {
                istenenBaslikIndexi = i + 1;
                break;
            }
        }
        // for loop ile tüm sutun baslıklarını bana verilen istenen sutun değeri ile karşılastırdım
        // loop bittiğinde baslıgın bulunup bulunmadıgını kontrol etmek ve
        // bulundu ise yoluma devam etmek istiyorum
        if (istenenBaslikIndexi != -3) { // -3 e eşit değilse baslık bulundu.
            List<WebElement> istenenSutundakiElementler = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + istenenBaslikIndexi + "]"));
            for (WebElement each : istenenSutundakiElementler) {
                System.out.println(each.getText());
            }
        } else { // baslık bulunamadı ise;
            System.out.println("istenen baslık bulunmadı");
        }

    }


}
