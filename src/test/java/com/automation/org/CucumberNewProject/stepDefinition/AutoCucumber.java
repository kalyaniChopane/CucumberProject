package com.automation.org.CucumberNewProject.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoCucumber {
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement SignIN;
	
	@FindBy(name="email_create")
	WebElement EmailCreate;
	
	@FindBy(name="SubmitCreate")
	WebElement Submitbutton;
	
	public AutoCucumber(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public void signCucumber()
	{
		SignIN.click();
		EmailCreate.sendKeys("smitajas@gmail.com");
		Submitbutton.click();
	}

}
