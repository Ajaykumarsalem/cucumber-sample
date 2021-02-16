package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps {
	
	WebDriver d=null;

	@Given("user has to launch chrome and hit the FB url")
	public void user_has_to_launch_chrome_and_hit_the_FB_url() {
	 
	   d.get("https://www.facebook.com/");
	}

	@When("user has to enter the username and password")
	public void user_has_to_enter_the_username_and_password(io.cucumber.datatable.DataTable data) {
	    List<String> asList = data.asList();
		WebElement user = d.findElement(By.id("email"));
	   user.sendKeys(asList.get(1));
	   WebElement pass = d.findElement(By.id("pass"));
	   pass.sendKeys(asList.get(0));  
	}

	@When("click the login button")
	public void click_the_login_button() {
		 WebElement loginBtn = d.findElement(By.id("u_0_b"));
		 loginBtn.click();
	}

	@Then("user unable to enter the home page")
	public void user_unable_to_enter_the_home_page() {
	    
	}
	
	@When("user has to click the forget password link")
	public void user_has_to_click_the_forget_password_link() {
	   d.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

	@When("user has to enter the mobile number")
	public void user_has_to_enter_the_mobile_number() {
	    d.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("9652852852");
	}

	@When("click the search button")
	public void click_the_search_button() {
	   d.findElement(By.xpath("(//button[@id='did_submit'])")).click();
	}

	@Then("user unable to navigate the OTP page")
	public void user_unable_to_navigate_the_OTP_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user has to enter the {string} and {string}")
	public void user_has_to_enter_the_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();

}
}