package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();
    
    @Given("estoy en la página de inicio de Google")
    public void navigateToGoogle () {
        google.navigateToGoogle();
    }
    
     @When("ingresa probar en el campo de búsqueda ")
    public void escribirProbar() {
    }
    
     @Then("se muestra un resultado con el titulo probar")
    public void darleBuscar() {
    }
    
    
}