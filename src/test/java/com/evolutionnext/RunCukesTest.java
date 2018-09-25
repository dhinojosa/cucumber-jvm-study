package com.evolutionnext;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"},
        features = "src/test/resources",
        glue = "com.evolutionnext"
)
public class RunCukesTest {
}
