Feature: US0002 home work

  @homework
  Scenario:home work
    Given kullanici "herokuappUrl" anasayfasinda
    Then add element butonuna 100 kere basar
    Then kullanici 3 sn bekler
    Then random sayı kadar delete tıkla
    Then kullanici 3 sn bekler
    Then  kalan delete sayisini dogrula
    And sayfayi kapatir

  #"Eleman Ekle" düğmesine 100 kez tıklayın,
  #bir sayı alan bir işlev yazın ve verilen sayıda "Sil" düğmesini tıklayın ve
  #ardından verilen sayıda düğmenin silindiğini doğrular