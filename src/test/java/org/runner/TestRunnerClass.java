package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.steps.GenerateReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sabas\\eclipse-workspace\\CucumberMarch\\src\\test\\resources\\FacebookLogin.feature",
dryRun=false,
glue="org.steps",
monochrome=true,
//plugin= {"html:C:\\Users\\sabas\\eclipse-workspace\\CucumberMarch\\target"}
plugin= {"json:C:\\Users\\sabas\\eclipse-workspace\\CucumberMarch\\target\\output.json"})
public class TestRunnerClass {
	
	@AfterClass
	public static void generateReport() {
		GenerateReport.generate("C:\\Users\\sabas\\eclipse-workspace\\CucumberMarch\\target\\output.json");
	}
	

}
