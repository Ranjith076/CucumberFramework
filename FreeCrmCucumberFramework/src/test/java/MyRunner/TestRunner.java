package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Ranjith\\eclipse-workspace\\FreeCrmCucumberFramework\\Features\\login.feature", // to locate the path/location of feature files
				 glue= {"step_def"},  // to locate the path/location of Step Definition files
				 format= {"pretty","html:test-outout",
						 "json:json_output/cucumber.json", 
						 "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
				 monochrome=true, // to print the console output in a readable format
				 strict = true, //it will check if any step is not defined in step definition file
				 dryRun = true //to check the mapping is proper between feature file and step def file
				 )
				// plugin= {"html:target/cucmber-html-report"})
public class TestRunner {

}
