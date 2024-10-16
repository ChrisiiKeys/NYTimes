package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features = "src//test//resources//",
		glue = "org.stepdefinition",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:src\\test\\resources\\Reports\\HtmlReport"}
		
		
		
		
		)
public class TestRunner {

}
