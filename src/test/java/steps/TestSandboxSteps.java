package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class TestSandboxSteps {
    TestSandboxSteps sandboxPage = new TestSandbox();

    @Given("^I navigate to the sandbox page$")
    public void navigateToTheSandboxsite(){
        sandboxPage.navigateToTheSandboxsite();
    }

    @And("^select a value from the dropwdown$")
    public void selectState(){
        sandboxPage.selectCategory("Manual");
    }
}
