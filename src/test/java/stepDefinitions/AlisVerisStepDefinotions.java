package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AlisVerisPage;
import utilities.Driver;

public class AlisVerisStepDefinotions {
    AlisVerisPage alisveris=new AlisVerisPage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Given("Ana sayfanın başarıyla görünür olduğunu doğrulayın")
    public void ana_sayfanın_başarıyla_görünür_olduğunu_doğrulayın() {
        Assert.assertTrue(alisveris.logo.isDisplayed());
    }
    @Given("Kayıt Ol \\/ Giriş Yap düğmesini tıklayın")
    public void kayıt_ol_giriş_yap_düğmesini_tıklayın() {
        alisveris.girisKaydolButonu.click();
    }
    @Given("Kayıt bölümündeki tüm ayrıntıları doldurun ve hesap oluşturun")
    public void kayıt_bölümündeki_tüm_ayrıntıları_doldurun_ve_hesap_oluşturun() {


    }
    @Given("HESAP OLUŞTURULDU! seçeneğini doğrulayın ve Devam düğmesini tıklayın")
    public void hesap_oluşturuldu_seçeneğini_doğrulayın_ve_devam_düğmesini_tıklayın() {

    }
    @Given("En üstte Kullanıcı adı olarak oturum açıldı seçeneğini doğrulayın")
    public void en_üstte_kullanıcı_adı_olarak_oturum_açıldı_seçeneğini_doğrulayın() {

    }
    @Given("Sepete ürün ekleyin")
    public void sepete_ürün_ekleyin() {

    }
    @Given("Sepet düğmesini tıklayın")
    public void sepet_düğmesini_tıklayın() {

    }
    @Given("Sepet sayfasının görüntülendiğini doğrulayın")
    public void sepet_sayfasının_görüntülendiğini_doğrulayın() {

    }
    @Given("Ödemeye Devam Et'e tıklayın")
    public void ödemeye_devam_et_e_tıklayın() {

    }
    @Given("Adres Ayrıntılarını Doğrulayın ve Siparişinizi İnceleyin")
    public void adres_ayrıntılarını_doğrulayın_ve_siparişinizi_i̇nceleyin() {

    }
    @Given("Açıklama metin alanına açıklama girin ve Sipariş Ver'i tıklayın")
    public void açıklama_metin_alanına_açıklama_girin_ve_sipariş_ver_i_tıklayın() {

    }
    @Given("Ödeme ayrıntılarını girin: Karttaki Ad, Kart Numarası, CVC, Son Kullanma tarihi")
    public void ödeme_ayrıntılarını_girin_karttaki_ad_kart_numarası_cvc_son_kullanma_tarihi() {

    }
    @Given("Öde ve Siparişi Onayla düğmesine tıklayın")
    public void öde_ve_siparişi_onayla_düğmesine_tıklayın() {

    }
    @Given("Başarı mesajını doğrulayın Siparişiniz başarıyla verildi!")
    public void başarı_mesajını_doğrulayın_siparişiniz_başarıyla_verildi() {

    }
    @Given("Hesabı Sil düğmesini tıklayın")
    public void hesabı_sil_düğmesini_tıklayın() {

    }
    @Given("HESAP SİLİNDİ! seçeneğini doğrulayın. ve Devam düğmesini tıklayın")
    public void hesap_si̇li̇ndi̇_seçeneğini_doğrulayın_ve_devam_düğmesini_tıklayın() {

    }




}
