package com.fb.testr;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/cucumberreport","html:target/htmlreport"},
features= {"src//test//resources//FeatureCollection"},
glue= {"com.fb.steps"},
tags= {"@SmokeTest"})

public class TestRunner {

}
