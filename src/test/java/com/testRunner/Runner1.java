package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\Features", glue = { "com.stepdefinitions",
		"com.hooks" }, monochrome = false, tags = "@Smoke or @Regression", dryRun = false, publish = false, plugin = {
				"pretty" })
// plugin= {"pretty","html:test-output",
//			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}) 
public class Runner1 {

}
