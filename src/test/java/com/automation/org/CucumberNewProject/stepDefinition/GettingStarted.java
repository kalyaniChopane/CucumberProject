package com.automation.org.CucumberNewProject.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GettingStarted {

	WebDriver driver;
	
	@Given("^I have the site$")
	public void i_have_the_site() throws Throwable {
	   System.setProperty("webdriver.chrome.driver","Resource//chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.navigate().to("http://automationpractice.com/index.php");
	   
	}

	@When("^I provide username and password$")
	public void i_provide_username_and_password() throws Throwable {
		
		AutoCucumber cucumber=new AutoCucumber(driver);
		cucumber.signCucumber();
	   
	}
	@When("^I provide data$")
	public void i_provide_data() throws Throwable {
	    
		InfoCucumber info=new InfoCucumber(driver);
		info.information();
	}
	
	@Then("^I should get logged in$")
	public void i_should_get_logged_in() throws Throwable {
		
		driver.quit();
	  
	}
	@When("^I provide incorrect Username$")
	public void i_provide_incorrect_Username() throws Throwable {
		
		Incorrectdata incorect=new Incorrectdata(driver);
		incorect.wronge();
	    
	}

	@Then("^I should not get Logged In$")
	public void i_should_not_get_Logged_In() throws Throwable {
	    driver.quit();
	}

	
}
