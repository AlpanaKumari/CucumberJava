package test.java.cucumberjvm;


import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class StepDefinitions {
	private Belly belly;
    private int waitingTime;

    @Given("^I have (\\d+) cukes in my shop$")
    public void i_have_cukes_in_my_shop(int cukes) throws Throwable {
        belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int waitingTime) throws Throwable {
        this.waitingTime = waitingTime;
    }

    @Then("^my cukes get (.*)$")
    public void my_cukes_get_out_of_stock(String expectedResult) throws Throwable {
        String actualResult = belly.getResult(waitingTime);
        assertThat(actualResult, is(expectedResult));
    }
    
}