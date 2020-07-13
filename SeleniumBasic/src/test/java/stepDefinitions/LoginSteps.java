package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user opens login page")
	public void user_opens_login_page() {
		System.out.println("Inside Step User Open Login Page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step user enters username and password");
	}

	@When("clicks login button")
	public void clicks_login_button() {
		System.out.println("Inside Step clicks login button");
	}

	@Then("user is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Inside Step user is navigated to Home page");
	}


}
