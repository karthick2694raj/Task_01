package org.runner;

import org.demo.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\rajka\\eclipse-workspace\\CucumberSample\\src\\test\\resources\\Feature",glue="org.demo",dryRun=false,monochrome=true,strict=false,
snippets=SnippetType.CAMELCASE,tags= {"@smoke"},plugin= {"json:C:\\Users\\rajka\\eclipse-workspace\\CucumberSample\\Report\\json Report\\priyoshop.json"})

public class RunnerClass {
	
	@AfterClass
	public static void report() {
		JVMReport.generateJvmReport("C:\\\\Users\\\\rajka\\\\eclipse-workspace\\\\CucumberSample\\\\Report\\\\json Report\\\\priyoshop.json");
        
	}

}
