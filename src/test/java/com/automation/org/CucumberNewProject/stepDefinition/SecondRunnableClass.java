package com.automation.org.CucumberNewProject.stepDefinition;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.Plugin;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions
(
		features="FeatureFolder/SecondLogin.feature",
		glue="com.automation.org.CucumberNewProject.stepDefinition",
		plugin= {"pretty:STDOUT","html:target/HTMLCucuReport2","json:target/Cucumber2.json"},
		monochrome=true
		)

public class SecondRunnableClass extends AbstractTestNGCucumberTests{
	@Test
	public void second()
	{
		
	}
	
}
