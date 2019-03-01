package com.automation.org.CucumberNewProject.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Incorrectdata{
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement SignIN;
	
	@FindBy(name="email_create")
	WebElement EmailCreate;
	
	@FindBy(name="SubmitCreate")
	WebElement Submitbutton;
	
	public Incorrectdata(WebDriver driver6) {
		driver=driver6;
		PageFactory.initElements(driver,this);
	}

	public void wronge()
	{
		SignIN.click();
		EmailCreate.sendKeys("roshni@gmail.com");
		Submitbutton.click();
	}
}
