package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class AmazonStepDefinition {
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("https://amazon.com");
    }
    @Given("iphone icin arama yapar")
    public void iphone_icin_arama_yapar() {

    }
    @Then("sonuclari bakar")
    public void sonuclari_bakar() {

    }
    @Given("tea pot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {

    }
    @Then("sonuclari test eder")
    public void sonuclari_test_eder () {

        }


}
