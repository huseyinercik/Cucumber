package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTableStepDefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButonu.click();
    }

    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstName) {
        dataTablesPage.firstName.sendKeys(firstName);
    }

    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastName) {
        dataTablesPage.lastName.sendKeys(lastName);
    }

    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @Then("office bolumune {string} yazar")
    public void office_bolumune_yazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        dataTablesPage.extn.sendKeys(extension);
    }

    @Then("starDate bolumune {string} yazar")
    public void star_date_bolumune_yazar(String starDate) {
        dataTablesPage.startDate.sendKeys(starDate);
    }

    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.create.click();
    }

    @When("kullanici {string} arama yapar")
    public void kullanici_arama_yapar(String firstName) {
        dataTablesPage.search.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu test eder")
    public void isim_bolumunde_oldugunu_test_eder(String firstName) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstName));
    }

}
