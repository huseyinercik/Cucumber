Feature: US1011 web tablosundaki istenen sutunu yazdirma
  @guru
  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli
  sayfasina gidelim

    Given kullanici "guruUrl" anasayfasinda
    And kullanici "Company", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir
