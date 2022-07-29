Feature: US0001 kullanici hesap acip alis veris yapip hesabi geri kapatabilmeli
  @alisveris
  Scenario: TC01 kullanici hesap acip alis veris yapip hesabi geri kapatabilmeli


    Given kullanici "http://automationexercise.com" anasayfasinda
    And Ana sayfanın başarıyla görünür olduğunu doğrulayın
    And Kayıt Ol / Giriş Yap düğmesini tıklayın
    And Kayıt bölümündeki tüm ayrıntıları doldurun ve hesap oluşturun
    And HESAP OLUŞTURULDU! seçeneğini doğrulayın ve Devam düğmesini tıklayın
    And En üstte Kullanıcı adı olarak oturum açıldı seçeneğini doğrulayın
    And Sepete ürün ekleyin
    And Sepet düğmesini tıklayın
    And Sepet sayfasının görüntülendiğini doğrulayın
    And Ödemeye Devam Et'e tıklayın
    And Adres Ayrıntılarını Doğrulayın ve Siparişinizi İnceleyin
    And Açıklama metin alanına açıklama girin ve Sipariş Ver'i tıklayın
    And Ödeme ayrıntılarını girin: Karttaki Ad, Kart Numarası, CVC, Son Kullanma tarihi
    And Öde ve Siparişi Onayla düğmesine tıklayın
    And Başarı mesajını doğrulayın Siparişiniz başarıyla verildi!
    And Hesabı Sil düğmesini tıklayın
    And HESAP SİLİNDİ! seçeneğini doğrulayın. ve Devam düğmesini tıklayın
    Then sayfayi kapatir