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
		plugin = {"pretty", "html:src\\test\\resources\\Reports\\HtmlReport.html",
				"json:src\\test\\resources\\Reports\\report.json",
				"junit:src\\test\\resources\\Reports\\Cucumber.xml"}
		
		
		
		
		)
public class TestRunner {

}
