Feature: US1010 herkuapp Delete testi

  @heroku @sirali
  Scenario: TC15 herokuapp dan delete butonu calismali
    Given kullanici "herokuappUrl" anasayfasinda
    And add element butonuna basar
    Then Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basar
    And Delete butonunun gorunmedigini test eder
    And sayfayi kapatir

