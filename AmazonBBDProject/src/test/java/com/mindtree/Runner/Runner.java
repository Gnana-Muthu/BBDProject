package com.mindtree.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",
		glue={"com.mindtree.StepDefinitions"},
		dryRun=false,
		monochrome=true,
		strict=true
		)


public class Runner {
	
}
