package com.itview.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		
		features = {"Feature/calculatorDataDriven.feature"},
	    glue= {"com.itview.stepdefinition"},
	    plugin = {"pretty","html:target/cucumber-report.html"},	    
	    tags = "@DataDriven"
		
		)



public class TestRunner {

}
