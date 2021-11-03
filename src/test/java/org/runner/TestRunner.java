package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",dryRun=false,monochrome=true,strict=false,
snippets=SnippetType.CAMELCASE,plugin= {"usage"})
public class TestRunner {
	
	

}
