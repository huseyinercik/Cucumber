package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinitions {
    Workbook workbook;

    @Given("kullanici excel dosyasini kullanilabilir hale getirir")
    public void kullanici_excel_dosyasini_kullanilabilir_hale_getirir() throws IOException {
        String dosyaYolu="src/test/resources/ulkeler (1).xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        workbook= WorkbookFactory.create(fis);

    }
    @Then("{int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdaki_hucreye_yazdirir(Integer satir, Integer sutun) {
        String istenenHucreYazisi=workbook
                .getSheet("sayfa1")
                .getRow(satir-1)
                .getCell(sutun-1)
                .toString();
        System.out.println(satir+" .satir " + sutun+" .sutundaki deger "+ istenenHucreYazisi);
    }
    @Then("baskenti Jakarta olan ulke ismini yazdirir")
    public void baskenti_jakarta_olan_ulke_ismini_yazdirir() {
        //for loop ile tum satirlari kontrol etmem gerekiyor
        //bunun icinde satir sayisaina ihtiyacim var
        int satirSayisi=workbook.getSheet("sayfa1").getLastRowNum();

        for (int i = 0; i <=satirSayisi ; i++) {
            if (workbook.getSheet("sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")){

            }

        }
    }
    @Then("Ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer int1) {

    }
    @Then("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer int1) {

    }


}
