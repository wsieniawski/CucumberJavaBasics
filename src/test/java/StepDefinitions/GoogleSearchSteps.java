package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		driver.get("https://google.com");
//	}
//
//	@When("user enters the text in search box")
//	public void user_enters_the_text_in_search_box() throws InterruptedException {
//		driver.findElement(By.name("q")).sendKeys("Sunset");
//		Thread.sleep(3000);
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println("User is navigated to search results");
//		driver.getPageSource().contains("Obrazy dla sunset");
//		driver.close();
//		driver.quit();
//	}
//
}
