package com.dice.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { "html:target/cucumber-reports", "json:target/cucumber.json","junit:target/cucumber.xml" },

		features = "./src/test/resources/features",

		glue = "com/dice/step_definations",

		tags = "@smoke",

		// monochrome=true,
	//added demo

		dryRun = false

)

public class CukesRunner {

}
