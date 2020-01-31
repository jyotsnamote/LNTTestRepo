package testRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		System.out.println("first");

	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
		System.out.println("first");

	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
		System.out.println("first");

	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {

	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {

	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {

	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {

	}

	@Given("^open Gmail account link$")
	public void open_Gmail_account_link() throws Throwable {

	}

	@Then("^Enter information \"(.*?)\" And  \"(.*?)\"$")
	public void enter_information_And(String arg1, String arg2) throws Throwable {
		System.out.println(arg1);
		System.out.println(arg2);
	}

	

}
