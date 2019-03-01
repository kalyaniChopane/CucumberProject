package com.automation.org.CucumberNewProject.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InfoCucumber {
		WebDriver driver;
		
		@FindBy(name="customer_firstname")
		WebElement FirstName;
		
		@FindBy(name="customer_lastname")
		WebElement LastName;
		
		@FindBy(id="passwd")
		WebElement Password;
		
		@FindBy(name="days")
		WebElement Days;
		
		@FindBy(name="months")
		WebElement Months;
		
		@FindBy(name="years")
		WebElement Years;
		
		@FindBy(id="firstname")
		WebElement againFirstName;
		
		@FindBy(id="lastname")
		WebElement againLastName;
		
		@FindBy(name="address1")
		WebElement Address;
		
		@FindBy(name="city")
		WebElement City;
		
		@FindBy(name="id_state")
		WebElement State;
		
		@FindBy(name="postcode")
		WebElement PostCode;
		
		@FindBy(name="id_country")
		WebElement Country;
		
		@FindBy(name="phone_mobile")
		WebElement PhoneNumber;
		
		@FindBy(name="alias")
		WebElement futureAdd;
		
		@FindBy(id="authentication")
		WebElement Register;
	public InfoCucumber(WebDriver driver3) {
			driver=driver3;
			PageFactory.initElements(driver, this);
		}
	public void information()
	{
		FirstName.sendKeys("komalika");	
		LastName.sendKeys("hina");
		Password.sendKeys("kallu123");
		
		Select days1=new Select(Days);
		days1.selectByValue("2");
		
		Select months1=new Select(Months);
		months1.selectByValue("4");
	
		Select years1=new Select(Years);
		years1.selectByValue("2017");
		
		againFirstName.sendKeys("nicks");
		againLastName.sendKeys("jonhs");
		Address.sendKeys("koregaopark");
		City.sendKeys("pune");
		
		Select state=new Select(State);
		state.selectByVisibleText("Arizona");
		
		PostCode.sendKeys("713789");
		
		Select country=new Select(Country);
		country.selectByVisibleText("United States");
		
		PhoneNumber.sendKeys("2874028278");
		futureAdd.sendKeys("abc chowk");
		Register.click();
	}

}
