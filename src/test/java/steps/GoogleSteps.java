package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^I am on the Google search page$")
    public void navigateToGoogle() {
        google.navigateToGoogle();

    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria() {
        google.enterSearchCriteria("Sara");//aca se llama el metodo enterSearchCriteria de GooglePagejava
    }

    @And("^click on the search button$")
    public void clickSearchButton() {
        google.clickGoogleSearch();
    }

    @Then("^the results match the criteria$")
    public void validateResults() {
    }

}