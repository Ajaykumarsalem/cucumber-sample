package org.runnerTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\GREEN TECHNOLOGY\\eclipse\\CucumberIns\\src\\test\\resources\\feature\\hook.feature",glue="org.stepdefinition",monochrome=true,dryRun=false )
public class TestRunnerClass {

}
