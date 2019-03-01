package com.automation.org.CucumberNewProject.stepDefinition;


import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions
(
		features="FeatureFolder/Login.feature",
		glue="com.automation.org.CucumberNewProject.stepDefinition",
		plugin  = {"pretty:STDOUT","html:target/HTMLCucumberReport1","json:target/Cucumber1.json"},
		tags="@regression"
)
public class FirstRunnableClass extends AbstractTestNGCucumberTests {
	@Test
	public void first()
	{
		
	}
}
