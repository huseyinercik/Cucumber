Feature: US0003 gittigidiyor
  @gittigidiyor
  Scenario: TC003 gittigidiyor
    Given kullanici "gittigidiyorUrl" anasayfasinda
    Then gittigidiyor Arama kutucuğuna "bilgisayar" kelimesi girilir
    Then Arama sonuçları sayfasından 2.sayfa açılır
    Then 2.sayfanın açıldığı kontrol edilir
    Then Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir
    Then Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır
    Then Seçilen ürün sepete eklenir.
    And  Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır
    And Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.
    And Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.