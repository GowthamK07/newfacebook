package com.facebook;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/gowtham/eclipse-workspace/New_faceBook/src/test/resources/facebook.feature",
          glue = "com.facebook",
          plugin = {"html:target","json:target/report.json"},
          dryRun = false)
public class TestRunner {

	
	
}
