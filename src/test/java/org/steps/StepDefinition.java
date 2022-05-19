package org.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {


	@Given("User must launch the Facebook url")
	public static void user_must_launch_the_Facebook_url() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
		browserLaunch("https://www.facebook.com/");
		
	}

	@When("User enters the correct username {string}and correct password {string}")
	public void user_enters_the_correct_username_and_correct_password(String string, String string2) {
	   FacebookHomePage a = new FacebookHomePage();
	   enterText(a.getUsername(), string);
	   enterText(a.getPassword(), string2);
		
	}


	@And("User clicks on the login button")
	public static  void user_clicks_on_the_login_button() {
		//driver.findElement(By.name("login")).click();
		FacebookHomePage b = new FacebookHomePage();
		buttonClick(b.getLogin());

	}

	@Then("User validates url is navigated to Home Page")
	public static void user_validates_url_is_navigated_to_Home_Page() {
		boolean contains = driver.getTitle().contains("Facebook");
		Assert.assertTrue(contains);
		System.out.println("Facebook validation");
	}

}
