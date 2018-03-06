package stepDefinition;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runnerPackage.testRunner;

public class stepDefinition extends testRunner {

	WebElement search_box;
	@Given("^I navigate to google home page$")
	public void i_navigate_to_google_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("http://google.com");
	}

	@When("^I enter a keyword to search$")
	public void i_enter_a_keyword_to_search() {
	    // Write code here that turns the phrase above into concrete actions
		  search_box = driver.findElement(By.name("q"));
		  search_box.sendKeys("porsche");
	}

	@When("^I click on search button$")
	public void i_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		search_box.sendKeys(Keys.ENTER);
	}

	@Then("^I should be able to see a title contains a keyword$")
	public void i_should_be_able_to_see_a_title_contains_a_keyword() {
	    // Write code here that turns the phrase above into concrete actions
		  Assert.assertTrue(driver.getTitle().contains("porsche"));
		  driver.quit();
	}
	
}
