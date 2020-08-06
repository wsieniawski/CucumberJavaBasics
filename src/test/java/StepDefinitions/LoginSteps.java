package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step - user is on login page");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Inside Step - user enters credentials");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside Step - user clicks login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step - user is on home page");
	}



}
