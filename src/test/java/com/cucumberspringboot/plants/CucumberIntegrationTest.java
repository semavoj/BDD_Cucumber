package com.cucumberspringboot.plants;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 *  CucumberIntegrationTest.class is the test entry point
 *
 *  @RunWith(Cucumber.class) annotation is used to instruct Junit to have Cucumber functionality.
 *
 * @CucumberOptions annotation enables the same options as in cucumber jvm command line,
 * similar to using the following feature options: to specify feature path,
 * glue option to specify step definition path, tags option for running specific tags,
 * Plugin option for generating report specific format such as html, json etc.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/plants/",
        glue = {"com.cucumberspringboot.plants.stepDefinitions",
                "com.cucumberspringboot.plants.configuration"},
        dryRun = false,
        plugin = {"pretty", "html:target/plants/cucumber-html-report.html",
                "json:target/plants/cucumber.json",
                "rerun:target/plants/cucumber-api-rerun.txt"
        })
public class CucumberIntegrationTest {
}

