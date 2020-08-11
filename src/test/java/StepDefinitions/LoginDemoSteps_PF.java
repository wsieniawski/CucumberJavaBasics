package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageFactory.LoginPage_PF;
import pages.ExampleTestProjectLoginPage;
import pages.HomePage_PF;

public class LoginDemoSteps_PF {

	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("browser is open")
	public void browser_is_open() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://example.testproject.io/web");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);

		Thread.sleep(2000);

	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		login.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		home.checkLogoutIsDisplayed();

		Thread.sleep(2000);

		driver.close();
		driver.quit();
	}



}
